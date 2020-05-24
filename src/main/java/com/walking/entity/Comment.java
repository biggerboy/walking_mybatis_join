package com.walking.entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 公众号：编程大道
 * @Author: walking
 * @Date: $
 */
public class Comment {
    private int id;
    private String commentDetail;
    private User user;
    private int postId;
    @JSONField(format="yyyy-MM-dd")//数据库导出页面时json格式化
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
