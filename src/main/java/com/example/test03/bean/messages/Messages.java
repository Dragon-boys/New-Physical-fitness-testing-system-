package com.example.test03.bean.messages;

import lombok.ToString;

@ToString
public class Messages {
    private Long id;
    private String createTime;
    private Long userNo;
    private String userName;
    private String avatar;
    private String content;
    private String pictureContent;
    private String reply;
    private String pictureReply;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPictureContent() {
        return pictureContent;
    }

    public void setPictureContent(String pictureContent) {
        this.pictureContent = pictureContent;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getPictureReply() {
        return pictureReply;
    }

    public void setPictureReply(String pictureReply) {
        this.pictureReply = pictureReply;
    }
}
