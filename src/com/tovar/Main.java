package com.tovar;

import java.awt.desktop.SystemEventListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean isAdult = false;
       // String continueProgram = "";
        int age = 19;

        /*System.out.println("¿Deseas hacer una operación?  Si/No");
        continueProgram = read.nextLine();

        String [] isValidOption = continueProgram.split("/");

        if (isValidOption.length == 2) {
            System.out.println("Se ha ingresado opción invalida");
        } else {
            System.out.println("Se ha ingresado opción valida");
        }

        if(age >= 12 && age <= 19) {
            System.out.println("Estoy en la adolescencia");
        } else if(age >= 19 || age<= 59) {
            System.out.println("Soy adulto");
        } else {
            System.out.println("Rango no definido");
        }*/



        /**continueProgram =  continueProgram.toUpperCase().trim();

        if (continueProgram.contains("SI")) {
            System.out.println("¿Qúe operación desa realizar?");
        } else {
            System.out.println("Se ha finalizado el programa");
        }*/

       /* if(!isAdult) {
            // Ejecutar código
            System.out.println("Es verdadera la condición");
        } else {
            System.out.println("No es verdadera la condición");
        }*/

        /**Ciclos*/

      /**For*/
     // cicloFor();
        //item--      item = item - 1
        // item++      item = item + 1;

        //Ejercicio:
        /**
         * Crear una función que reciba la tabla de multiplicar a implimir e imprimir cada uno de sus valores pero en
         * caso de que el valor sea par imprimir su nombre en caso contario imprimir el número.
         * */

        //multiplicationTable(1);

        //Ejercicio:
        /**
         * Crear una función que reciba un número y ese valor lo tenemos que multiplicar por 1.33 y
         * redondear el valor para implimir 10 veces esa multiplicación.
         * */

        //multiply(3);

        /**Do while*/
        int continueInProgram;
        int ofValue;

        ArrayList<String> text = new ArrayList<String>();

        text.add("Mi");
        text.add("Nombre");
        text.add("Es");
        text.add("Uriel");
        text.add("Tovar");

        System.out.println("Size: " + text.size());

        System.out.println("Size: " + text.get(0));

        // Array
        String [] array = new String[10];


        //["Mi"] ["Nombre"] ["Es"] ["Uriel"] ["Tovar"] [1]
        //  0         1        2       3          4       5

       /* do {
            System.out.print("Introduce un número > 0: ");
            continueInProgram = read.nextInt();
            System.out.print("Ingresa el número a determinar su tabla de multiplicar: ");
            ofValue = read.nextInt();
            multiplicationTable(ofValue);
        }while (continueInProgram<0);*/

    }

    public static void cicloFor() {
        for (int item = 10; item >= 0; item--) {
            if (item == 0) {
                System.out.println("Despegue");
            } else  {
                System.out.println("-T " + item);
            }
        }
    }

    private static void multiply(int number) {
        for(int value = 1; value <= 10; value++) {

           // System.out.println("Number: " + number * 1.33);

            double roundedNumber = Math.round(number * 1.33);

            System.out.println("Rounded number: " + "N: " + value + " " + roundedNumber);
        }
    }

    private static void multiplicationTable(int ofValue) {
        for(int value = 1; value <= 10; value++) {
            if( ( (value * ofValue) % 2) == 0) {
                System.out.println("Uriel Tovar");
            } else {
                System.out.println("Value: " + "N: " + value + " " + (value * ofValue));
            }
        }
    }

}
