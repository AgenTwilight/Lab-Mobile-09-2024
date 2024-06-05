package com.example.praktikum_3mobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_story;
    private RecyclerView rv_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rv_story = findViewById(R.id.story);
        rv_post = findViewById(R.id.post);

        rv_story.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_story.setHasFixedSize(true);
        rv_post.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_post.setHasFixedSize(true);

        UserAdapter userAdapter = new UserAdapter(DataSource.users);
        PostAdapter postAdapter = new PostAdapter(DataSource.users);

        rv_story.setAdapter(userAdapter);
        rv_post.setAdapter(postAdapter);

    }
}