package cn.edu.fudan.selab.warehouse.Domain;

public class CyberService {

    private int cyberServiceId;
    private String yamlPath;
    private String label;

    @Override
    public String toString() {
        return "CyberService{" +
                "cyberServiceId=" + cyberServiceId +
                ", yamlPath='" + yamlPath + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public int getCyberServiceId() {
        return cyberServiceId;
    }

    public String getYamlPath() {
        return yamlPath;
    }

    public String getLabel() {
        return label;
    }

    public void setCyberServiceId(int cyberServiceId) {
        this.cyberServiceId = cyberServiceId;
    }

    public void setYamlPath(String yamlPath) {
        this.yamlPath = yamlPath;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
