package cn.edu.fudan.selab.warehouse.Service;

import cn.edu.fudan.selab.warehouse.DAO.CyberServiceDAO;
import cn.edu.fudan.selab.warehouse.Domain.CyberService;
import cn.edu.fudan.selab.warehouse.Utils.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

@Service
public class CyberServiceService {

    @Autowired
    CyberServiceDAO cyberServiceDAO;

    public CyberService queryCyberServiceById() {
        return new CyberService();
    }

    public String downloadCyberServiceById(String cyberServiceName) {
//        String downloadFileName = "test" + new Date() + ".yaml";
//        FileInputStream inputStream = null;
//        OutputStream outputStream = null;
//        File file = null;
////        try {
////            file = new File(getF)
////        }
        String url = "http://localhost:8081/simplecrowdsourcing_war_exploded/file/download?filename="+ cyberServiceName +".yaml";
        String filePath = "/Users/sunruoyu/papertest/download" + cyberServiceName + ".yaml";
        String response = HttpRequest.sendGet(url);
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath);
            fw.write(response);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return filePath;
    }


}
