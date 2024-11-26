/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Owner
 */
import java.util.Scanner;

public class Fibonacci {

    //Method to calculate the nth Fibonacci number in O(n) time complexity
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1, fib = 0;


        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();


        int result = fibonacci(n);


        System.out.println("The " + n + " Fibonacci number is: " + result);

        scanner.close();
    }
}
