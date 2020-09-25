package io.github.brucezhang1993.lesson5;

import java.util.Arrays;

class BizException extends Exception {
    public BizException(String message) {
        super(message);
    }
}

public class ExceciseFour {
    private static String[] payments = {"wechat", "alipay", "cmb"};

    private static void startPayment(String payment, double amount) throws BizException {
        if (!Arrays.asList(payments).contains(payment)) {
            throw new BizException("Unsupported method");
        }
        System.out.printf("Payment: %s Amount: %.2f\n", payment, amount);
    }

    public static void main(String[] args) {
        try {
            startPayment("wechat", 1.0);
            startPayment("payco", 1.0);
        } catch (BizException bizException) {
            System.out.println(bizException.getMessage());
        }
    }
}
