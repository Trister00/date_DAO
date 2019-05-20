public class LaDate {
    private String date_debut;
    private String date_fin;

    public LaDate(String date_debut, String date_fin) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }
}
