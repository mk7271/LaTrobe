package com.example.latrobe;

public class Model {

    String title,content;


    Model(){

    }
    //Created Constructor
    public Model(String title, String content) {
        this.title = title;
        this.content = content;
    }


    //Created Getter And Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
