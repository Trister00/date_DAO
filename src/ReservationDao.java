import com.mongodb.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationDao implements DAO<Reservation> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));

    public void save(Reservation r) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
        Date aujourdhui = new Date();

        DBObject res = new BasicDBObject("_id",formater.format(aujourdhui))
                .append("user",new BasicDBObject("nom",r.getU().getNom())
                        .append("prenom",r.getU().getPrenom())
                        .append("civilite",r.getU().getCivilite())
                        .append("mail",r.getU().getMail()))
                .append("hebergement",new BasicDBObject("numero",r.getH().getNumero())
                        .append("type",r.getH().getType())
                        .append("localisation",r.getH().getLocalisation())
                        .append("nb_max",r.getH().getNb_max_personnes())
                        .append("prix_nuit",r.getH().getPrix_nuit()))
                .append("date",new BasicDBObject("date_debut",r.getD().getDate_debut())
                .append("date_fin",r.getD().getDate_fin()))
                ;


        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Reservation");
        collection.insert(res);
    }
}
