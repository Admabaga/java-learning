package com.adrianlearning.com.adrianlearning.OOP.LOL;

public class CreditCard extends BuyerSkin {

    @Override
    public void recarga(Double valueRecharger) {
        System.out.println("tu saldo actual es: " + getAvailableAmount());
        setAvailableAmount(getAvailableAmount()+ valueRecharger);
        if (valueRecharger >= 1000){
            Double promo= valueRecharger*0.04;
            setAvailableAmount(getAvailableAmount() + promo);
        }
        System.out.println("tu nuevo saldo es: " + getAvailableAmount());
    }
}
