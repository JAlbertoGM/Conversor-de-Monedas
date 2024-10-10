import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Agregamos el Scanner para leer de consola las opciones
        int opcion = 0;//Inicializamos la variable opcion para recibir el valor numerico que el usuario elegira
        double cantidad = 0;
        double resultado = 0;
        Convertidor convertidor = new Convertidor();
        //Agregamos un Try catch para evitar errores al monento de ingresar un valor no valido


        try{
            //Agregamos el ciclo Do/while para crear el ciclo
        do {

            System.out.print("--------------CONVERSOR DE MONEDA---------------\n\n" +
                    "***********************************************\n" +
                    "1) Peso Mexicano (MXN) --> Peso Argentino (ARS)\n" +
                    "2) Peso Argentino (ARS) --> Peso Mexicano (MXN)\n" +
                    "3) Dolar (USD)--> Peso Mexicano (MXN)\n" +
                    "4) Peso Mexicano (MXN) --> Dolar (USD)\n" +
                    "5) Dolar (USD) --> Peso Argentino (ARS)\n" +
                    "6) Peso Argentino (ARS) --> Dolar (USD)\n" +
                    "7) Dolar (USD) --> Real Brasileño (BRL)\n" +
                    "8) Real Brasileño (BRL) --> Dolar (USD)\n" +
                    "9) Dolar (USD) --> Peso Colombiano (COP)\n" +
                    "10) Peso Colombiano (COP) --> Dolar (USD)\n" +
                    "11) Dolar (USD) --> Rublo (RUB)\n" +
                    "12) Rublo (RUB) --> Dolar (USD)\n" +
                    "0) Salir\n" +
                    "***********************************************\n\n" +
                    "Seleccione una opcion valida: ");


                opcion = sc.nextInt();//leemos el valor de consola

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el valor en PESOS MEXICANOS (MXN) que desea convertir a PESOS ARGENTINOS (ARS): ");
                    cantidad = sc.nextDouble();//leemos el valor de consola

                    resultado = convertidor.Convertidor(cantidad,"MXN","ARS");
                    if(resultado != -1){
                        System.out.println("La cantidad en PESOS ARGENTINOS (ARS)-->> " + resultado);
                    }else {
                        System.out.println("Error al obtener la tasa de conversión: ");
                    }
                    break;

                    case 2:
                        System.out.println("Ingrese el valor en PESOS ARGENTINOS (ARS) que desea convertir a PESOS MEXICANOS (MXN): ");
                        cantidad = sc.nextDouble();//leemos el valor de consola

                        resultado = convertidor.Convertidor(cantidad,"ARS","MXN");
                        if(resultado != -1){
                            System.out.println("La cantidad en PESOS MEXICANOS (MXN)-->> " + resultado);
                        }else {
                            System.out.println("Error al obtener la tasa de conversión: ");
                        }
                        break;

                        case 3:
                            System.out.println("Ingrese el valor en DOLARES (USD) que desea convertir a PESOS MEXICANOS (MXN): ");
                            cantidad = sc.nextDouble();//leemos el valor de consola

                           
                            resultado = convertidor.Convertidor(cantidad,"USD","MXN");
                            if(resultado != -1){
                                System.out.println("La cantidad en PESOS MEXICANOS (MXN)-->> " + resultado);
                            }else {
                                System.out.println("Error al obtener la tasa de conversión: ");
                            }

                            break;
                            case 4:
                                System.out.println("Ingrese el valor en  PESOS MEXICANOS (MXN) que desea convertir a DOLARES (USD): ");
                                cantidad = sc.nextDouble();//leemos el valor de consola


                                resultado = convertidor.Convertidor(cantidad,"MXN","USD");
                                if(resultado != -1){
                                    System.out.println("La cantidad en DOLARES (USD)-->> " + resultado);
                                }else {
                                    System.out.println("Error al obtener la tasa de conversión: ");
                                }
                                break;
                                case 5:
                                    System.out.println("Ingrese el valor en  DOLARES (USD) que desea convertir a PESOS ARGENTINOS (ARS): ");
                                    cantidad = sc.nextDouble();//leemos el valor de consola


                                    resultado = convertidor.Convertidor(cantidad,"USD","ARS");
                                    if(resultado != -1){
                                        System.out.println("La cantidad en PESOS ARGENTINOS (ARS)-->> " + resultado);
                                    }else {
                                        System.out.println("Error al obtener la tasa de conversión: ");
                                    }
                                    break;
                                    case 6:
                                        System.out.println("Ingrese el valor en  PESOS ARGENTINO (ARS) que desea convertir a DOLARES (USD): ");
                                        cantidad = sc.nextDouble();//leemos el valor de consola


                                        resultado = convertidor.Convertidor(cantidad,"ARS","USD");
                                        if(resultado != -1){
                                            System.out.println("La cantidad en DOLARES (USD)-->> " + resultado);
                                        }else {
                                            System.out.println("Error al obtener la tasa de conversión: ");
                                        }
                                        break;
                                        case 7:
                                            System.out.println("Ingrese el valor en  DOLARES (USD) que desea convertir a REAL BRASILEÑO(BRL): ");
                                            cantidad = sc.nextDouble();//leemos el valor de consola


                                            resultado = convertidor.Convertidor(cantidad,"USD","BRL");
                                            if(resultado != -1){
                                                System.out.println("La cantidad en REAL BRASILEÑO(BRL)-->> " + resultado);
                                            }else {
                                                System.out.println("Error al obtener la tasa de conversión: ");
                                            }
                                            break;
                                            case 8:
                                                System.out.println("Ingrese el valor en REAL BRASILEÑO(BRL)  que desea convertir a DOLARES (USD): ");
                                                cantidad = sc.nextDouble();//leemos el valor de consola


                                                resultado = convertidor.Convertidor(cantidad,"BRL","USD");
                                                if(resultado != -1){
                                                    System.out.println("La cantidad en DOLARES (USD)-->> " + resultado);
                                                }else {
                                                    System.out.println("Error al obtener la tasa de conversión: ");
                                                }
                                                break;
                                                case 9:
                                                    System.out.println("Ingrese el valor en DOLARES (USD)  que desea convertir a PESOS COLOMBIANOS(COP): ");
                                                    cantidad = sc.nextDouble();//leemos el valor de consola


                                                    resultado = convertidor.Convertidor(cantidad,"USD","COP");
                                                    if(resultado != -1){
                                                        System.out.println("La cantidad en PESOS COLOMBIANOS(COP)-->> " + resultado);
                                                    }else {
                                                        System.out.println("Error al obtener la tasa de conversión: ");
                                                    }
                                                    break;
                                                    case 10:
                                                        System.out.println("Ingrese el valor en PESOS COLOMBIANOS(COP) que desea convertir a DOLARES (USD): ");
                                                        cantidad = sc.nextDouble();//leemos el valor de consola


                                                        resultado = convertidor.Convertidor(cantidad,"COP","USD");
                                                        if(resultado != -1){
                                                            System.out.println("La cantidad en DOLARES (USD)-->> " + resultado);
                                                        }else {
                                                            System.out.println("Error al obtener la tasa de conversión: ");
                                                        }
                                                        break;
                                                        case 11:
                                                            System.out.println("Ingrese el valor en DOLARES (USD) que desea convertir a RUBLOS(RUB): ");
                                                            cantidad = sc.nextDouble();//leemos el valor de consola


                                                            resultado = convertidor.Convertidor(cantidad,"USD","RUB");
                                                            if(resultado != -1){
                                                                System.out.println("La cantidad en RUBLOS (RUB)-->> " + resultado);
                                                            }else {
                                                                System.out.println("Error al obtener la tasa de conversión: ");
                                                            }
                                                            break;
                                                            case 12:
                                                                System.out.println("Ingrese el valor en RUBLOS(RUB) que desea convertir a DOLARES (USD): ");
                                                                cantidad = sc.nextDouble();//leemos el valor de consola

                                                                resultado = convertidor.Convertidor(cantidad,"RUB","USD");
                                                                if(resultado != -1){
                                                                    System.out.println("La cantidad en DOLARES (USD)-->> " + resultado);
                                                                }else {
                                                                    System.out.println("Error al obtener la tasa de conversión: ");
                                                                }
                                                                break;

            }

        } while (opcion != 0);//Agregamos la opcion que repite el ciclo si no eleigen el valor 0
            System.out.println("-----Fin del Programa-----");
        }catch (Exception e){
            System.out.println("Intenta con una opcion valida");
        }
    }
}