import com.mongodb.*;

public class HebergementDao implements DAO<Hebergement> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));

    public void save(Hebergement h){
        DBObject hebergement = new BasicDBObject("numero",h.getNumero())
                .append("type",h.getType())
                .append("localisation",h.getLocalisation())
                .append("nb_max",h.getNb_max_personnes())
                .append("prix",h.getPrix_nuit())

                ;
        ;
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Hebergement");
        collection.insert(hebergement);
    }
}
