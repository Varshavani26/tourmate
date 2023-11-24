package com.example.tour11;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.os.Bundle;
        import android.content.Intent;import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
public class CityListActivity extends AppCompatActivity {

    private final String[] cities = {"Visakhapatnam",
            "Vizianagaram",
            "West Godavari",
            "East Godavari",
            "Guntur",
            "Prakasam",
            "Krishna",
            "Nellore",
            "Chittoor",
            "Srikakulam",
            "Kadapa",
            "Anantapur",
            "Kurnool",
            "Anakapalli",
            "Kakinada",
            "Konaseema",
            "Bapatla",
            "Tirupati",
            "Annamayya",
            "Sri Sathyasai",
            "Nandyal",
            "Palnadu",
            "NTR",
            "Eluru",
            "Alluri Sitharama Raju",
            "Parvathipuram Manyam"}; // Replace with your city names

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView cityListView = findViewById(R.id.ListView);
        cityListView.setAdapter(adapter);
        cityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String selectedCity = cities[position];
                Intent intent = new Intent(CityListActivity.this, CityDetailActivity.class);
                intent.putExtra("cityName", selectedCity);
                startActivity(intent);






            }
        });

    }
}