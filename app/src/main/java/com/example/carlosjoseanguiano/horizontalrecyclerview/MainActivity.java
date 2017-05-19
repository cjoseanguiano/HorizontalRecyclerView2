package com.example.carlosjoseanguiano.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView horizontalView;
    HorizontalAdapter horizontalAdapter;
    private List<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalView = (RecyclerView) findViewById(R.id.horizontal_recycler_view);

        data = fill_with_data();

        horizontalAdapter = new HorizontalAdapter(data, getApplication());

        LinearLayoutManager horLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        horizontalView.setLayoutManager(horLayoutManager);
        horizontalView.setAdapter(horizontalAdapter);
    }

    private List<Data> fill_with_data() {
        List<Data> datasx = new ArrayList<>();

        datasx.add(new Data(R.drawable.photo, "Uno"));
        datasx.add(new Data(R.drawable.triangulo_rectangulo, "Dos"));
        datasx.add(new Data(R.drawable.yo, "Tres"));
        datasx.add(new Data(R.drawable.photo, "Uno"));
        datasx.add(new Data(R.drawable.triangulo_rectangulo, "Dos"));
        datasx.add(new Data(R.drawable.yo, "Tres"));
        datasx.add(new Data(R.drawable.photo, "Uno"));
        datasx.add(new Data(R.drawable.triangulo_rectangulo, "Dos"));
        datasx.add(new Data(R.drawable.yo, "Tres"));
        return datasx;
    }
}
