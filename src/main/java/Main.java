import java.util.Scanner;

public class Main {

    static Scanner tec = new Scanner(System.in);
    static int num = 0;

    public static void main(String[] args) {

        menu();


    }

    private static void menu() {
        String opcion;
        do {
            opciones();
            opcion = tec.next();
            switch (opcion){
                case "1":
                    num=ingresarNum();

                    break;
                case "2":
                    calcullarDecimal(num);
                    break;
                case "3":
                    calcularBin(num);
                    break;
                default:
                    return;


            }
        }while (opcion!="0");

    }

    private static void opciones() {
        System.out.println("[1] Ingresar numero \n" +
                "[2] Calcular y mostrar numero en decimal\n" +
                "[3] Calcular y mostrar numero en binario\n" +
                "[0] Salir\n");
    }

    private static void calcullarDecimal(int num) {
        try {
            int decs = Integer.parseInt(Integer.toString(num), 2);
            imprimirDecimal(decs);
        }catch (Exception e){
            System.out.println("Numero binario fuera de rango");
        }


    }

    private static void imprimirDecimal(int decs) {
        System.out.println(decs);
    }

    private static void calcularBin(int num) {
         if (validarDecimal(num)){
             int bin = Integer.parseInt(Integer.toBinaryString(num));
             imprimirBinario(bin);
         }




    }

    private static void imprimirBinario(int bin) {
        System.out.println(bin);
    }




    private static boolean validarDecimal(int num) {

        if (0 > num || num > 255) {
            System.out.println("El Numero decimal Exede rango\n" +
                    "Ingrese nuevamente\n");
            return false;
        }
        return true;

    }


    private static int ingresarNum() {

        int num = 0;
        try {
            System.out.println("Ingrese numero");
            num = tec.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada no valida");
            ingresarNum();
        }
        return num;
    }


}
