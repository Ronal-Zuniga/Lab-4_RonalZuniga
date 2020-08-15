package lab.pkg4_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Lab4_RonalZuniga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Delito> delitos = new ArrayList();
        ArrayList<Criminales> criminales = new ArrayList();

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
                        String aux = "";
                        int e;

                        switch (x) {
                            case 1:
                                System.out.println("");
                                System.out.print("Ingrese el nombre de la victima: ");
                                String nb = sc.next();
                                System.out.print("¿Es culpable? 1. SI, 2. NO: ");
                                int cul = sc.nextInt();
                                String sentencia = "";
                                String culpable = "";
                                if (cul == 1) {
                                    System.out.print("Ingrese anhos de sentencia o si es pena de muerte: ");
                                    sentencia = sc.next();
                                    culpable = "SI";
                                } else if (cul == 2) {
                                    sentencia = null;
                                    culpable = "NO";
                                }
                                System.out.println("Ingrese el pais: ");
                                String pais = sc.next();
                                System.out.println("Tipo de delito (1. Menor, 2. Mayor): ");
                                int del = sc.nextInt();
                                switch (del) {
                                    case 1:
                                        System.out.print("Ingrese el nombre del policia: ");
                                        String nbp = sc.next();
                                        System.out.print("Ingrese ID de policia: ");
                                        int id = sc.nextInt();
                                        System.out.print("Ingrese el numero de celda: ");
                                        int celda = sc.nextInt();
                                        System.out.println("Tipo de delito menor (1. Vandalismo, 2. Hurto, 3. Prostitucion): ");
                                        int dmenor = sc.nextInt();
                                        switch (dmenor) {
                                            case 1:
                                                System.out.print("Ingrese el nombre del edificio: ");
                                                String ed = sc.next();
                                                System.out.print("Ingrese el numero de pisos: ");
                                                int pisos = sc.nextInt();
                                                System.out.print("Ingrese el nombre del dueño: ");
                                                String dueño = sc.next();
                                                delitos.add(new Vandalismo(ed, pisos, dueño, nbp, id, celda, nb, culpable, sentencia, pais));
                                                break;

                                            case 2:
                                                System.out.print("Ingrese el objeto hurtado: ");
                                                String obj = sc.next();
                                                System.out.print("Ingrese el valor del objeto: ");
                                                int valor = sc.nextInt();
                                                delitos.add(new Hurto(obj, valor, nbp, id, celda, nb, culpable, sentencia, pais));
                                                break;

                                            case 3:
                                                System.out.print("Ingrese el nombre del solicitante: ");
                                                String solicitante = sc.next();
                                                delitos.add(new Prostitucion(solicitante, nbp, id, celda, nb, culpable, sentencia, pais));
                                                break;
                                        }
                                    default:
                                        System.out.println("");
                                        break;

                                    case 2:
                                        System.out.print("Ingrese el nivel de gravedad del delito (1-5): ");
                                        int nivel = sc.nextInt();
                                        while (nivel < 0 || nivel > 5) {
                                            System.out.print("Ingrese el nivel de gravedad del delito (1-5): ");
                                            nivel = sc.nextInt();
                                        }
                                        System.out.print("Tipo de delito mayor (1. Terrorismo, 2. Asesinato, 3. Violacion, 4. Secuestro, 5. Trafico de drogra): ");
                                        int dmayor = sc.nextInt();
                                        switch (dmayor) {
                                            case 1:
                                                System.out.print("Ingrese el artefacto: ");
                                                String art = sc.next();
                                                System.out.print("Ingrese el numero de victimas: ");
                                                int vc = sc.nextInt();
                                                delitos.add(new Terrorismo(art, vc, nivel, nb, culpable, sentencia, pais));
                                                break;

                                            case 2:
                                                System.out.print("Ingrese el arma: ");
                                                String arma = sc.next();
                                                System.out.print("Ingrese el numero de cuerpos: ");
                                                int cuerpos = sc.nextInt();
                                                delitos.add(new Asesinato(arma, cuerpos, nivel, nb, culpable, sentencia, pais));
                                                break;

                                            case 3:
                                                System.out.print("Ingrese la edad de la victima: ");
                                                int ed_victima = sc.nextInt();
                                                delitos.add(new Violacion(ed_victima, nivel, nb, culpable, sentencia, pais));
                                                break;

                                            case 4:
                                                System.out.print("Ingrese el tiempo retenido: ");
                                                int tiempo = sc.nextInt();
                                                System.out.print("Estado de la victima (1. Vivo, 2. Muerto): ");
                                                int es = sc.nextInt();
                                                String estado = "";
                                                if (es == 1) {
                                                    estado = "Vivo";
                                                } else if (es == 2) {
                                                    estado = "Muerto";
                                                }
                                                delitos.add(new Secuestro(tiempo, estado, nivel, nb, culpable, sentencia, pais));
                                                break;

                                            case 5:
                                                System.out.print("Ingrese el nombre de la droga: ");
                                                String droga = sc.next();
                                                System.out.print("Ingrese la canytidad de la droga: ");
                                                int cant = sc.nextInt();
                                                delitos.add(new Trafico(droga, cant, nivel, nb, culpable, sentencia, pais));
                                                break;

                                            default:
                                                System.out.println("");
                                        }
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("");
                                System.out.print("Ingrese el nombre del criminal: ");
                                String nbc = sc.next();
                                System.out.print("Ingrese la edad del criminal: ");
                                int edad = sc.nextInt();
                                System.out.print("Seleccione Genero (1. Masculino 2. Femenino): ");
                                int g = sc.nextInt();
                                String genero = "";
                                if (g == 1) {
                                    genero = "Masculino";
                                } else if (g == 2) {
                                    genero = "Femenino";
                                }
                                System.out.print("Ingrese el pais de origen: ");
                                String p = sc.next();
                                System.out.print("Ha estado encarcelado(1. SI, 2. NO): ");
                                int en = sc.nextInt();
                                String carcel = "";
                                if (en == 1) {
                                    carcel = "SI";
                                } else if (en == 2) {
                                    carcel = "NO";
                                }
                                System.out.print("Describa al criminal: ");
                                String desc = sc.next();
                                criminales.add(new Criminales(nbc, edad, genero, p, carcel, desc));
                                break;

                            case 3:
                                System.out.println("");
                                System.out.print("Ingrese el nombre del Agente: ");
                                nbc = sc.next();
                                System.out.print("Ingrese la edad del Agente: ");
                                edad = sc.nextInt();
                                System.out.print("Seleccione Genero (1. Masculino 2. Femenino): ");
                                g = sc.nextInt();
                                genero = "";
                                if (g == 1) {
                                    genero = "Masculino";
                                } else if (g == 2) {
                                    genero = "Femenino";
                                }
                                System.out.print("Ingrese el pais de origen: ");
                                p = sc.next();
                                carcel = "NO";
                                System.out.print("Describa al criminal: ");
                                desc = sc.next();
                                System.out.print("Ingrese el dinero que le pagaron: ");
                                double dinero = sc.nextDouble();
                                System.out.print("Tipo de criminal (1. Terrorista, 2. Asesino, 3. Secuestrador)");
                                int tipo = sc.nextInt();
                                switch (tipo) {
                                    case 1:
                                        System.out.println("");
                                        System.out.print("Ingrese el pais del ataque: ");
                                        String at = sc.next();
                                        System.out.print("Ingrese la ciudad del ataque: ");
                                        String city = sc.next();
                                        System.out.print("Ingrese el metodo del ataque: ");
                                        String metodo = sc.next();
                                        criminales.add(new Terrorista(at, city, metodo, dinero, nbc, edad, genero, p, carcel, desc));
                                        break;

                                    case 2:
                                        System.out.println("");
                                        System.out.print("Ingrese el tipo de arma: ");
                                        String ar = sc.next();
                                        System.out.print("Ingrese el nombre de la victima: ");
                                        String vic = sc.next();
                                        criminales.add(new Asesino(vic, ar, dinero, nbc, edad, genero, p, carcel, desc));
                                        break;

                                    case 3:
                                        System.out.print("Ingrese el nombre de la victima: ");
                                        String vict = sc.next();
                                        System.out.print("Ingrese la cantidad del rescate: ");
                                        double resc = sc.nextDouble();
                                        criminales.add(new Secuestrador(vict, resc, dinero, nbc, edad, genero, p, carcel, desc));
                                        break;

                                    default:
                                        System.out.println("");
                                }
                                break;

                            default:
                                System.out.println("");
                        }

                    }

                    break;

                case 2:
                    int y = 0;
                    while (y != 3) {
                        System.out.println("1. Modificar Delito");
                        System.out.println("2. Modificar Criminal/Agente");
                        System.out.println("3. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        y = sc.nextInt();
                    }
                    switch (y) {
                        case 1:
                            System.out.println("");
                            System.out.print("Seleccione la posiscion del delito a modificar (0-" + delitos.size() + "): ");
                            int pos = sc.nextInt();
                            System.out.println("");
                            System.out.print("Ingrese el nombre de la victima: ");
                            String nb = sc.next();
                            System.out.print("¿Es culpable? 1. SI, 2. NO: ");
                            int cul = sc.nextInt();
                            String sentencia = "";
                            String culpable = "";
                            if (cul == 1) {
                                System.out.print("Ingrese anhos de sentencia o si es pena de muerte: ");
                                sentencia = sc.next();
                                culpable = "SI";
                            } else if (cul == 2) {
                                sentencia = null;
                                culpable = "NO";
                            }
                            System.out.println("Ingrese el pais: ");
                            String pais = sc.next();
                            delitos.get(pos).setNombre_victima(nb);
                            delitos.get(pos).setSentencia(sentencia);
                            delitos.get(pos).setCulpable(culpable);
                            delitos.get(pos).setPais(pais);
                            System.out.println("Modificado correctamente");
                            System.out.println("");
                            break;

                        case 2:
                            System.out.println("");
                            System.out.print("Seleccione la posiscion del criminal/agente a modificar (0-" + criminales.size() + "): ");
                            int ps = sc.nextInt();
                            System.out.println("");
                            System.out.print("Ingrese el nombre del criminal: ");
                            String nbc = sc.next();
                            System.out.print("Ingrese la edad del criminal: ");
                            int edad = sc.nextInt();
                            System.out.print("Seleccione Genero (1. Masculino 2. Femenino): ");
                            int g = sc.nextInt();
                            String genero = "";
                            if (g == 1) {
                                genero = "Masculino";
                            } else if (g == 2) {
                                genero = "Femenino";
                            }
                            System.out.print("Ingrese el pais de origen: ");
                            String p = sc.next();
                            System.out.print("Ha estado encarcelado(1. SI, 2. NO): ");
                            int en = sc.nextInt();
                            String carcel = "";
                            if (en == 1) {
                                carcel = "SI";
                            } else if (en == 2) {
                                carcel = "NO";
                            }
                            System.out.print("Describa al criminal: ");
                            String desc = sc.next();
                            criminales.get(ps).setDescripcion(desc);
                            criminales.get(ps).setEdad(edad);
                            criminales.get(ps).setEncarcelado(carcel);
                            criminales.get(ps).setGenero(genero);
                            criminales.get(ps).setNombre(nbc);
                            criminales.get(ps).setPais(p);
                            System.out.println("Modificado correctamente");
                            System.out.println("");
                            break;

                        default:
                            System.out.println("");
                    }
                    break;

                case 3:
                    int z = 0;
                    while (z != 3) {
                        System.out.println("1. Eliminar Delito");
                        System.out.println("2. Eliminar Criminal/Agente");
                        System.out.println("3. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        z = sc.nextInt();
                    }
                    switch (z) {
                        case 1:
                            System.out.println("");
                            System.out.print("Seleccione la posicion del delito a eliminar (0-" + delitos.size() + "): ");
                            int pos = sc.nextInt();
                            delitos.remove(pos);
                            System.out.println("Eliminado correctamente: ");
                            System.out.println("");
                            break;

                        case 2:
                            System.out.println("");
                            System.out.print("Seleccione la posiscion del criminal/agente a eliminar (0-" + criminales.size() + "): ");
                            int ps = sc.nextInt();
                            criminales.remove(ps);
                            System.out.println("Eliminado correctamente: ");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("");
                    }
                    break;

                case 4:
                    int w = 0;
                    while (w != 3) {
                        System.out.println("1. Listar Delitos");
                        System.out.println("2. Listar Criminales/Agentes");
                        System.out.println("3. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        w = sc.nextInt();
                        switch (w) {
                            case 1:
                                System.out.println("");
                                System.out.println("DELITOS");
                                for (int i = 0; i < delitos.size(); i++) {
                                    System.out.println(i+"- "+delitos.get(i));
                                }
                                System.out.println("");
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("CRIMINALES/AGENTES");
                                for (int i = 0; i < criminales.size(); i++) {
                                    System.out.println(i+"- "+criminales.get(i));
                                }
                                System.out.println("");
                                break;

                            default:
                                System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("");
            }
        }

    }//fin del main

}//fin de la clase
