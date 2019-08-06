package cn.edu.fudan.selab.warehouse.DAO;


import cn.edu.fudan.selab.warehouse.Domain.ProcessDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProcessDAO {

    ProcessDTO queryProcessById(@Param("processId")int processId);

    List<Process> queryAllProcess();


}
