package hn.uth.tareafinal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardViewAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        recyclerView = findViewById(R.id.cardRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] data = {"Persona 1", "Persona 2", "Persona 3", "Persona 4", "Persona 5"};
        adapter = new CardViewAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
