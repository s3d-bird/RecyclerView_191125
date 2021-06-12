package com.arsec.recyclerview_191125;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter_GameNames recyclerAdapter_gameNames;

    ArrayList<Game> gameTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameTitles = new ArrayList<>();
        gameTitles.add(new Game("NFS: The Run", 2011));
        gameTitles.add(new Game("NFS: Rivals", 2014));
        gameTitles.add(new Game("Assassin\'s Creed: Black Flag", 2013));
        gameTitles.add(new Game("GTA V", 2013));

        recyclerView = findViewById(R.id.rv_GameTitles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter_gameNames = new RecyclerAdapter_GameNames(gameTitles, this);
        recyclerView.setAdapter(recyclerAdapter_gameNames);

    }
}