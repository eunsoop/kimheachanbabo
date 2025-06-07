package kr.eunsoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2941 {
    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList("c=", "c-", "d-", "lj", "nj", "s=", "z=");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!br.ready()) continue;

        String q = "", q2;
        int count = 0;

        while (br.ready()) {
            char r = (char)br.read();

            q += String.valueOf(r);
            if(q.length() > 3) {
                q = q.substring(1);
                count++;
            }
            q2 = q.length() <= 1 ? q : q.substring(q.length()-2);

            boolean isQ3 = q.equals("dz=");
            if(q.equals("dz=") || list.contains(q2)) {
                count += !isQ3?q.replaceAll(q2, "").replaceAll("\n", "").replaceAll(" ", "").length():0;
                q = "";
                q2 = "";
                count++;
            }else if (r== '\n' || r == ' ') {
                count += q.replaceAll("\n", "").replaceAll(" ", "").length();
                break;
            }
        }

        System.out.println(count);
    }
}