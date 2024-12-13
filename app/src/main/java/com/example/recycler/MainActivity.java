package com.example.recycler;

// MainActivity.java
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Membuat daftar mahasiswa dengan nilai hardcoded
        studentList = new ArrayList<>();
        studentList.add(new Student("12345", "Alice", "alice@example.com", "01/01/2000"));
        studentList.add(new Student("12346", "Bob", "bob@example.com", "02/02/2001"));
        studentList.add(new Student("12347", "Charlie", "charlie@example.com", "03/03/2002"));
        studentList.add(new Student("12348", "David", "david@example.com", "04/04/2003"));
        studentList.add(new Student("12349", "Eve", "eve@example.com", "05/05/2004"));

        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);
    }
}
