package MainFolder.Api.reqV1;

import MainFolder.Api.Builder.BuilderRequest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class ReqV1 {
    BuilderRequest reqBuild = new BuilderRequest();

    public ReqV1() {
        requestSpecification = reqBuild.builderRequest();

    }

    @Test
    public void directMessages() throws FileNotFoundException {
        FileInputStream json = new FileInputStream("src/test/java/data.json");

        given(requestSpecification).basePath("/1.1/direct_messages/events/new.json")
                .body(json)
                .post().then().log().all();
        System.out.println(json);

    }

    @Test
    public void mutesTheUser() {
        given(requestSpecification).queryParam("screen_name", "bel_luna27")
                .basePath("/1.1/mutes/users/create.json")
                .post()
                .then().log().all();
    }

    @Test
    public void unblockUser() {
        given(requestSpecification).queryParam("screen_name", "bel_luna27")
                .basePath("/1.1/blocks/destroy.json")
                .post()
                .then().log().all();
    }

    @Test
    public void muteUserList() {
        given(requestSpecification)
                .basePath("/1.1/mutes/users/list.json")
                .get()
                .then().log().all();

    }

    @Test
    public void spamReport() {
        given(requestSpecification)
                .queryParam("screen_name", "bel_luna27")
                .basePath("/1.1/users/report_spam.json")
                .post()
                .then().log().all();
    }

    @Test
    public void blockUserList() {
        given(requestSpecification)
                .basePath("/1.1/blocks/list.json")
                .get()
                .then().log().all();

    }

    @Test
    public void singleTweet() {
        given(requestSpecification)
                .queryParam("status", "API")
                .basePath("/1.1/statuses/update.json")
                .post()
                .then().log().all();

    }

    @Test
    public void statusesLookup() {
        given(requestSpecification)
                .queryParam("id", "1392425009407221761")
                .basePath("/1.1/statuses/lookup.json")
                .get()
                .then().log().all();
    }

    @Test
    public void retweetPost() {
        given(requestSpecification)
                .pathParam("id", "1392075574991011847")
                .basePath("/1.1/statuses/retweet/{id}.json")
                .post()
                .then().log().all();

    }
    @Test
    public void destroyPost() {
        given(requestSpecification)
                .pathParam("id", "13222424")
                .basePath("1.1/statuses/destroy/{id}.json")
                .post()
                .then().log().all();


    }
    @Test
public void destroyRetweetPost(){
        given(requestSpecification)
                .pathParam("id","1392075574991011847")
                .basePath("/1.1/statuses/unretweet/{id}.json")
                .post()
                .then().log().all();
}
@Test
public void favoritesCreate(){
        given(requestSpecification)
                .queryParam("id","1388933190048489477")
                .basePath("/1.1/favorites/create.json")
                .post()
                .then().log().all();
 }
}