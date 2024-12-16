package com.northcoders.recordshop.service;

import com.northcoders.recordshop.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumApiService {

    @GET("Album")
    Call<List<Album>> getAllAlbums();
}
