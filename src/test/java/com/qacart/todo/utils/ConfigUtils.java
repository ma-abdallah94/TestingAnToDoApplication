package com.qacart.todo.utils;

import java.util.Properties;

public class ConfigUtils {
    private Properties props ;
    private static ConfigUtils configUtils;

    private ConfigUtils() {
        props = PropUtils.loadProp("src/test/java/com/qacart/todo/config/production.properties");
    }

    public static ConfigUtils getInstance () {
        if(configUtils==null) {
            configUtils=new ConfigUtils();
        }
        return configUtils ;
    }

    public String baseUrl () {
        String prop=props.getProperty("baseUrl");
        if ( prop != null ) return prop;
        throw new RuntimeException("Couldn't find the email ") ;
    }

    public String email () {
        String prop=props.getProperty("email");
        if ( prop != null ) return prop;
            throw new RuntimeException("Couldn't find the e-mail ") ;
        }


    public String password () {
        String prop=props.getProperty("password");
        if ( prop != null ) return prop;
        throw new RuntimeException("Couldn't find any passwords ") ;
    }
    }



