package cn.edu.fudan.selab.warehouse.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cyberservice")
public class CyberServiceController {

    @RequestMapping(value = "queryById", method = RequestMethod.POST)
    @ResponseBody
    public void queryProcessById(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "queryById", method = RequestMethod.POST)
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
