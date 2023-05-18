package com.sutrix.demon.core.servlets;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class Regex {
    public static boolean isValidPath(String path) {
        try {
            Paths.get(path);
            //justForTest
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
