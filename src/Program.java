public class Program {
    public static void main(String[] args) {

    int numeroIf = 0;
    int numeroWhile = 1;
    int numeroDoWhile = 3;

    System.out.println("-----PARTE 1 - SENTENCIA IF-----\n");
    //SI ES POSITIVO
        if (numeroIf > 0){
            System.out.println("El número es positivo\n");
        }
        //SI ES NEGATIVO
        else if (numeroIf < 0) {
            System.out.println("El número es negativo\n");
        }
        //SI ES 0
        else {
            System.out.println("El número es 0\n");
        }

        //WHILE
        System.out.println("-----PARTE 2 - CICLO WHILE-----\n");

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println("Valor de numeroWhile: "+numeroWhile+"\n");
        }

        //DO WHILE
        System.out.println("-----PARTE 3 - CICLO DO WHILE-----\n");

        do{
            numeroDoWhile++;
            System.out.println("Valor de numeroWhile con Do While: "+numeroDoWhile+"\n");
        }while (numeroDoWhile < 3);


        //CICLO FOR
        System.out.println("-----PARTE 4 - CICLO FOR-----\n");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ){
            System.out.println("El valor de numeroFor es: "+ numeroFor+"\n");
        }

        System.out.println("-----PARTE 5 - SWITCH-----\n");
        //SWITCH
        String estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación válida");
                break;
        }
    }
}
