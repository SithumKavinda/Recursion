package com.Recursion.Factorial;

public class facto {

    public facto(int no){

        System.out.println();

        System.out.println("Factorial of " + no + " = "+ factorial(no));

    }

    private int factorial(int no){

        if(no == 0){
            return 1;
        }
        else{
            return (no * factorial(no - 1));
        }
    }
}
