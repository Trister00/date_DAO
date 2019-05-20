import com.mongodb.*;

public class UserDao implements DAO<User> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));
    public void save(User u) {
        DBObject user = new BasicDBObject("nom",u.getNom())
                .append("prenom",u.getPrenom())
                .append("civilite",u.getCivilite())
                .append("mail",u.getMail());
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("User");
        collection.insert(user);
    }
}
