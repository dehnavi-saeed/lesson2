package model.entity;

public class Post {
    private  int id ;
    private String title;
    private String content;

    public Post() {
    }

    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
