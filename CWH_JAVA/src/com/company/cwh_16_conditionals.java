package com.company;
import java.util.*;

public class cwh_16_conditionals {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:- ");
      int  age = scan.nextInt();
//        int age =85;
        if(age>18){
            System.out.println("Yes boy you can drive!");
        }
        else{
            System.out.println("No boy you cannot drive yet");
        }
    }
}
