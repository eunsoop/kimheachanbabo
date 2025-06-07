package kr.eunsoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!br.ready()) continue;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] v = new boolean[26];
            boolean isg = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (v[c - 'a']) {
                    if (s.charAt(j - 1) != c) {
                        isg = false;
                        break;
                    }
                } else {
                    v[c - 'a'] = true;
                }
            }

            if (isg) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}