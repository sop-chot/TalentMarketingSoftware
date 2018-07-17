import java.util.Date;

/**
 * Created by dearr on 2018-07-16.
 */
public class JoinRequest {
    private User requestor;
    private Project projectToJoin;
    private RequestStatus status;
    private Date timestamp;

    public JoinRequest(User user, Project project) {
        requestor = user;
        projectToJoin = project;
        status = RequestStatus.PENDING;
        timestamp = new Date();
    }
}
