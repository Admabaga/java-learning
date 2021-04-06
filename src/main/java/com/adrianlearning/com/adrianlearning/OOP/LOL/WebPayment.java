package com.adrianlearning.com.adrianlearning.OOP.LOL;

public class WebPayment extends BuyerSkin {
    @Override
    public void recarga(Double valueRecharger) {

        System.out.println("tu saldo actual es: " + getAvailableAmount());
        setAvailableAmount(getAvailableAmount()+ valueRecharger);
        if(valueRecharger >= 1000){
            double promo= valueRecharger*0.05;
            setAvailableAmount(getAvailableAmount()+ promo);
        }
        System.out.println("tu nuevo saldo es: " + getAvailableAmount());
    }
}
