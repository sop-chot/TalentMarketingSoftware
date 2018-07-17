import java.util.HashSet;
import java.util.Set;

/**
 * Created by dearr on 2018-07-16.
 */
public class Project {
    private String id;
    private String title;
    private Set<User> members;
    private User owner;
    private Set<Skill> skillsRequired;
    private ProjectStatus status;
    private Set<JoinRequest> joinRequests;

    public Project(String title, String id) {
        this.id = id;
        this.title = title;
        members = new HashSet<>();
        owner = null;
        skillsRequired = new HashSet<>();
        status = ProjectStatus.NEW;
        joinRequests = new HashSet<>();
    }

    public void assignOwner(User owner) {}
    public void addMember(User user) {}
    public void removeMember(User user) {}
    public void updateProjectStatus(ProjectStatus status) {}
    public void receiveJoinRequest(JoinRequest request) {}
    public void evaluateJoinRequests(Set<JoinRequest> requests) {}
    public void evaluateMember(User user) {}
}
