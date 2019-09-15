package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        // Giữ RecycleView không đổi khi item trong nó thay đổi
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<Person>();
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("Mike","Rambo","plane"));
        people.add(new Person("Dereck","Rambo","bus"));
        people.add(new Person("Billgate","Rambo","plane"));
        people.add(new Person("Jozz","Rambo","bus"));
        people.add(new Person("Pharaon","Rambo","bus"));
        people.add(new Person("Swith","Rambo","plane"));
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("Mike","Rambo","plane"));
        people.add(new Person("Dereck","Rambo","bus"));
        people.add(new Person("Billgate","Rambo","plane"));
        people.add(new Person("Jozz","Rambo","bus"));
        people.add(new Person("Pharaon","Rambo","bus"));
        people.add(new Person("Swith","Rambo","plane"));

        myAdapter = new PersonAdapter(this,people);
        recyclerView.setAdapter(myAdapter);

    }
}
