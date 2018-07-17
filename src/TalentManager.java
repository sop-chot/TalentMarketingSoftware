import java.util.HashSet;
import java.util.Set;

/**
 * Created by dearr on 2018-07-16.
 */
public class TalentManager {
    private Set<User> users;
    private Set<Project> projects;
    private SkillSet skillSet;

    public TalentManager() {
        users = new HashSet<>();
        projects = new HashSet<>();
        skillSet = null;
    }

    public void addUser(User user) {}
    public void removeUser(User user) {}
    public void addProject(Project project) {}
    public void removeProject(Project project) {}
    public void addSkill(Skill skill) {}
    public void removeSkill(Skill skill) {}
    public Set<Project> matchUserToProjects(User user) {return new HashSet<>();}
    public void sendJoinProjectRequest(User user, Project project) {}
    public void evaluateJoinRequests(Project project) {}
    public void evaluateMember(Project project, User user) {}
}
