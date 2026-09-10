public class matricesTarea {

    public static void main (String [] args){
        System.out.println("Buenos dias, lea las opciones y escoja una: \n" +
                "1. Imprimir una matriz \n" + "2. Sumar todos los numeros de una matriz \n"+ "3. Sumar los numeros de la diagonal de una matriz \n" +
                "4. Dibujar en una matriz un espiral de numeros");
        int opcion= repositorio.ingresarNumeroEntero("Ingrese el numero de la opcion que quiera realizar: ");
        switch (opcion) {
            case 1:
                // 1. Imprimir una matriz
                System.out.println("Al ingresar su matriz intente que tenga mismo numero de filas y columnas");
                int filas= repositorio.ingresarNumeroEntero("Ingrese el numero de filas: ");
                int columnas= repositorio.ingresarNumeroEntero("Ingrese el numero de columnas: ");
                int matriz [][]= new int[filas][columnas];
                // i= filas ; j= columnas
                for(int i=0; i<filas; i++ ){
                    for(int j=0; j<columnas; j++){
                         matriz[i][j]= repositorio.ingresarNumeroEntero("Ingrese el numero para la posicion: "+ i+ j);
                    }
                }
                System.out.println("Su matriz es: ");
                for(int [] fila : matriz){
                    for(int numeros: fila){
                        System.out.print("[" +numeros+ "]");
                    }
                    System.out.println("");
                }
                break;

            case 2:
                //Sumar todos los numeros de una matriz
                System.out.println("Al ingresar su matriz intente que tenga mismo numero de filas y columnas");
                int filas2= repositorio.ingresarNumeroEntero("Ingrese el numero de filas: ");
                int columnas2= repositorio.ingresarNumeroEntero("Ingrese el numero de columnas: ");
                int matriz2 [][]= new int[filas2][columnas2];
                // i= filas ; j= columnas
                for(int i=0; i<filas2; i++ ){
                    for(int j=0; j<columnas2; j++){
                        matriz2[i][j]= repositorio.ingresarNumeroEntero("Ingrese el numero para la posicion: "+ i+ j);
                    }
                }
                int sumaMatriz=0;
                for(int i=0; i<matriz2.length; i++){
                    for(int j=0; j<matriz2[i].length; j++){
                        sumaMatriz+=matriz2[i][j];
                    }
                }
                System.out.println("La suma de su matriz es: "+ sumaMatriz);
                System.out.print("");
                break;

            case 3:
                // 3. Sumar los numeros de la diagonal de una matriz
                System.out.println("Al ingresar su matriz intente que tenga mismo numero de filas y columnas");
                int filas3 = repositorio.ingresarNumeroEntero("Ingrese el numero de filas: ");
                int columnas3= repositorio.ingresarNumeroEntero("Ingrese el numero de columnas: ");
                int matriz3 [][]= new int[filas3][columnas3];
                // i= filas ; j= columnas
                for(int i = 0; i< filas3; i++ ){
                    for(int j=0; j<columnas3; j++){
                        matriz3[i][j]= repositorio.ingresarNumeroEntero("Ingrese el numero para la posicion: "+ i+ j);
                    }
                }
                System.out.println("Su matriz es: ");
                for(int [] fila : matriz3){
                    for(int numeros: fila){
                        System.out.print("[" +numeros+ "]");
                    }
                    System.out.println("");
                }
                int suma=0;
                int numeroM=0;
                for(int i= 0; i< matriz3.length; i++){
                    for(int j=0; j< matriz3[i].length; j++) {
                    numeroM= matriz3[i][j];
                        if(i==j){
                            suma+= numeroM;
                        }
                    }
                }
                System.out.println("La suma de la diagonal es: "+suma);
                break;

            case 4:
                // 4. Dibujar en una matriz un espiral de numeros
                System.out.println("Al ingresar su matriz intente que tenga mismo numero de filas y columnas");
                int filas4 = repositorio.ingresarNumeroEntero("Ingrese el numero de filas: ");
                int columnas4 = repositorio.ingresarNumeroEntero("Ingrese el numero de columnas: ");
                int matriz4[][]= new int[filas4][columnas4];
                





        }
    }
}
