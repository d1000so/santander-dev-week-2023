package edu.d1000so.domain.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String icon;
    public String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
