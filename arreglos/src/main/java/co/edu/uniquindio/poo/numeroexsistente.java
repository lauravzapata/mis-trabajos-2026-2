package co.edu.uniquindio.poo;

import java.util.Scanner;

public class numeroexsistente {
    public static void main(String [] args){
        int numero= ingresarNumeroEntero("Ingrese el numero que desee: ");
        int [] conjunto={7, 14, 23, 31, 42, 56, 68, 79, 85, 97};
        boolean numeroarreglo= determinarNumero(conjunto, numero);
        System.out.print(numeroarreglo);

    }
    public static int ingresarNumeroEntero (String mensaje) {
        Scanner sc= new Scanner(System.in);
        System.out.println(mensaje);
        int numero= sc.nextInt();
        return numero;
    }
    public static boolean determinarNumero ( int [] conjunto, int numero){
        boolean siono= false;
        for(int i=0; i<conjunto.length; i++ ){
            if(numero==conjunto[i]){
                siono= true;
            }
        }
        return siono;
    }

}

