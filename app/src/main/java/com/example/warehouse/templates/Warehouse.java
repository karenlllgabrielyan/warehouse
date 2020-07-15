package com.example.warehouse.templates;

import java.util.ArrayList;

public class Warehouse {

    private ArrayList<Material> materials;
    private int warehouseMaxSize;


    public void addMaterial(Material material){

    }

    public void removeMaterial(Material material){

    }

    public void moveMaterial(Material material){

    }


    private ArrayList<Material> getMaterialList(){
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }
}
