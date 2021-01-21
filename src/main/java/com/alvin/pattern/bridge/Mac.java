package com.alvin.pattern.bridge;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 11:03 PM
 */
//mac版本
public class Mac extends OperatingSystemVersion {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}