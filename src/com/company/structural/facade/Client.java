package com.company.structural.facade;

import com.company.structural.facade.library.VideoConverter;

public class Client {

    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        videoConverter.convertVideo("Котики и собачки", "ава");
    }

}
