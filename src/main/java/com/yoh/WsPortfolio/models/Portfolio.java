package com.yoh.WsPortfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**@author Lupitayoh
 * Portfolio model
 */
@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "")
    private String public_email;

    @Column(name = "")
    private String about;

    @Column(name = "")
    private String position;

    @Column(name = "")
    private String picture;

    @Column(name = "")
    private String linkedin;

    @Column(name = "")
    private String facebook;

    @Column(name = "")
    private String instagram;

    @Column(name = "")
    private String twitter;

    @Column(name = "")
    private String github;

    @Column(name = "")
    private String gitlab;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;

    public Portfolio(String public_email, String about, String position, String picture, String linkedin, String facebook, String instagram, String twitter, String github, String gitlab, Date created_at, Date updated_at) {
        this.public_email = public_email;
        this.about = about;
        this.position = position;
        this.picture = picture;
        this.linkedin = linkedin;
        this.facebook = facebook;
        this.instagram = instagram;
        this.twitter = twitter;
        this.github = github;
        this.gitlab = gitlab;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Portfolio(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublic_email() {
        return public_email;
    }

    public void setPublic_email(String public_email) {
        this.public_email = public_email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getGitlab() {
        return gitlab;
    }

    public void setGitlab(String gitlab) {
        this.gitlab = gitlab;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @PrePersist
    protected void onCreate() {
        setCreated_at(new Date());
        setUpdated_at(new Date());
    }

    @PreUpdate
    protected void onUpdate(){
        setUpdated_at(new Date());
    }


}
