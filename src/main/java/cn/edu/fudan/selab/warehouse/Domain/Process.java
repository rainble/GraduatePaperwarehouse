package cn.edu.fudan.selab.warehouse.Domain;

import java.util.List;

public class Process {

    private int processId;
    private List<Action> actionList;

    @Override
    public String toString() {
        return "Process{" +
                "processId=" + processId +
                ", actionList=" + actionList +
                '}';
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
    }

    public int getProcessId() {
        return processId;
    }

    public List<Action> getActionList() {
        return actionList;
    }
}
