import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    Portfolio(){
        projects = new ArrayList<>();
    }
    public void addToPortfolio(Project p){
        projects.add(p);
    }

    public ArrayList<Project> getPortfolio(){
        return projects;
    }

    public void setPortfolio(ArrayList<Project> ps){
        this.projects = ps;
    }

}