package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int authorId;
    private int adminId;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAd;
    private boolean isFavorite;
    private int posponedId;
    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    // + get/set на все поля
}
