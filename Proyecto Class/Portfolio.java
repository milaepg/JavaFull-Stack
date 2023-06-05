import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public double getPortfolioCost() {
        double totalCost = 0;
        for (Project project : this.projects) {
            totalCost += project.getInitialCost();
        }
        return totalCost;
    }

    public void showPortfolio() {
        for (Project project : this.projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Cost: " + this.getPortfolioCost());
    }
}