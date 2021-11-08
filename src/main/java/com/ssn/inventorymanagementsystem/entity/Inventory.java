package com.ssn.inventorymanagementsystem.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private int number_in_stock;
    private double price;
    private String dimensions;
    private String weight;
    private String description;
    private String tags;
    // we can make tag its own table and have
    // private string [] tags; as an array

    private Date date_added;
    private Date last_time_moved;

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

    public int getNumber_in_stock() {
        return number_in_stock;
    }

    public void setNumber_in_stock(int number_in_stock) {
        this.number_in_stock = number_in_stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public Date getLast_time_moved() {
        return last_time_moved;
    }

    public void setLast_time_moved(Date last_time_moved) {
        this.last_time_moved = last_time_moved;
    }
}
