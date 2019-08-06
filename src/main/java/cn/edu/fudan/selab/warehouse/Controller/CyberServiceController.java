package cn.edu.fudan.selab.warehouse.Controller;

import cn.edu.fudan.selab.warehouse.Service.Command;
import cn.edu.fudan.selab.warehouse.Service.CyberServiceService;
import cn.edu.fudan.selab.warehouse.Utils.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//@Controller
@RequestMapping("/cyberservice")
public class CyberServiceController {

    @Autowired
    CyberServiceService cyberServiceService;
    @Autowired
    Command command;

    @RequestMapping(value = "queryCyberServiceById", method = RequestMethod.POST)
    @ResponseBody
    public void queryCyberServiceById(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "queryCyberServiceById", method = RequestMethod.POST)
    @ResponseBody
    public void queryCyberServiceByType(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "listCyberService", method = RequestMethod.POST)
    @ResponseBody
    public void listCyberService(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "uploadCyberService", method = RequestMethod.POST)
    @ResponseBody
    public void uploadCyberService(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "downloadCyberService", method = RequestMethod.POST)
    @ResponseBody
    public void downloadCyberService(HttpServletRequest request, HttpServletResponse response) {
        String filename = request.getParameter("filename");
        String filePath = cyberServiceService.downloadCyberServiceById(filename);
        command.exeCmd(Parameters.KUBECTL_CMD + filePath);

    }

}
