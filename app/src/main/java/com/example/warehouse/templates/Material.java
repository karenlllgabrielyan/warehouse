package com.example.warehouse.templates;

public class Material {
    private String type;
    private String name;
    private String description;
    private int maxCapacity;

    public Material(String type,
                    String name,
                    String description,
                    int maxCapacity){

        this.type = type;
        this.name = name;
        this.description = description;
        this.maxCapacity = maxCapacity;
    }

    public Material(MaterialType iron, String name, String dsc, int maxCapacity) {
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
}

