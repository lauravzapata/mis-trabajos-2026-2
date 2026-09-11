package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // 1. crear un arreglo e inicializarlo
        // 2. realizar un metodo que sume todos los numeros del arreglo y retornar la suma

        int [] numeros= { 2, 5, 4, 7};
        int suma=0;

        for (int i= 0; i< numeros.length; i++){
            suma+= numeros[i];
        }
        System.out.println("la suma de sus numeros es: "+suma);



    }
}
