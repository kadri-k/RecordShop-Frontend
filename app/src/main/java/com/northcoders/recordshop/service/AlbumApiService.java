package com.northcoders.recordshop.service;

import com.northcoders.recordshop.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumApiService {

    @GET("albums")
    Call<List<Album>> getAllAlbums();

//    @GET("albums/{id}")
//    Call<Album> getAlbumById(@Path("id") Long id);
//
//    @POST("albums")
//    Call<Album> postNewAlbum(@Body Album album);
}
