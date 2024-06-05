package com.example.praktikum_3mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StoryActivity extends AppCompatActivity {

    public static final String PARCELDATA = "data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_story);

        TextView username = findViewById(R.id.username);
        ImageView profile = findViewById(R.id.imgProfile);
        LinearLayout igstory = findViewById(R.id.imgPost);

        User user = getIntent().getParcelableExtra(PARCELDATA);
        username.setText(user.getUsername());
        profile.setImageResource(user.getProfile());
        igstory.setBackgroundResource(user.getStory());

        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoryActivity.this, ProfileActivity.class);
                intent.putExtra(ProfileActivity.PARCELDATA,user);
                startActivity(intent);
            }
        });
    }
}