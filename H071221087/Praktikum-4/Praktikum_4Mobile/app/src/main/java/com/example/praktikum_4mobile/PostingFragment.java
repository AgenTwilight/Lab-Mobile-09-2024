package com.example.praktikum_4mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PostingFragment extends Fragment {

    private EditText addcontent;
    private ImageView addimg;
    private Button submitpost;
    private boolean isImageChanged = false;
    private Uri image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewpost = inflater.inflate(R.layout.fragment_posting, container, false);
        addcontent = viewpost.findViewById(R.id.addcontent);
        addimg = viewpost.findViewById(R.id.addimg);
        submitpost = viewpost.findViewById(R.id.submitpost);

        addimg.setOnClickListener(view -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");
            launcherIntentGallery.launch(openGallery);
        });

        submitpost.setOnClickListener(view -> {
            if (addcontent.getText().toString().trim().isEmpty()) {
                Toast.makeText(getActivity(), "Content is Still Empty", Toast.LENGTH_SHORT).show();
                return;
            } if (!isImageChanged) {
                Toast.makeText(getActivity(), "Select an Image First", Toast.LENGTH_SHORT).show();
                return;
            } else {
                User newUser = new User("Nova", "INTJ", addcontent.getText().toString(), R.drawable.intj, image);
                DataSource.users.add(0, newUser);
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.frame, new HomeFragment())
                        .commit();
                Toast.makeText(getActivity(), "Post Successfully Added", Toast.LENGTH_SHORT).show();
                BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.bottomnav);
                bottomNavigationView.setSelectedItemId(R.id.home);
            }
        });

        return viewpost;

    } ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    image = data.getData();
                    addimg.setImageURI(image);
                    isImageChanged = true;
                }
            }
    );
}