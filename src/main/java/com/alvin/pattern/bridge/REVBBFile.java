package com.alvin.pattern.bridge;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 11:02 PM
 */
//rmvb文件
public class REVBBFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}