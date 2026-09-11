import java.util.Scanner;

public class repositorio {
    //Función para ingresar una cadena de texto
    public static String ingresarTexto(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = sc.nextLine();
        return texto;
    }

    //Función para ingresar un número entero
    public static int ingresarNumeroEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = sc.nextInt();
        return numero;
    }

    //Función para ingresar un número decimal
    public static double ingresarNumeroDecimal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        double numero = sc.nextDouble();
        return numero;
    }

    //Función para ingresar un valor booleano
    public static boolean ingresarValorBooleano(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        boolean valor = sc.nextBoolean();
        return valor;
    }
    //identificar vocal

    public static boolean identificarVocal(char letra) {
        boolean esVocal = false;
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            esVocal = true;
        }
        return esVocal;
    }

    //Funcion para ingresar un arreglo de texto
    public static String[] ingresarArregloTexto(int cantidad, String mensaje) {
        String[] nuevoArreglo = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nuevoArreglo[i] = ingresarTexto(mensaje);
        }
        return nuevoArreglo;
    }

    //Funcion para ingresar un numero entero arreglo
    public static int[] ingresarArregloEntero(int cantidad, String mensaje) {
        int[] nuevoArreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nuevoArreglo[i] = ingresarNumeroEntero(mensaje + i + "de " + cantidad);
        }
        return nuevoArreglo;
    }

    //Funcion para ingresar un arreglo de numero decimal
    public static double[] ingresarArregloNumeroDecimal(int cantidad, String mensaje) {
        double[] nuevoArreglo = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nuevoArreglo[i] = ingresarNumeroDecimal(mensaje + i + "de " + cantidad);
        }
        return nuevoArreglo;
    }

    //Funcion para ingresar un arreglo de boolean
    public static boolean[] ingresarArregloBoolean(int cantidad, String mensaje) {
        boolean[] nuevoArreglo = new boolean[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nuevoArreglo[i] = ingresarValorBooleano(mensaje + i + "de " + cantidad);
        }
        return nuevoArreglo;
    }
}
