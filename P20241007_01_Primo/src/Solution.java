import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println(name + " will take over the world in " + age + " years. Mwa-ha-ha!");
    }
}
