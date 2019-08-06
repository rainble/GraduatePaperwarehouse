package cn.edu.fudan.selab.warehouse.DAO;

import cn.edu.fudan.selab.warehouse.Domain.CyberService;
import cn.edu.fudan.selab.warehouse.Domain.Process;
import org.apache.ibatis.annotations.Param;

public interface CyberServiceDAO {

    CyberService queryCyberServiceById(@Param("cyberServiceId")int processId);



}
