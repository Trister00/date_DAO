public class Reservation {
    private User u;
    private Hebergement h;
    private LaDate d;

    public Reservation(User u, Hebergement h, LaDate d) {
        this.u = u;
        this.h = h;
        this.d = d;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public Hebergement getH() {
        return h;
    }

    public void setH(Hebergement h) {
        this.h = h;
    }

    public LaDate getD() {
        return d;
    }

    public void setD(LaDate d) {
        this.d = d;
    }
}
