package Principal;

import Utilidades.ConMoneda;
import Utilidades.ObMoneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        ConMoneda obMoneda = new ConMoneda();
        int opcion = 0;
        //Try and catch para cachar errores.
        try {
            while (opcion != 8){
                //Menu de nuestro programa, dentro de un ciclo.
                System.out.println("********************************\n" +
                        "Sea bienvenido al conversor de monedas\n" +
                        "1) Dolar =>> Peso argentino\n" +
                        "2) Peso argentino =>> Dolar\n" +
                        "3) Dolar =>> Real brasileño\n" +
                        "4) Real brasileño =>> Dolar\n"+
                        "5) Dolar =>> Peso colombiano\n" +
                        "6) Peso colombiano =>> Dolar\n" +
                        "7) Salir\n" +
                        "Elija una opcion valida:\n" +
                        "********************************\n");
                opcion = lectura.nextInt();
                lectura.nextLine();
                //Utilizamos un if para validar la salida de nuestra aplicacion.
                if (opcion == 7) {
                    System.out.println("Saliendo");
                    break;
                }
                //Opciones en caso de cada seleccion, pasando las variables a la API
                switch (opcion){
                    case 1:
                        ObMoneda.conv("USD", "ARS",obMoneda ,lectura);
                        break;
                    case 2:ObMoneda.conv("ARS", "USD",obMoneda,lectura);
                        break;
                    case 3:
                        ObMoneda.conv("USD", "BRL",obMoneda ,lectura);
                        break;
                    case 4:ObMoneda.conv("BRL", "USD",obMoneda,lectura);
                        break;
                    case 5:
                        ObMoneda.conv("USD", "COP",obMoneda ,lectura);
                        break;
                    case 6:
                        ObMoneda.conv("COP", "USD",obMoneda,lectura);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
            //Validacion para que solo se puedan ingresar numeros.
        }catch(NumberFormatException | InputMismatchException e){
            System.out.println("Ingrese solo numeros");
        }
    }

}