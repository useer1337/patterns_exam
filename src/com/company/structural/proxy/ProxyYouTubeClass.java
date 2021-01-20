package com.company.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author koval
 */
public class ProxyYouTubeClass implements YoutubeLib {

    private String[] cached;
    private YoutubeClass service;

    public ProxyYouTubeClass() {
        service = new YoutubeClass();
        cached = new String[5];
    }

    @Override
    public String downloadVideo(int id) {

        if (cached[id] == null){
            String video = service.downloadVideo(id);
            cached[id] = video;

            return video;
        }

        return cached[id];
    }


}
