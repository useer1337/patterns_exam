package com.company.structural.facade.library;

public class VideoConverter {

    public void convertVideo(String name, String format) {
        if (format.equals("MP4"))
            new MP4().convert(name);
        else if (format.equals("AVI"))
            new AVI().convert(name);
        else
            System.err.println("Данный формат видео не поддерживается");
    }

}
