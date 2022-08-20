package com.qacart.todo.utils;

import java.io.*;
import java.util.Properties;

public class PropUtils {

    public static Properties loadProp(String filePath)  {
        File file = new File(filePath);

        try {
           InputStream inputStream = new FileInputStream(file);
           Properties prop = new Properties() ;
           prop.load(inputStream);
           inputStream.close();
           return prop ;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File Not Found Please Check The Path ");
        } catch (IOException e) {
            throw new RuntimeException(" Cannot Find The Properties ");
        }


    }
}
