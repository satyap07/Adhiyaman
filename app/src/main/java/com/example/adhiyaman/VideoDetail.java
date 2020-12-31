package com.example.adhiyaman;

public class VideoDetail {
    private String VideoName;
    private String VideoUrl;

    public VideoDetail(String videoName, String videoUrl) {
        VideoName = videoName;
        VideoUrl = videoUrl;
    }

    public String getVideoName() {
        return VideoName;
    }

    public String getVideoUrl() {
        return VideoUrl;
    }
}
