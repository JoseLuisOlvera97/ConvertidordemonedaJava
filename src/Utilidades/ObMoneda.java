package Utilidades;

import java.util.Scanner;

public class ObMoneda {

    public static void conv (String mon1, String mon2,ConMoneda cons, Scanner lectura){
        double cantn, cantc;

        //Operaciones que se realizan para mostrar el resultado de la conversion seleccionada
        ObValorMon obValorMon = cons.BuMoneda(mon1, mon2);
        System.out.println("Ingrese la cantidad deseada de " + mon1);
        cantn = Double.parseDouble(lectura.nextLine());
        cantc = cantn * obValorMon.conversion_rate();
        System.out.println(cantn + " " + mon1 + "=" + cantc + " " + obValorMon.target_code());
    }
}
