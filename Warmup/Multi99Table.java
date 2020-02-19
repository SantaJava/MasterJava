package Warmup;

import java.io.*;
import java.nio.file.Files;

public class Multi99Table {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
        try {
            TriangleLB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void TriangleLB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader bf = new BufferedReader(new FileReader("hoho.txt")); for files
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        br.close();
    }
}
