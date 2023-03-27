 package com.bridggelabz;

public class Generics<T extends Comparable<T>> {
    T x,y,z;
    public Generics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T FindMax(){
        return Generics.FindMax(x,y,z);
    }
    public static <T extends Comparable<T>>T FindMax(T a, T b, T c){
        T max=a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ", "+b+" and "+c+ " is: "+max);
        return max;
    }

    public static void main(String[] args) {
        Integer a=22,b=4,c=6;
        Float d = 12.3F ,e=5.9F,f=2.3F;
        String g="Anjali",h="Rawke",i="Zain";
        new Generics<Integer>(a,b,c).FindMax();
        new Generics<Float>(d,e,f).FindMax();
        new Generics<String>(g,h,i).FindMax();
    }
}
