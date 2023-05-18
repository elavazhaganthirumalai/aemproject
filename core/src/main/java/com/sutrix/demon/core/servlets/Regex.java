package com.sutrix.demon.core.servlets;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class Regex {
   /* public static Boolean pathValidate(String path){
        if(path.matches("^(\\/{0,1}(?!\\/))[A-Za-z0-9\\/\\-_]+(\\.([a-zA-Z]+))?$")){
            return false;
        }
        return true;
    }*/
   public static boolean isValidPath(String path) {
       try {
           Paths.get(path);
       } catch (InvalidPathException | NullPointerException ex) {
           return false;
       }
       return true;
   }

    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
       boolean boolean1= isValidPath("/home/users/stcdam/yFqIIRiPA3Pup7745RDS/profile/image");
        System.out.println(boolean1);
    }
}
