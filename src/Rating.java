/**
 * Created by dearr on 2018-07-16.
 */
public enum Rating {
    EXCELLENT(5), GOOD(4), FAIR(3), POOR(2), VERY_POOR(1);

    private int rating;

    private Rating(int val) {
        this.rating = val;
    }

    public int getRating() {
        return rating;
    }
}
