package com.elmernissi.myrestufinder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.elmernissi.myrestufinder.MyAdapter.Adapter;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.ArrayList;
import java.util.List;
/** @noinspection ALL*/
public class MainActivity extends AppCompatActivity {

    private Adapter adapter;
    private List<Magasin> originalListM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        Toolbar toolbar = findViewById(R.id.toll_menu);
//        setSupportActionBar(toolbar);
        // Exemple de données pour le RecyclerView
        List<Magasin> listMagasin = new ArrayList<>();
        listMagasin.add(new Magasin("restaurant1", "Safi", 1111));
        listMagasin.add(new Magasin("restaurant2", "Rabat", 2222));
        listMagasin.add(new Magasin("restaurant3", "Marrakech", 333));
        listMagasin.add(new Magasin("restaurant4", "Safi", 444));
        listMagasin.add(new Magasin("restaurant5", "Rabat", 555));
        listMagasin.add(new Magasin("restaurant6", "Marrakech", 666));
        listMagasin.add(new Magasin("restaurant4", "Safi", 777));
        originalListM = new ArrayList<>(listMagasin);
        // Déclarer le Adapter et passer les données magasins
        adapter = new Adapter(listMagasin);

        // setAdapter(adapter) au recyclerView
        recyclerView.setAdapter(adapter);

        // Initialiser le Spinner
        Spinner citySpinner = findViewById(R.id.citySpinner);

        String[] cities = getResources().getStringArray(R.array.city_array);
        ArrayAdapter spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, cities);
        spinnerAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        citySpinner.setAdapter(spinnerAdapter);

        // Ajouter un écouteur de sélection au Spinner
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedCity = adapterView.getItemAtPosition(i).toString();
                filterRecyclerView(selectedCity);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    private void filterRecyclerView(String selectedCity) {
        List<Magasin> filteredList = new ArrayList<>();

        for (Magasin magasin : originalListM) {
            if (magasin.getAdresseMagasin().equalsIgnoreCase(selectedCity)) {
                filteredList.add(magasin);
            }
        }
        adapter.setMagasins(filteredList);
        adapter.notifyDataSetChanged();
    }

    // Ajouter le menu à l'application
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // Gérer les sélections du menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menuHelp) {
            Toast.makeText(this, "Option Help sélectionnée", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menuContact) {
            Toast.makeText(this, "Option Contact sélectionnée", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
