package io.github.brucezhang1993.lesson2;

/**
 * Class AnotherInteger
 * @author bruce
 */
public final class AnotherInteger {
    private final int value;

    private AnotherInteger(int value) {
        this.value = value;
    }

    public static AnotherInteger valueOf(int i, boolean useCache) {
        if (useCache) {
            return IntegerCache.getCached(i);
        }
        return new AnotherInteger(i);
    }

    public static AnotherInteger valueOf(int i) {
        return AnotherInteger.valueOf(i, true);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }

    private static class IntegerCache {
        static final int LOW = 0;
        static final int HIGH = 1024;
        static final AnotherInteger[] CACHE;

        private IntegerCache() {}

        static {
            int size = HIGH - LOW + 1;
            int j = LOW;
            CACHE = new AnotherInteger[size];
            for (int i = 0; i < size; i++) {
                CACHE[i] = new AnotherInteger(j++);
            }
        }

        private static AnotherInteger getCached(int i) {
            return i >= LOW && i <= HIGH ? CACHE[i - LOW] : new AnotherInteger(i);
        }
    }
}
