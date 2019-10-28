package com.example.sliderimageretrofit.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImageModel {

    @SerializedName("id")
    private String id;

    @SerializedName("nama")
    private String nama;

    @SerializedName("gambar")
    private String gambar;

    @SerializedName("value")
    private String value;

    @SerializedName("message")
    private String message;

    @SerializedName("result")
    List<ImageModel> dataImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ImageModel> getDataImage() {
        return dataImage;
    }

    public void setDataImage(List<ImageModel> dataImage) {
        this.dataImage = dataImage;
    }
}
