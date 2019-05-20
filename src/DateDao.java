import com.mongodb.*;

public class DateDao implements DAO<LaDate> {

    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));
    public void save(LaDate d) {
        DBObject date = new BasicDBObject("date_debut",d.getDate_debut())
                .append("date_depart",d.getDate_fin())

                ;
        ;
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Date");
        collection.insert(date);
    }
}
