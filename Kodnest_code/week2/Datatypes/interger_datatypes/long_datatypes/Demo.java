/*
 long d;

d = 8 Bytes (mtbl long 1 long = 8 bits ka hota hai)
8 Bytes = 64 bits 

For count ranges 
        n bits

    -2^n-1 to +2^n-1-1

        16 bits

    -2^64-1 to +2^64-1-1
    -2^63    to  + 2^63-1
    -9223372036854775808L to +9223372036854775807L

    Ex:-
    Right ex:- d=0L; d=100L; d=2147483648L;
    wrong ex:- d=-9223372036854775809L; (underflow)
                d= +9223372036854775808L;(overflow)

        Note:- You need to put L to define long type datatype
        bcz if you won't provide this then it will allot 8Byte(84bits) memory to variables
 */

public class Demo {
    public static void main(String args[]) {
        long d;
        d = 0;
        d = 100L;
        d = -9223372036854775809L;
        d = 9223372036854775808L;
        System.out.println(a);
    }
}

/*
 * OUTPUT:-
 * 1. 0
 * 2. 100
 * 3. error: integer number too large: -9223372036854775809
 * d = -9223372036854775809L;
 * 
 * 4.error: integer number too large: 9223372036854775808
 * d = 9223372036854775808L;
 */