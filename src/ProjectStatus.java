/**
 * Created by dearr on 2018-07-16.
 */
public enum ProjectStatus {
    COMPLETE(0), IN_PROGRESS(1), PAUSE(2), CANCEL(3), NEW(4);

    private int status;

    private ProjectStatus(int val) {
        this.status = val;
    }

    public int getStatus() {
        return status;
    }
}
