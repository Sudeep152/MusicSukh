package com.sudeep.musicsukh.data.entities;

public class song {
    private String mediaId;
    private String imageUrl;
    private String songUrl;
    private String title;
    private String subtitle;


    public song() {
    }

    public song(String mediaId, String imageUrl, String songUrl, String title, String subtitle) {
        this.mediaId = mediaId;
        this.imageUrl = imageUrl;
        this.songUrl = songUrl;
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
