/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Vineet
 */
public class Challenge2 {

    public static void main(String[] args) {
        int T = 10;
        int n1 = 0, n2 = 1, n3;
        int sum = 0;
        for (int i = 0; i < T; i++) {
            n3 = n1 + n2;
            if (n3 % 2 == 0) {
                sum += n3;
            }

            n1 = n2;
            n2 = n3;
        }
        System.out.print(" " + sum);
    }
}
