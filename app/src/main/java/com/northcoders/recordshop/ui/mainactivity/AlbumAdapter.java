package com.northcoders.recordshop.ui.mainactivity;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.northcoders.recordshop.R;
import com.northcoders.recordshop.databinding.AlbumItemBinding;
import com.northcoders.recordshop.model.Album;
import com.northcoders.recordshop.ui.mainactivity.AlbumAdapter;


import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    private List<Album> albumList;

    public AlbumAdapter(ArrayList<Album> albumList) {
        // make sure that the list is not null, initialise it if necessary
        this.albumList = albumList != null? albumList: new ArrayList<>();
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate the layout for each item in the RecyclerView using DataBinding
        AlbumItemBinding albumItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.album_item,
                parent,
                false
        );
        return new AlbumViewHolder(albumItemBinding);  // return a new AlbumViewHolder w. binding
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        // get the current Album object from the list
        Album album = albumList.get(position);
        // bind the album data to the holder's albumItemBinding
        holder.albumItemBinding.setAlbum(album);
    }

    @Override
    public int getItemCount() {
        // return the size of the album list to determine the number of items
        return albumList.size();
    }

    // ViewHolder class for Album items
    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        private AlbumItemBinding albumItemBinding;

        //constructor for ViewHolder
        public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
            super(albumItemBinding.getRoot());
            this.albumItemBinding = albumItemBinding;
        }
    }
}
