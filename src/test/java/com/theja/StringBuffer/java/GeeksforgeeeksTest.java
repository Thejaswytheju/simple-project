package com.theja.StringBuffer.java;

import java.nio.Buffer;

public class GeeksforgeeeksTest {
    public static void main(String args[]) {
        String s1 = "geeks";
        s1.concat(s1);
        System.out.println("string is:" + s1);
        StringBuilder s2 = new StringBuilder("forgeeks");
        s1.concat(String.valueOf(s2));
        System.out.println("String is:" +s2);
        StringBuilder s3 = new StringBuilder("forgeeks");
        s1.concat(String.valueOf(s3));
        System.out.println("String is:" +s3);
    }

}




