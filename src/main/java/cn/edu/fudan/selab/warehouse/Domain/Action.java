package cn.edu.fudan.selab.warehouse.Domain;

public class Action {

    private Ability predicate;
    private String object;
    private String adverbial;

    @Override
    public String toString() {
        return "Action{" +
                "predicate='" + predicate.toString() + '\'' +
                ", object='" + object + '\'' +
                ", adverbial='" + adverbial + '\'' +
                '}';
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

}
