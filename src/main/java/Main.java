
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;


public class Main {

    public static void main(String[] args) {

        MongoClient client = MongoClients.create("mongodb+srv://Patryk:Atlas2022#@cluster0.iteidfz.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("Pojazdy");
        MongoCollection col =db.getCollection("Samochody");

        col.deleteOne(eq("_id", new ObjectId("636fc5a9877b6c46a5b2d189")));

//        Document doc1 = new Document("Marka", "polonez")
//                .append("Model", "caro")
//                .append("Silnik", "benzyna")
//                .append("Kolor","zielony");
//;
//
//
//        Document doc2 = new Document("Marka", "Daewoo")
//                .append("Model", "Tico")
//                .append("Silnik", "benzyna")
//                .append("Kolor","różowy");
//
//        List<Document> documents = new ArrayList<Document>();
//        documents.add(doc1);
//        documents.add(doc2);
//
//        col.insertMany(documents);
//
//
//        MongoCollection col2 =db.getCollection("Motocykle");
//
//        Document doc1_2 = new Document("Marka", "Harley")
//                .append("Model", "123")
//                .append("Silnik", "benzyna")
//                .append("Kolor","szary");
//        ;
//
//
//        Document doc2_2 = new Document("Marka", "java")
//                .append("Model", "50")
//                .append("Silnik", "benzyna")
//                .append("Kolor","zardzewiały");
//
//        List<Document> documents_1 = new ArrayList<Document>();
//        documents_1.add(doc1_2);
//        documents_1.add(doc2_2);
//
//        col2.insertMany(documents_1);
//
//        MongoCollection col3 =db.getCollection("Ciężarowe");
//
//        Document doc1_3 = new Document("Marka", "Renault")
//                .append("Model", "Magnum")
//                .append("Silnik", "diesel")
//                .append("Kolor","Czerwony");
//        ;
//
//
//        Document doc2_3 = new Document("Marka", "MAN")
//                .append("Model", "TIR")
//                .append("Silnik", "Diesel")
//                .append("Kolor", "Żółty");
//
//        List<Document> documents_3 = new ArrayList<Document>();
//        documents_3.add(doc1_3);
//        documents_3.add(doc2_3);
//
//        col3.insertMany(documents_3);



    }
    Logger logger = LoggerFactory.getLogger("MyApp");
}