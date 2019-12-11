package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("A.txt");
        File file1 = new File("B.txt");
        FileWriter writer = new FileWriter(file);
        Scanner in = new Scanner(file);
        FileWriter writer1 = new FileWriter(file1);
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        writer.write(s);
        writer.close();
        String w = in.next();
        while (w!=null) {
            boolean first = w.startsWith("a");
            if (first==true){
                writer1.write(w);
                System.out.println(w);
            }
            w = in.next();
        }
        writer1.close();
        in.close();
    }
}
