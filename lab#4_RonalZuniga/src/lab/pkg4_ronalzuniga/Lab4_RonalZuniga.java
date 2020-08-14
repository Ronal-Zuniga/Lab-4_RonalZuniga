package lab.pkg4_ronalzuniga;

import java.util.Scanner;

public class Lab4_RonalZuniga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 5) {
            System.out.println("----MENU----");
            System.out.println("1. Agregar");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    int x = 0;
                    while (x != 4) {
                        System.out.println("1. Agregar Delito");
                        System.out.println("2. Agregar Criminal");
                        System.out.println("3. Agregar Agente");
                        System.out.println("4. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        x = sc.nextInt();
                        switch(x){
                            case 1:
                                break;
                                
                            case 2:
                                break;
                                
                            case 3:
                                break;
                        }

                    }

                    break;

                case 2:
                    int y=0;
                    while(y!=4){
                    System.out.println("1. Modificar Delito");
                        System.out.println("2. Modificar Criminal");
                        System.out.println("3. Modificar Agente");
                        System.out.println("4. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        y = sc.nextInt();
                    }
                    switch(y){
                            case 1:
                                break;
                                
                            case 2:
                                break;
                                
                            case 3:
                                break;
                        }
                    break;

                case 3:
                    int z=0;
                    while(z!=4){
                     System.out.println("1. Eliminar Delito");
                        System.out.println("2. Eliminar Criminal");
                        System.out.println("3. Eliminar Agente");
                        System.out.println("4. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        z = sc.nextInt();
                    }
                    switch(z){
                            case 1:
                                break;
                                
                            case 2:
                                break;
                                
                            case 3:
                                break;
                        }
                    break;

                case 4:

                    break;
            }
        }

    }//fin del main

}//fin de la clase
