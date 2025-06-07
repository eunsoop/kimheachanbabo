package kr.eunsoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P25206 {

    private final static Map<String, Double> map = new HashMap<>();
    static {
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!br.ready()) continue;

        double sum = 0.0;
        double hsum = 0.0;

        while (br.ready()) {
            String s = br.readLine();
            String[] parts = s.split(" ");

            double g = Double.parseDouble(parts[1]);
            String ap = parts[2];

            sum += g * map.getOrDefault(ap, 0.0);
            if(!ap.equals("P")) hsum += g;
        }

        System.out.printf("%.6f", sum/hsum);
    }
}