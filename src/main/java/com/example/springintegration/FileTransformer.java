package com.example.springintegration;


public class FileTransformer {

    public String transformFile(String fileName) {
        StringBuilder result = new StringBuilder();
        result.append(fileName);
        return result.toString();
    }

}

