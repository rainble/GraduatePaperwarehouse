package cn.edu.fudan.selab.warehouse.Domain;
import java.util.List;

public enum  Ability {

    COMPUTE("compute"),
    DISPLAY("display"),
    EXECUTE("execute"),
    INTERACT("interact"),
    LOADING("loading"),
    PERCEIVE("perceive"),
    PROCESS("process"),
    PROVIDE("provide"),
    STORAGE("storage"),
    TRANSFER("transfer");

    private String ability;

    private Ability(String ability) {
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return ability;
    }
}