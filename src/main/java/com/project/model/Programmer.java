package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programmer {

    @Id
    private int id;
    private String name;
    private String language;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLanguage() { return language; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLanguage(String language) { this.language = language; }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

}
