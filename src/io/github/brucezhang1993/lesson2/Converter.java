package io.github.brucezhang1993.lesson2;

import org.jetbrains.annotations.Nullable;

import java.nio.charset.StandardCharsets;

/**
 * @author bruce
 */
public class Converter {
    public static String asString(int number) {
        return String.valueOf(number);
    }

    public static String asString(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static int intFromString(String string) {
        return Integer.parseInt(string);
    }

    public static long longFromString(String string) {
        return Long.parseLong(string);
    }

    public static float floatFromString(String string) {
        return Float.parseFloat(string);
    }

    public static double doubleFromString(String string) {
        return Double.parseDouble(string);
    }

    public static byte[] bytesFromString(String string) {
        return string.getBytes(StandardCharsets.UTF_8);
    }

    public static char ascii2char(int ascii) {
        return (char) ascii;
    }

    public static int char2ascii(char ch) {
        return (int) ch;
    }

    @Nullable
    static String baseTransform(String num, int fromBase, int toBase) {
        if (fromBase == 10) {
            switch (toBase) {
                case 2:
                    return Integer.toBinaryString(Integer.parseInt(num));
                case 16:
                    return Integer.toHexString(Integer.parseInt(num));
                default:
                    return null;
            }
        }
        switch (toBase) {
            case 10:
                return Integer.valueOf(num, fromBase).toString();
            case 2:
                return Integer.toBinaryString(Integer.valueOf(num, fromBase));
            case 16:
                return Integer.toHexString(Integer.valueOf(num, fromBase));
            default:
                return null;
        }
    }
}
