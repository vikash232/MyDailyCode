/*
 int c;

c = 4 Bytes (mtlb bytes 1 Byte = 8 bits ka hota hai)

For count ranges 
        n bits

    -2^n-1 to +2^n-1-1

        32 bits

    -2^32-1 to +2^32-1-1
    -2^31    to  + 2^31-1
    -2147483648 to +2147483647

    Ex:-
    Right ex:- c=0; c=100; c=32769;
    wrong ex:- c=-2147483649; (underflow)
                c= +2147483648;(overflow)
 */

public class Demo {
    public static void main(String args[]) {
        byte a;
        c = 0;
        c = 100;
        c = -2147483649;
        c = 2147483649;
        System.out.println(c);
    }
}

/*
 * OUTPUT:-
 * 1. 0
 * 2. 100
 * 3. error: integer number too large: -2147483649
 * c = -2147483649;
 * 
 * 4.error: integer number too large: 2147483649
 * c = 2147483649;
 */