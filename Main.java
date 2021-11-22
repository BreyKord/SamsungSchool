package com.company;

public class Main {

    public static void main(String[] args) {
	int [] numbers  =  {92,43,1,0,24,50,2,2,3,4,88};
//    first
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] == 24)
            {
                System.out.println("Число 24 найдено/ i = " + i);
            }
        }
//        second
        int bufer;
        int len = numbers.length;
        for (int i = 0; i < len / 2; i++) {
            bufer = numbers[i];
            numbers[i] = numbers[len - 1 - i];
            numbers[len - 1 - i] = bufer;
            }
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
//      third
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum = " + sum);
//        fourth
        int maxkol = 0;
        int maxel = 0;
        for (int i = 0; i < len; i++) {
            int kol = 0;
            for (int j = 0; j < len; j++) {
                if (numbers[i] == numbers[j]){
                    kol++;
                }
            if (kol > maxkol) {
                maxkol = kol;
                maxel = numbers[i];
            }
            }
        }
        System.out.println("max repeated number is: " + maxel);
// fifth
        float mean;
        sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + numbers[i];
        }
        mean = sum / len;
        System.out.println("mean = " + mean);
//        sixth
        int n = 150;
        numbers = new int[n];
        for (int i = 0; i < n-1; i++) {
            numbers[i] = (int)(Math.random() * 100);
            System.out.print(" " + numbers[i]);
        }
    }
    }

