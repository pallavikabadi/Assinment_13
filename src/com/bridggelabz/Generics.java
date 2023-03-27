 package com.bridggelabz;

public class Generics<T extends Comparable<T>> {
    public void FindMaxString(String a,String b,String c){
        String max=a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ", "+b+" and "+c+ " is: "+max);
    }

    public static void main(String[] args) {
        Generics genericsProgram = new Generics();
        String g="Anjali",h="Rawke",i="Zain";
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        genericsProgram.FindMaxString(i,h,g);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        genericsProgram.FindMaxString(h,i,g);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        genericsProgram.FindMaxString(g,h,i);
    }
    }

}
