package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean i =true;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a +=b;

        if(a!=15)
        {
            System.out.println(a);
        }
    }
}
