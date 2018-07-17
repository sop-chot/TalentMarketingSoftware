import java.util.HashSet;
import java.util.Set;

/**
 * Created by dearr on 2018-07-16.
 * A global set of skills that can be used for project requirements and user-related skills
 */
public class SkillSet {
    private Set<Skill> skills;
    private static SkillSet skillInstance = null;

    private SkillSet() {
        skills = new HashSet<>();
    }

    public static SkillSet getSkillInstance() {
        if (skillInstance == null) {
            skillInstance = new SkillSet();
        }

        return skillInstance;
    }

    public void addSkill(Skill skill) {}
    public void removeSkill(Skill skill) {}
}
