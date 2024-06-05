package com.example.praktikum_3mobile;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostActivity extends AppCompatActivity {

    public static final String PARCELDATA = "data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);

        TextView username = findViewById(R.id.username);
        ImageView profile = findViewById(R.id.profile);
        ImageView post = findViewById(R.id.post);
        TextView caption = findViewById(R.id.caption);

        User user = getIntent().getParcelableExtra(PARCELDATA);
        username.setText(user.getUsername());
        profile.setImageResource(user.getProfile());
        post.setImageResource(user.getPost());
        caption.setText(user.getCaption());

        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, ProfileActivity.class);
                intent.putExtra(ProfileActivity.PARCELDATA,user);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, StoryActivity.class);
                intent.putExtra(StoryActivity.PARCELDATA,user);
                startActivity(intent);
            }
        });
    }
}