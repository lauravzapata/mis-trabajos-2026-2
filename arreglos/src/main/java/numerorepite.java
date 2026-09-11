public class numerorepite {
    public static void main(String[] args) {

        int[] numeros = {5, 8, 3, 5, 2, 8, 5, 9, 5, 67, 67, 67, 2, 5, 4, 7, 10, 23};

        int numeroBuscado = repositorio.ingresarNumeroEntero("Ingrese el número que desea buscar: ");
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("El número " + numeroBuscado + " se repite " + contador + " veces");
        } else {
            System.out.println("El número " + numeroBuscado
                    + " no se encuentra en el arreglo");
        }
    }
}

// Tarea
// 1. imprimir una matriz
// 2. sumar todos los numeros de una matriz
// 3. Sumar los numeros de la diagonal de una matriz
// 4. Dibujar en una matriz un espiral de numeros
