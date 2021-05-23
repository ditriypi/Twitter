package MainFolder.Api.Builder;

import MainFolder.TokenAndSecret.TokenAndKeys;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;


public  class BuilderRequest {


    TokenAndKeys ob = new TokenAndKeys();


    public RequestSpecification builderRequest() {
        requestSpecification= new RequestSpecBuilder()
                .setBaseUri("https://api.twitter.com")
                .setContentType(ContentType.JSON)
                .build();
        requestSpecification.auth().oauth(
                        ob.getConsumerKey(),
                        ob.getConsumerSecret(),
                        ob.getAccessToken() ,
                        ob.getTokenSecret()
                       );
        return requestSpecification;

    }





}
