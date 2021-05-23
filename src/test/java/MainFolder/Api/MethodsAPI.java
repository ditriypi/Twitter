package MainFolder.Api;

import java.io.FileNotFoundException;

public interface MethodsAPI {


    void FindTweetById();

    void FindUserById();

    void FindUserByUserName();

    void FollowersUserId();

    void UsersAUserIdIsFollowing();

    void FollowUserID();

    void UnfollowAUserId();

    void FollowOnUser();

    void LikeATweet();

    void UnlikeATweet();

    void BlockAUserID();

    void UnblockAUserID();

    void UserMentionTimelineByID(); //returns the latest tweets mentioning a user

    void UserTweetTimelineByID(); //Returns Tweets composed by a single user, specified by the requested user ID

    void HideAReply();

    void UnhideAReply();

    void DirectMessages() throws FileNotFoundException;

    void MutesTheUser();

    void UnblockUser();

    void SingleTweet();

    void StatusesLookup();

    void RetweetPost();

    void DestroyPost();

    void DestroyRetweetPost();

    void FavoritesCreate();

    void MuteUserList();

    void SpamReport();

   void BlockUserList();
}
