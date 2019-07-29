package cn.edu.fudan.selab.warehouse.DAO;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessDAO {

    List<Process> queryProcessById(@Param("processId")int processId);




}
