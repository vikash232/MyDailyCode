/*
 byte a;

a = 1 byte (mtbl byte 1 Byte = 8 bits ka hota hai)

For count ranges 
        n bits

    -2^n-1 to +2^n-1-1

        8 bits

    -2^8-1 to +2^8-1-1
    -2^7    to  + 2^7-1
    -128 to +127

    Ex:-
    Right ex:- a=0; a=-128; a=30; a=+127;
    wrong ex:- a=-129; (underflow)
                a= +129;(overflow)
 */

public class Demo {
    public static void main(String args[]) {
        byte a;
        a = 100;
        a = 0;
        a = -129;
        a = 129;
        System.out.println(a);
    }
}

/*
 * OUTPUT:-
 * 1. 100
 * 2. 0
 * 3. error: incompatible types: possible lossy conversion from int to byte
 * a = -129;
 * 
 * 4.error: incompatible types: possible lossy conversion from int to byte
 * a = 129;
 */