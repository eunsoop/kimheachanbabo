package kr.eunsoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!br.ready()) continue;

        String s = br.readLine();
        String[] parts = s.split(":", -1);

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isEmpty()) {
                for (int j = 0; j < 9-parts.length; j++) {
                    System.out.print("0000");
                    if(i < parts.length - 1) System.out.print(":");
                }
                if(parts[i+1].isEmpty()) {
                    i++;
                    System.out.print("0000");
                    if(i < parts.length - 1) System.out.print(":");
                }
            } else {
                System.out.printf("%04x", Integer.parseInt(parts[i], 16));
                if(i < parts.length - 1) System.out.print(":");
            }
        }
    }
}