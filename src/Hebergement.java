public class Hebergement {
    private int numero;
    private String type;
    private String localisation;
    private int nb_max_personnes;
    private int prix_nuit;

    public Hebergement(int numero, String type, String localisation, int nb_max_personnes, int prix_nuit) {
        this.numero = numero;
        this.type = type;
        this.localisation = localisation;
        this.nb_max_personnes = nb_max_personnes;
        this.prix_nuit = prix_nuit;
    }
    public Hebergement(String type, String localisation, int nb_max_personnes, int prix_nuit) {
        this.numero = numero;
        this.type = type;
        this.localisation = localisation;
        this.nb_max_personnes = nb_max_personnes;
        this.prix_nuit = prix_nuit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getNb_max_personnes() {
        return nb_max_personnes;
    }

    public void setNb_max_personnes(int nb_max_personnes) {
        this.nb_max_personnes = nb_max_personnes;
    }

    public int getPrix_nuit() {
        return prix_nuit;
    }

    public void setPrix_nuit(int prix_nuit) {
        this.prix_nuit = prix_nuit;
    }

    @Override
    public String toString() {
        return "Hebergement{" +
                "numero=" + numero +
                ", type='" + type + '\'' +
                ", localisation='" + localisation + '\'' +
                ", nb_max_personnes=" + nb_max_personnes +
                ", prix_nuit=" + prix_nuit +
                '}';
    }
}
