package com.adrianlearning.com.adrianlearning.OOP.LOL;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainLol {
    public static void main(String[] args) throws IOException {




        int i = 0;
        while(i < 1) {
            i++;
            System.out.println("Bienvenido A League Of Legens");
            System.out.println("1. Loggin");
            System.out.println("2. Recargar");
            System.out.println("3. Comprar");
            System.out.println("Por favor seleccione una opcion");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            System.out.println(name);

            if (name.equalsIgnoreCase("1")) {
                System.out.println("Please digit your name");
                String username = reader.readLine();
                System.out.println(username);
                System.out.println("Please digit your password");
                String password = reader.readLine();
                System.out.println(password);
            }
        }

        int choose = 0;
            switch (choose){
                case 1:
                    Log();
                    break;
                case 2:
                    System.out.println("Ingrese medio de pago: ");
                    System.out.println("1. Para pago por web, 2. Para pago por tarjeta de credito ");
                    String medioPago;
                    Scanner valorIngresado = new Scanner(System.in);
                    medioPago= valorIngresado.nextLine();
//                    if (1 < medioPago) {
//                        BuyerSkin buyerSkin = new WebPayment();
//                        buyerSkin.recarga(1000);
//                    }
//                    BuyerSkin buyerSkin1 = new CreditCard();
//                    buyerSkin.recarga();
//                    break;
//                case 3:
//                    BuyerSkin buyerSkin = new WebPayment();
//                    BuyerSkin buyerSkin1 = new CreditCard();
        }

        BuyerSkin buyerSkin = new WebPayment();
        buyerSkin.buySkin(Champions.GAREN);
        buyerSkin.recarga(100.0);
        buyerSkin.buySkin(Champions.GAREN);
        buyerSkin.recarga(100000.0);


    }

    private static void Log() {
        UserRepository userRepository = new UserRepository();
        Loger userAndPasswordLoger = new UserAndPasswordLoger(userRepository);
        Credential credential = new Credential("adrian", "1234", "123");
        userAndPasswordLoger.login(credential);

        GoogleRepository googleRepository = new GoogleRepository();
        Loger GoogleLog = new GoogleLog(googleRepository);
        Credential credential1 = new Credential("BFIASBFBK", "uDIABFUIVFB","456785");
        GoogleLog.login(credential1);
    }
}
