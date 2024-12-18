package com.northcoders.recordshop.ui.mainactivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.northcoders.recordshop.databinding.ActivityMainBinding;
import com.northcoders.recordshop.model.Album;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Album> albumList;
    private AlbumAdapter albumAdapter;
    private ActivityMainBinding binding;
    private MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // initialise MainActivityViewModel
       mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
       albumList = new ArrayList<>();
        // method to get all albums when starts
        getAllAlbums();
    }

        private void getAllAlbums() {
            mainActivityViewModel.getAllAlbums().observe(this, new Observer<List<Album>>() {
                @Override
                public void onChanged(List<Album> albums) {
                    // albums refers to the variable name of your List of Album objects
                    albumList = (ArrayList<Album>) albums;

                    displayInRecyclerView();
                }
            });
        }

        // method to display albums in the RecyclerView
        private void displayInRecyclerView() {
            // initialise the RecyclerView
            recyclerView = binding.recyclerview;

            // create and set the Adapter to the RecyclerView
            albumAdapter = new AlbumAdapter(albumList);  // Assume AlbumAdapter constructor accepts ArrayList<Album>
            recyclerView.setAdapter(albumAdapter);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setHasFixedSize(true);


    }
}