public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project("Project1", "This is Project1", 1000);
        Project project2 = new Project("Project2", "This is Project2", 2000);
        Project project3 = new Project("Project3", "This is Project3", 3000);

        Portfolio portfolio = new Portfolio();
        portfolio.addProject(project1);
        portfolio.addProject(project2);
        portfolio.addProject(project3);

        portfolio.showPortfolio();
    }
}