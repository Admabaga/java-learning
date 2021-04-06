package com.adrianlearning.com.adrianlearning.OOP.abstractions;

import com.adrianlearning.com.adrianlearning.OOP.abstractions.abstract_classes.CreditCarPayment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.abstract_classes.Currency;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.abstract_classes.PaymentAbstract;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.BitcoinPayment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.CashPayment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.CouponPayment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.Payment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.PersonalCardPayment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.PsePayment;
import com.adrianlearning.com.adrianlearning.OOP.abstractions.interfaces.WebPayment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payment> payments = creatingPayments();
     //   payments.forEach((xcaca) -> xcaca.pay(2000));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream()
                .filter((x) -> x % 2 == 0)
                .map(x -> x*x)
                .filter(z -> z > 20)
                .map(x -> transformToString(x))
                //
                .forEach(x -> System.out.println(x));
    }

    private static String transformToString(Integer x) {
        if (x == 36) return "Treinta y Seis";
        if (x == 64) return "Sesenta y cuatro";
        return "No sé";
    }

    private static void runningWithIndexFor(List<Payment> payments) {
        for (int i=0; i < payments.size(); i++){
            payments.get(i).pay(i*2500);
        }
    }

    private static List<Payment> creatingPayments() {
        Payment webPayment = new WebPayment();
        PsePayment psePayment = new PsePayment();
        CashPayment cashPayment = new CashPayment();
        CouponPayment couponPayment = new CouponPayment();
        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        PersonalCardPayment personalCardPayment = new PersonalCardPayment();
        List<Payment> payments = new ArrayList<>();
        payments.add(psePayment);
        payments.add(cashPayment);
        payments.add(couponPayment);
        payments.add(bitcoinPayment);
        payments.add(personalCardPayment);
        payments.add(webPayment);
        return payments;
    }

    private static void runningAbstractClasses() {
        PaymentAbstract paymentAbstract = new CreditCarPayment(Currency.DOLAR);
        paymentAbstract.pay(500000);
        paymentAbstract.setCurrency(Currency.EURO);
        paymentAbstract.pay(500000);
    }

    private static void runningInterfaces() {
        int selectedOption = 1;
        Payment payment;
        if (selectedOption == 0) payment = new CashPayment();
        else payment = new WebPayment();
        payment.pay(6000);
    }
}
