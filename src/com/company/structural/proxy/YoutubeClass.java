package com.company.structural.proxy;

/**
 * @author koval
 */
public class YoutubeClass implements YoutubeLib {

    private String[] videos = {"Видео1", "Видео2", "Видео3", "Видео4", "Видео5"};

    @Override
    public String downloadVideo(int id) {
        return videos[id];

    }
}
