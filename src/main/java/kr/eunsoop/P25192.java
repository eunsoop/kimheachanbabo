package kr.eunsoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!br.ready()) continue;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                set.clear();
            } else if(!set.contains(s)) {
                cnt++;
                set.add(s);
            }
        }

        System.out.println(cnt);
    }
}