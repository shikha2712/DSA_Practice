package com.company.string;
import java.util.Scanner;

    public class TernaryExpression {
        public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);

            int y=21;
            System.out.println("Enter Your age : ");
            int x =sc.nextInt();

            String aligible = (x>=y ? "go and Marry" :"You are a bady so padhai likhai kr :)");
            System.out.println(">>> "+aligible+" <<<");

        }
    }

