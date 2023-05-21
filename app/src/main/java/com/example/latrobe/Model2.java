package com.example.latrobe;

public class Model2 {

    String title,content;


    Model2(){

    }
    //Created Constructor
    public Model2(String title, String content) {
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
