package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.warehouse.templates.Material;
import com.example.warehouse.templates.Warehouse;
import java.util.ArrayList;
import static com.example.warehouse.templates.MaterialType.BOLT;
import static com.example.warehouse.templates.MaterialType.COPPER;
import static com.example.warehouse.templates.MaterialType.GOLD;
import static com.example.warehouse.templates.MaterialType.IRON;
import static com.example.warehouse.templates.MaterialType.WOOD;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Warehouse warehouse = new Warehouse();
        ArrayList<Material> materials = new ArrayList<>();
        Material material1 = new Material(IRON, "Name", "Dsc", 50 );
        Material material2 = new Material(COPPER, "Name", "Dsc", 25 );
        Material material3 = new Material(BOLT, "Name", "Dsc", 100 );
        Material material4 = new Material(WOOD, "Name", "Dsc", 20 );
        Material material5 = new Material(GOLD, "Name", "Dsc", 30 );

        materials.add(material1);
        materials.add(material2);
        materials.add(material3);
        materials.add(material4);
        materials.add(material5);

        warehouse.setMaterials(materials);


    }
}