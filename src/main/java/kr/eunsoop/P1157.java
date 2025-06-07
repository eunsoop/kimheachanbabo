package kr.eunsoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P1157 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxK = -1, max = -1;
        boolean flag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!br.ready()) continue;

        while (br.ready()) {
            int i = String.valueOf((char)br.read()).toUpperCase().charAt(0);
            if(i==10 || i==13) continue;
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.getOrDefault(i, 0) > max) {
                maxK = i;
                max = map.get(i);
                flag = false;
            }else if (map.getOrDefault(i, 0) == max) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("?");
        } else {
            System.out.println((char)maxK);
        }
    }
}