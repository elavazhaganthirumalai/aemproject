package com.sutrix.demon.core.servlets;

import java.util.ArrayList;
import java.util.List;

public class EditAssetServlet {
    public static void main(String[] args) {
        List storedList=new ArrayList();
        storedList.add("file 1");
        storedList.add("file 2");
        storedList.add("file 3");
        storedList.add("file 4");
        storedList.add("file 5");
        storedList.add("file 6");
        System.out.println(storedList);
        List newList=new ArrayList();
        newList.add("file 1");
        newList.add("file 2");
        System.out.println(newList);
        for (int i=0;i<newList.size()-1;i++){
            for (int j=0;j<storedList.size()-1;j++){
                if (newList.get(i) != storedList.get(j)){
                    storedList.remove(j);
                }

            }
            System.out.println(storedList);
        }
    }
}
