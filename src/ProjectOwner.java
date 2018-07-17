import java.util.HashSet;
import java.util.Set;

/**
 * Created by dearr on 2018-07-16.
 */
public class ProjectOwner extends User {
    private Set<Project> projectsOwned;

    public ProjectOwner(String name, String id) {
        super(name, id);
        projectsOwned = new HashSet<>();
    }

    private void acceptUser(User user, Project project) {}
    private void rejectUser(User user, Project project) {}
    private void endorse(User user, Project project) {}
    private void giveFeedback(User user, String feedback, Project project) {}
    private void rate(User user, Rating rating, Project project) {}
}
