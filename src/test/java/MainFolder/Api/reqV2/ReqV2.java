package MainFolder.Api.reqV2;

import MainFolder.Api.Builder.BuilderRequest;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class ReqV2 {
    BuilderRequest reqBuild = new BuilderRequest();
     public ReqV2(){
         requestSpecification =  reqBuild.builderRequest();

     }

    public void finUserTweetById(){
        given(requestSpecification).pathParam("id", "1389225031146872833")
                .basePath("2/tweets")
                .get("/{id}").then().statusCode(200).log().all();
    }
    public void findUserById(){
        given(requestSpecification).pathParam("ids","339233390")
                .basePath("2/users").get("/{ids}").then().statusCode(200).log().all();
    }

    public void findUserByName(){
        given(requestSpecification).pathParam("username","EvgenComedian")
                .basePath("2/users/by/username").get("/{username}").then().statusCode(200).log().all();
    }

    public void followersAUserId(){
        given(requestSpecification).pathParam("id","339233390").basePath("2/users/{id}/followers")
                .get().then().log().all();
    }
    public void usersAUserIdIsFollowing(){
        given(requestSpecification).pathParam("id","339233390").basePath("2/users/{id}/following")
                .get().then().log().all();
    }
    public void followUserID(){
        given(requestSpecification).pathParam("id","1386729139252736004").basePath("2/users/{id}/following")
                .post().then().log().all();
    }

    public void UnfollowAUserId(){
         given(requestSpecification).pathParam("source_user_id","1386729139252736004")
                 .pathParam("target_user_id","1120633726478823425")
                 .basePath("2/users/{source_user_id}/following/{target_user_id}")
                 .delete().then().log().all();
    }

    public void followOnUser(){
         String first = "target_user_id";
         String second = "1120633726478823425";
        HashMap <String,String> key =  new HashMap<>();
        key.put(first,second);
         given(requestSpecification).pathParam("id","1386729139252736004")
                 .basePath("2/users/{id}/following").body(key).post().then().log().all();
    }
    @Test
    public void likeATweet(){
         String key="tweet_id", value = "1388933190048489477";
         HashMap<String,String> tweet_id = new HashMap<>();
         tweet_id.put(key,value);
         given(requestSpecification).pathParam("id","1386729139252736004")
                 .basePath("2/users/{id}/likes").body(tweet_id).post().then().log().all();
    }
    @Test
    public void unlikeATweet(){
         given(requestSpecification).pathParam("id","1386729139252736004").pathParam("tweet_id","1388933190048489477")
                 .basePath("2/users/{id}/likes/{tweet_id}").delete().then().log().all();
    }
    @Test
    public void blockAUserID(){
         String key = "target_user_id",value ="44196397";
         HashMap<String,String> target_user_id = new HashMap<>();
         target_user_id.put(key,value);
         given(requestSpecification).pathParam("id","1386729139252736004")
                 .basePath("2/users/{id}/blocking").body(target_user_id).post().then().log().all();
    }
    @Test
   public void unblockAUserID(){
         given(requestSpecification).pathParam("source_user_id","1386729139252736004")
                 .pathParam("target_user_id","44196397")
                 .basePath("2/users/{source_user_id}/blocking/{target_user_id}")
                 .delete().then().log().all();
   }
   @Test
   public void userMentionTimelineByID(){
         given(requestSpecification).pathParam("id","44196397")
                 .basePath("2/users/{id}/mentions")
                 .get().then().log().all();
   }
   @Test
   public void userTweetTimelineByID(){
         given(requestSpecification)
                 .pathParam("id","44196397")
                 .basePath("2/users/{id}/tweets")
                 .get().then().log().all();
   }
 @Test
   public void hideAReply(){
         String key = "hidden";
         HashMap<String,Boolean>hidden = new HashMap<>();
         hidden.put(key, true);

         given(requestSpecification)
                 .pathParam("id","1390622378254913538")
                 .basePath("2/tweets/{id}/hidden").body(hidden)
                 .put().then().log().all();
   }
   @Test
   public void unhideAReply(){
       String key = "hidden";
       HashMap<String,Boolean>hidden = new HashMap<>();
       hidden.put(key, false);

       given(requestSpecification)
               .pathParam("id","1390622378254913538")
               .basePath("2/tweets/{id}/hidden").body(hidden)
               .put().then().log().all();

   }


}
