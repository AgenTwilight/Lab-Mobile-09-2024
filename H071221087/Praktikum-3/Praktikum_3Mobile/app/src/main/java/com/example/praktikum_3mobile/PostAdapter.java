package com.example.praktikum_3mobile;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private final ArrayList<User> post;

    public PostAdapter(ArrayList<User> post) {
        this.post = post;
    }


    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_post, parent, false);
        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        User user = post.get(position);

        holder.usernamepost.setText(user.getUsername());
        holder.profilepost.setImageResource(user.getProfile());
        holder.posts.setImageResource(user.getPost());
        holder.captionpost.setText(user.getCaption());
        holder.profilepost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), StoryActivity.class);
                intent.putExtra(StoryActivity.PARCELDATA,user);
                holder.itemView.getContext().startActivity(intent);
            }
        });

        holder.usernamepost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), ProfileActivity.class);
                intent.putExtra(ProfileActivity.PARCELDATA,user);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return post.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profilepost, posts;
        TextView usernamepost, captionpost;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profilepost = itemView.findViewById(R.id.profile);
            usernamepost = itemView.findViewById(R.id.username);
            posts = itemView.findViewById(R.id.post);
            captionpost = itemView.findViewById(R.id.caption);
        }
    }
}
