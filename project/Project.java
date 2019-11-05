public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project(){
        name = "";
        description = "";
        initialCost = 0.0;
    }

    public Project(String name){
        this.name=name;
    }

    public Project(String name,String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name,String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getInitialCost(){
        return initialCost;
    }

    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    String elevatorPitch(){
        return name + " "+"("+initialCost+")"+" : " + description;
    }

}