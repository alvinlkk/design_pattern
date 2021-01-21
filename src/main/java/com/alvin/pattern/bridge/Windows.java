package com.alvin.pattern.bridge;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 11:03 PM
 */
//Windows版本
public class Windows extends OperatingSystemVersion {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}