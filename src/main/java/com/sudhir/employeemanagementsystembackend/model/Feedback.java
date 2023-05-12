package com.sudhir.employeemanagementsystembackend.model;

import javax.persistence.*;

@Entity
@Table(name = "feeback_table")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;


    @Column(name =  "noOfLikes")
    int noOfLikes;


    @Column(name = "imageurl")
    String imageUrl;


    @Column(name = "submittername")
    String submitterName;

    @Column(name = "submitteremail")
    String submitterEmail;

    public Feedback(long id, String title, String description, int noOfLikes, String imageUrl, String submitterName, String submitterEmail) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.noOfLikes = noOfLikes;
        this.imageUrl = imageUrl;
        this.submitterName = submitterName;
        this.submitterEmail = submitterEmail;
    }

    public Feedback() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    public String getSubmitterEmail() {
        return submitterEmail;
    }

    public void setSubmitterEmail(String submitterEmail) {
        this.submitterEmail = submitterEmail;
    }
}
