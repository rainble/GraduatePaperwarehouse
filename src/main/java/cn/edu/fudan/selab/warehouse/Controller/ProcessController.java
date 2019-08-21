package cn.edu.fudan.selab.warehouse.Controller;

import cn.edu.fudan.selab.warehouse.Domain.Process;
import cn.edu.fudan.selab.warehouse.Service.ProcessService;
import cn.edu.fudan.selab.warehouse.Utils.HttpRequest;
import cn.edu.fudan.selab.warehouse.Utils.Parameters;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    ProcessService processService;

    @RequestMapping(value = "queryById", method = RequestMethod.POST)
    @ResponseBody
    public String queryProcessById(HttpServletRequest request, HttpServletResponse response) {
        int processId = Integer.valueOf(request.getParameter("processId"));
        Process process = processService.queryProcessById(processId);
        return process.getActionList().get(0).getAdverbial();
    }

    @RequestMapping(value = "queryByIdAndSend", method = RequestMethod.POST)
    @ResponseBody
    public String queryProcessByIdAndSend(HttpServletRequest request, HttpServletResponse response) {
        int processId = Integer.valueOf(request.getParameter("processId"));
        Process process = processService.queryProcessById(processId);
        String processJson = JSON.toJSONString(process);
        Map<String, String> p = new HashMap<>();
        p.put("process", processJson);
        ResponseEntity responseEntity = HttpRequest.sendPostByBody(Parameters.ABILITYKG_IP + Parameters.ABILITY_RUNPROCESS_NAME, p);
        return responseEntity.getBody().toString();
    }


    @RequestMapping(value = "queryByType", method = RequestMethod.POST)
    @ResponseBody
    public void queryProcessByType(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    public void listProcess(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    @ResponseBody
    public void uploadProcess(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "download", method = RequestMethod.POST)
    @ResponseBody
    public void downloadProcess(HttpServletRequest request, HttpServletResponse response) {

    }

}
