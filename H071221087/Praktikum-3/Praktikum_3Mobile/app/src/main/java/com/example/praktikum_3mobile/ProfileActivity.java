package com.example.praktikum_3mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    public static final String PARCELDATA = "parceldata";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        TextView username = findViewById(R.id.usernameAccount);
        ImageView profilAccount = findViewById(R.id.profilAccount);
        ImageView postinganAccount = findViewById(R.id.postinganAccount);
        TextView sumfollower = findViewById(R.id.sumfollower);
        TextView sumfollowing = findViewById(R.id.sumfolowing);

        User user = getIntent().getParcelableExtra(PARCELDATA);
        username.setText(user.getUsername());
        profilAccount.setImageResource(user.getProfile());
        postinganAccount.setImageResource(user.getPost());
        sumfollower.setText(user.getFollower());
        sumfollowing.setText(user.getFollowing());

       postinganAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
                intent.putExtra(PostActivity.PARCELDATA,user);
                startActivity(intent);
            }
        });

        profilAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, StoryActivity.class);
                intent.putExtra(StoryActivity.PARCELDATA,user);
                startActivity(intent);
            }
        });
    }
}