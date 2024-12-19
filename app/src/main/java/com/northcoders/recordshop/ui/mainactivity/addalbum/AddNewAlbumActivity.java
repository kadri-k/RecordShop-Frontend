package com.northcoders.recordshop.ui.mainactivity.addalbum;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.northcoders.recordshop.R;
import com.northcoders.recordshop.databinding.ActivityAddNewAlbumBinding;
import com.northcoders.recordshop.model.Album;

public class AddNewAlbumActivity extends AppCompatActivity {

    private ActivityAddNewAlbumBinding binding;
    private AddNewAlbumClickHandler handler;
    private Album album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_album);

        album = new Album();

        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_add_new_album
        );

    }
}