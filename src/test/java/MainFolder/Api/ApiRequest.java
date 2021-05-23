package MainFolder.Api;
import MainFolder.Api.Builder.BuilderRequest;

import MainFolder.Api.reqV1.ReqV1;
import MainFolder.Api.reqV2.ReqV2;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;


public class ApiRequest implements MethodsAPI {
    ReqV2 reqV2 = new ReqV2();
    ReqV1 reqV1 = new ReqV1();
    @Test
    @Override
    public void FindTweetById() {
           reqV2.finUserTweetById();
        }
   @Test
    @Override
    public void FindUserById() {
        reqV2.findUserById();

    }
    @Test
    @Override
    public void FindUserByUserName() {
        reqV2.findUserByName();
    }
    @Test
    @Override  //shows who is following the user
    public void FollowersUserId() {
        reqV2.followersAUserId();
    }
    @Test
    @Override
    public void UsersAUserIdIsFollowing() {
        reqV2.usersAUserIdIsFollowing();

    }
    @Test
    @Override
    public void FollowUserID() {
        reqV2.followUserID();

    }
    @Test
    @Override
    public void UnfollowAUserId() {

        reqV2.UnfollowAUserId();
    }

    @Override
    public void FollowOnUser() {
      reqV2.followOnUser();
    }

    @Override
    public void LikeATweet() {
      reqV2.likeATweet();
    }

    @Override
    public void UnlikeATweet() {
      reqV2.unlikeATweet();
    }

    @Override
    public void BlockAUserID() {
      reqV2.blockAUserID();
    }

    @Override
    public void UnblockAUserID() {
      reqV2.unblockAUserID();
    }

    @Override
    public void UserMentionTimelineByID() {
        reqV2.userMentionTimelineByID();

    }

    @Override
    public void UserTweetTimelineByID() {
      reqV2.userTweetTimelineByID();
    }

    @Override
    public void HideAReply() {
        reqV2.hideAReply();
    }

    @Override
    public void UnhideAReply() {
        reqV2.unhideAReply();

    }

    @Override
    public void DirectMessages() throws FileNotFoundException {
        reqV1.directMessages();
    }

    @Override
    public void MutesTheUser() {
        reqV1.mutesTheUser();
    }

    @Override
    public void UnblockUser() {
        reqV1.unblockUser();
    }

    @Override
    public void SingleTweet() {
        reqV1.singleTweet();
    }

    @Override
    public void StatusesLookup() {
        reqV1.statusesLookup();
    }

    @Override
    public void RetweetPost() {
        reqV1.retweetPost();
    }

    @Override
    public void DestroyPost() {
        reqV1.destroyPost();
    }

    @Override
    public void DestroyRetweetPost() {
        reqV1.destroyRetweetPost();
    }

    @Override
    public void FavoritesCreate() {
        reqV1.favoritesCreate();
    }

    @Override
    public void MuteUserList() {
        reqV1.muteUserList();
    }

    @Override
    public void SpamReport() {
        reqV1.spamReport();
    }

    @Override
    public void BlockUserList() {
        reqV1.blockUserList();
    }


}

