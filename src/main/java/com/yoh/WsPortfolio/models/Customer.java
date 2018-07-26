package com.yoh.WsPortfolio.models;

import javax.persistence.*;
import java.util.Date;

/**@author Lupita Llama
 * Model customer, portafolio's owner
 */
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "cellphone")
    private String cellphone;

    @Column(name = "is_activated")
    private Boolean is_activated;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Boolean getIs_activated() {
        return is_activated;
    }

    public void setIs_activated(Boolean is_activated) {
        this.is_activated = is_activated;
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

    public Customer(String name, String email, String phone, String cellphone, Boolean is_activated) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cellphone = cellphone;
        this.is_activated = is_activated;
    }

    public Customer(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", is_activated=" + is_activated +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
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
