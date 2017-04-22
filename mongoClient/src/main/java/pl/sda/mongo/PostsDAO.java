package pl.sda.mongo;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Miki on 08.03.2017.
 */
public class PostsDAO {

    public WriteResult intesr(Post post) {
        DBCollection posts = getDbCollection();

        BasicDBObject newPost = new BasicDBObject();
        newPost.put("author", post.getAuthor());
        newPost.put("content", post.getContent());
        newPost.put("date", post.getDate());

        return posts.insert(newPost);
    }

    public List<DBObject> searchById(ObjectId id) {
        DBCollection posts = getDbCollection();

        BasicDBObject query = new BasicDBObject();
        query.put("_id", id);

        List<DBObject> result = new ArrayList<>();
        DBCursor postCursor = posts.find(query);
        while (postCursor.hasNext()) {
            result.add(postCursor.next());
        }

        return result;
    }

    public DBObject remove(ObjectId id) {
        BasicDBObject query = new BasicDBObject();
        query.put("_id", id);

        DBCollection posts = getDbCollection();
        return posts.findAndRemove(query);
    }

    private DBCollection getDbCollection() {
        Mongo mongo = new Mongo("LocalHost", 27017);
        return mongo.getDB("SDATest").getCollection("posts");
    }

    public WriteResult updateById(Post post, ObjectId id) {
        DBCollection posts = getDbCollection();
        BasicDBObject query = new BasicDBObject();
        query.put("_id", id);
        BasicDBObject update = new BasicDBObject();

        BasicDBObject updatedPost = new BasicDBObject();
        updatedPost.put("author",post.getAuthor());
        updatedPost.put("content",post.getContent());
        updatedPost.put("date",post.getDate());


        return posts.update(query,updatedPost);


    }


}
