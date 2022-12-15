public class Main {
    public static void main(String[] args) {

        System.out.println("CONDICIAL IF");
        int numeroIf = -2;
        if (numeroIf == 0) {
            System.out.println("El numero es cero");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        System.out.println("CICLO WHILE");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("CICLO DO-WHILE");
        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        System.out.println("CICLO FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("SWITCH-CASE");
        int estacion = 0;
        switch (estacion){
            case 1:
                System.out.println("Esto es primavera");
                break;
            case 2:
                System.out.println("Esto es verano");
                break;
            case 3:
                System.out.println("Esto es otoño");
                break;
            case 4:
                System.out.println("Esto es invierno");
                break;
            default:
                System.out.println("Esto no es una estación del año");
        }

    }
}