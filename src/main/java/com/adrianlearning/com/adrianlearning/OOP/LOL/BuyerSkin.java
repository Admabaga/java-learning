package com.adrianlearning.com.adrianlearning.OOP.LOL;

public abstract class BuyerSkin {
    private Double availableAmount=0.0;

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void buySkin(Champions champions){
        if(availableAmount >= champions.getSkinValue() ){
            System.out.println("Lo has adquirido");
        } else {
            System.out.println("estas pobre, recarga para comprar");
        }
    }

    public abstract void recarga(Double valueRecharger);
    }


