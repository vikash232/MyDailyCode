/*
 short a;

a = 2 Bytes (mtbl short 1 short = 8 bits ka hota hai)
2 Bytes = 16 bits 

For count ranges 
        n bits

    -2^n-1 to +2^n-1-1

        16 bits

    -2^16-1 to +2^16-1-1
    -2^15    to  + 2^15-1
    -32768 to +32767

    Ex:-
    Right ex:- b=0; b=30,000; b=32767; b=-32768;
    wrong ex:- b=-32769; (underflow)
                b= +32769;(overflow)
 */

public class Demo {
    public static void main(String args[]) {
        short b;
        b = 0;
        b = 100;
        b = -32769;
        b = 32769;
        System.out.println(b);
    }
}

/*
 * OUTPUT:-
 * 1. 0
 * 2. 100
 * 3. error: incompatible types: possible lossy conversion from int to short
 * b = -32769;
 * 
 * 4.error: incompatible types: possible lossy conversion from int to short
 * b = 32769;
 */