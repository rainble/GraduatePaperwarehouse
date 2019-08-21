package cn.edu.fudan.selab.warehouse.Domain;

public class Action {

    private String type;
    private Ability predicate;
    private String object;
    private String adverbial;

    //json格式
    private String parameters;

    @Override
    public String toString() {
        return "Action{" +
                "type='" + type + '\'' +
                ", predicate=" + predicate +
                ", object='" + object + '\'' +
                ", adverbial='" + adverbial + '\'' +
                ", parameters='" + parameters + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public void setPredicate(Ability predicate) {
        this.predicate = predicate;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setAdverbial(String adverbial) {
        this.adverbial = adverbial;
    }

    public Ability getPredicate() {
        return predicate;
    }

    public String getObject() {
        return object;
    }

    public String getAdverbial() {
        return adverbial;
    }

    public String getType() {
        return type;
    }

    public String getParameters() {
        return parameters;
    }
}
