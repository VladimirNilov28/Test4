/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 101, min = 0, num = 1, tryes = 0, a = 0; 
        Random random = new Random();
        int [] Numbers  = new int [100];
        for (int i = 0; i < Numbers.length; i++) {
            a = random.nextInt(max - min + 1) + min;
            for (int j = 0; j < a; j++) {
                if (j % 2 != 0){
                    Numbers[i] = j;
                }
            }
            num+=2;
            if(i==100){
                break;
            }
        }
        System.out.println("Случайные нечётные чила:");
        int k = 0;
        Arrays.sort(Numbers);
        for (int i = 0; i < Numbers.length; i++) {
            System.out.printf("%4d", Numbers[i]);
            k++;
            if(k==10){
                System.out.println("");
                k = 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < Numbers.length; i++) {
            sum+=Numbers[i];
        }
        sum/=100;
        System.out.println("среднее арифметическое всех чисел = "+sum);
    }
    
}
