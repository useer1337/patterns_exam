package com.company.structural.proxy;

/**
 * @author koval
 */
public class Client {

    public static void main(String[] args) {
        YoutubeLib service = new YoutubeClass();
        client(service);
    }

    public static void client(YoutubeLib youtubeLib){
        System.out.println(youtubeLib.downloadVideo(4));
    }

}
