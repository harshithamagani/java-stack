import java.util.ArrayList;

public class ProjectTest {
    public static void main(String[] args) {
        Portfolio port = new Portfolio();
        Project p1 = new Project("Project1");
        //System.out.println(p1.elevatorPitch());
        Project p2 = new Project("Project2");
        //System.out.println(p2.elevatorPitch());
        Project p3 = new Project("Project3","Somedescription3");
        //System.out.println(p3.elevatorPitch());
        Project p4 = new Project("Project4","Somedescription4",240000.78);
        //System.out.println(p4.elevatorPitch());
        port.addToPortfolio(p1);
        port.addToPortfolio(p2);
        port.addToPortfolio(p3);
        port.addToPortfolio(p4);
        ArrayList<Project> arrPort = port.getPortfolio();

        for(Project p : arrPort){
            System.out.println(p.elevatorPitch());
        }
    }
}