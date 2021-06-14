package com.codegym;

public class ResultFizzBuzz {

    public static String fizzBuzz(int number) {
        if (number > 0) {
            if(number%3==0 && number%5==0){
                System.out.println("FizzBuzz");
            }else if(number%5==0){
                System.out.println("Buzz");
            }else if(number%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println(number);
            }

        }else {
            System.out.println("Nhap number >0!");
        }
        return "Fizz";
    }
}
