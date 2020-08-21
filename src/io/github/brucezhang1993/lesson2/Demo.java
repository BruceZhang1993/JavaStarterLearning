package io.github.brucezhang1993.lesson2;

import java.util.Arrays;

/**
 * @author bruce
 */
public class Demo {
    public static void main(String[] args) {
        // Practice 1
        // byte 127 => 01111111 => int 127
        byte a1 = 127;
        // byte 128 => 10000000 => int -128
        // byte b1 = 128;
        // byte -128 => 10000000 => int -128
        byte c1 = -128;
        String a2 = Integer.toBinaryString(a1 & 0xff);
        String c2 = Integer.toBinaryString(c1 & 0xff);
        System.out.println(a2);
        System.out.println(c2);
        // System.out.println(Integer.toBinaryString(b1 & 0xff));
        int a3 = Integer.parseInt(a2, 2);
        int c3 = Integer.parseInt(c2, 2);
        System.out.println(a3);
        System.out.println(c3);
        // Practice 2
        AnotherInteger i1 = AnotherInteger.valueOf(1024);
        AnotherInteger i2 = AnotherInteger.valueOf(1024);
        AnotherInteger i3 = AnotherInteger.valueOf(-20);
        AnotherInteger i4 = AnotherInteger.valueOf(-20);
        System.out.println(i1.getValue());
        System.out.println(i2.getValue());
        System.out.println(i3.getValue());
        System.out.println(i4.getValue());
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        // Practice 3
        System.out.println(Converter.intFromString("120"));
        System.out.println(Converter.longFromString("1245728913"));
        System.out.println(Converter.floatFromString("120.134"));
        System.out.println(Converter.doubleFromString("10.1122355"));
        System.out.println("abcdefg => " + Arrays.toString(Converter.bytesFromString("abcdefg")));
        System.out.println(Converter.asString(1200));
        System.out.println(Arrays.toString(new byte[]{97, 98, 99, 100}) + " => " + Converter.asString(new byte[] {97, 98, 99, 100}));
        // Practice 4
        System.out.println("a => " + Converter.char2ascii('a'));
        System.out.println("98 => " + Converter.ascii2char(98));
        // Practice 5
        System.out.println("123 => " + Converter.baseTransform("123", 10, 2));
        System.out.println("123 => " + Converter.baseTransform("123", 10, 16));
        System.out.println("1111011 => " + Converter.baseTransform("1111011", 2, 10));
        System.out.println("7d => " + Converter.baseTransform("7d", 16, 10));
        System.out.println("1111011 => " + Converter.baseTransform("1111011", 2, 16));
        System.out.println("7d => " + Converter.baseTransform("7d", 16, 2));
    }
}
