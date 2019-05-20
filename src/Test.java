import com.mongodb.*;
import com.mongodb.client.model.DBCollectionCountOptions;

public class Test {
    public static void main(String[] args){
        DAO TestDao = new ReservationDao();
        /*
        Reservation r = new Reservation(
                new User("EL ALAM","Nassim","M","nassimelalam@gmail.com"),
                new Hebergement(44,"appart","Est",4,300),
                new LaDate("29/06/2019","03/07/2019")
        );

        TestDao.save(r);*/

        DAO HebDao = new HebergementDao();
        /*
        Hebergement h = new Hebergement(3,"appart","Nord",2,500);
        HebDao.save(h);

        Hebergement h2 = new Hebergement(5,"bungalows","Nord",5,500);
        HebDao.save(h2);
*/
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));
        DB database = mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Hebergement");
        BasicDBObject where = new BasicDBObject();
        where.put("numero",3);

        DBObject document = collection.findOne(where);
        System.out.println(document);
        Hebergement tmp = new Hebergement((int)document.get("numero"),(String)document.get("type"),(String)document.get("localisation"),(int)document.get("nb_max"),(int)document.get("prix"));
        System.out.println(tmp);

        DBCollection coll = database.getCollection("Reservation");
        BasicDBObject query = new BasicDBObject();
        query.put("_id","20190520131012");

        DBObject doc = coll.findOne(query);
        BasicDBObject tmp2 = (BasicDBObject) doc.get("date");
        System.out.println(doc.get("date"));
        System.out.println(tmp2.get("date_debut"));
    }
}
