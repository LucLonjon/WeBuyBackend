package com.webuy.backend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;

    @OneToMany
    private List<Annonce> annonce;

    public List<Annonce> getAnnonce() {
        return annonce;
    }

    public void setAnnonce(List<Annonce> annonce) {
        this.annonce = annonce;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
        this.name = null;
        this.email = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
