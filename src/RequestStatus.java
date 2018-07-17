/**
 * Created by dearr on 2018-07-16.
 */
public enum RequestStatus {
    ACCEPT(0), REJECT(1), PENDING(2);

    private int status;

    private RequestStatus(int val) {
        this.status = val;
    }

    public int getStatus() {
        return status;
    }
}
