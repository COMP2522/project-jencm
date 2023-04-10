package org.example;

//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.ServerApi;
//import com.mongodb.ServerApiVersion;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.model.Sorts;
//import org.bson.Document;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ScoreRepository {
//  private static final String DATABASE_NAME = "game_scores";
//  private static final String COLLECTION_NAME = "scores";
//  private MongoClient mongoClient;
//  private MongoCollection<Document> scoresCollection;
//
//  public ScoreRepository() {
//    ConnectionString connectionString = new ConnectionString("mongodb+srv://sanghanoor1:safety@cluster0.wy3znat.mongodb.net/?retryWrites=true&w=majority");
//    MongoClientSettings settings = MongoClientSettings.builder()
//        .applyConnectionString(connectionString)
//        .serverApi(ServerApi.builder()
//            .version(ServerApiVersion.V1)
//            .build())
//        .build();
//    mongoClient = MongoClients.create(settings);
//    MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
//    scoresCollection = database.getCollection(COLLECTION_NAME);
//  }
//
//  public void insertScore(String playerName, int score) {
//    Document doc = new Document("playerName", playerName)
//        .append("score", score);
//    scoresCollection.insertOne(doc);
//  }
//
//  public List<ScoreEntry> getTopFiveScores() {
//    List<ScoreEntry> topFiveScores = new ArrayList<>();
//
//    scoresCollection.find()
//        .sort(Sorts.descending("score"))
//        .limit(5)
//        .forEach(doc -> topFiveScores.add(new ScoreEntry(doc.getString("playerName"), doc.getInteger("score"))));
//
//    return topFiveScores;
//  }
//
//  public void close() {
//    mongoClient.close();
//  }
//}
//
//
