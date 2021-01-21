package com.alvin.pattern.bridge;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 11:02 PM
 */
//avi文件
public class AVIFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}