import java.util.HashSet;
import java.util.Set;

/**
 * Created by dearr on 2018-07-16.
 */
public class User {
    private Set<Skill> skillsAcquired;
    private Set<Skill> skillsInterested;
    private String name;
    private String id;
    private Set<Project> projectsJoined;
    private Set<JoinRequest> requestsPending;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        skillsAcquired = new HashSet<>();
        skillsInterested = new HashSet<>();
        projectsJoined = new HashSet<>();
    }

    public void sendJoinProjectRequest(Project project) {}
}
