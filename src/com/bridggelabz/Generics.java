 package com.bridggelabz;

public class Generics<T extends Comparable<T>> {
    public void FindMaxFloat(Float a, Float b, Float c){
        float max = a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ","+b+" and "+c+ " is: "+max);
    }

    public static void main(String[] args) {
        Generics genericsProgram = new Generics();
        Float d = 23.5F ,e=8.3F,f=1.6F;
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        genericsProgram.FindMaxFloat(d,e,f);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        genericsProgram.FindMaxFloat(e,d,f);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        genericsProgram.FindMaxFloat(d,f,d);
    }

}
