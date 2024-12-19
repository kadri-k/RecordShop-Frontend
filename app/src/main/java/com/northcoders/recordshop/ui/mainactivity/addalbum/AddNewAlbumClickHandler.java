package com.northcoders.recordshop.ui.mainactivity.addalbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.northcoders.recordshop.model.Album;
import com.northcoders.recordshop.ui.mainactivity.MainActivity;
import com.northcoders.recordshop.ui.mainactivity.MainActivityViewModel;


public class AddNewAlbumClickHandler {

    private Album album;
    private Context context;
    private MainActivityViewModel viewModel;

    public AddNewAlbumClickHandler(Album album, MainActivityViewModel viewModel, Context context) {
        this.album = album;
        this.viewModel = viewModel;
        this.context = context;
    }
    public void onSubmitBtnClicked(View view) {
        //conditional check whether fields are empty
        if(album.getTitle() == null || album.getArtist() == null || album.getGenre() == null || album.getPrice() == null) {
            Toast.makeText(context, "Fields cannot be empty!", Toast.LENGTH_SHORT).show();
        } else {

            Intent intent = new Intent(context, MainActivity.class);

            viewModel.addAlbum(album);

            context.startActivity(intent);
        }
    }
    public void onBackBtnClicked(View view) {
        Intent intent = new Intent (context, MainActivity.class);
        context.startActivity(intent);
    }

}
