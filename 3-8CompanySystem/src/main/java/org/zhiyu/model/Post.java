package org.zhiyu.model;

public class Post {
    private String postNumber;
    private String postName;

    public Post(String postNumber, String postName) {
        this.postNumber = postNumber;
        this.postName = postName;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
