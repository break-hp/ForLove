package com.example.forlove.Object;

/**
 * created by jiangtao on 2021/3/28 9:56
 * breakTT
 */

public class HomeFriends {
    private String imageId;
    private String nickname;
    private String content;
    private String[] shareimages;
    private String heart;
    private String comment;
    private String time;

    public HomeFriends(String imageId, String nickname, String content, String[] shareimages, String heart, String comment, String time) {
        this.imageId = imageId;
        this.nickname = nickname;
        this.content = content;
        this.shareimages = shareimages;
        this.heart = heart;
        this.comment = comment;
        this.time = time;
    }

    public HomeFriends() {
    }

    public String getImageId() {
        return imageId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContent() {
        return content;
    }

    public String[] getShareimages() {
        return shareimages;
    }

    public String getHeart() {
        return heart;
    }

    public String getComment() {
        return comment;
    }

    public String getTime() {
        return time;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setShareimages(String[] shareimages) {
        this.shareimages = shareimages;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
