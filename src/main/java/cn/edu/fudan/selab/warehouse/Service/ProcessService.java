package cn.edu.fudan.selab.warehouse.Service;

import cn.edu.fudan.selab.warehouse.DAO.ProcessDAO;
import cn.edu.fudan.selab.warehouse.Domain.Ability;
import cn.edu.fudan.selab.warehouse.Domain.Action;
import cn.edu.fudan.selab.warehouse.Domain.Process;
import cn.edu.fudan.selab.warehouse.Domain.ProcessDTO;
import cn.edu.fudan.selab.warehouse.Utils.HttpRequest;
import cn.edu.fudan.selab.warehouse.Utils.Parameters;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProcessService {

    public static final Logger logger = Logger.getLogger(ProcessService.class);

    @Autowired
    ProcessDAO processDAO;

    public Process queryProcessById(int processId) {
        ProcessDTO processDTO = processDAO.queryProcessById(processId);
        logger.info(String.format("processDTO is [ %s ]", processDTO.toString()));
        Process process = new Process();
        String[] actions = processDTO.getActionList().split(";");
        List<Action> actionList = new ArrayList<Action>();
        for (String s : actions) {
            String[] actionComponents = s.split(" ");
            Action action = new Action();
            action.setType(actionComponents[0]);
            for (Ability ability : Ability.values()) {
                if (ability.getAbility().equals(actionComponents[1])) {
                    action.setPredicate(ability);
                }
            }
            action.setObject(actionComponents[2]);
            action.setAdverbial(actionComponents[3]);
            action.setParameters(actionComponents[4]);
            actionList.add(action);
        }
        process.setProcessId(processDTO.getProcessId());
        process.setActionList(actionList);
        logger.info(String.format("Process's component is [ %s ].", process.toString()));
        return process;
    }


}
