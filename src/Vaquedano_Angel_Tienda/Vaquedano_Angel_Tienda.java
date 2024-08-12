/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vaquedano_Angel_Tienda;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        //Variable para el menú
        int opcion = 0;
        //Variables para la caja
        double efectivo = 0;
        double efecanadido = 0;
        //Variables para las opciones de compras y ventas
        int azucarinv = 0, avenainv = 0, trigoinv = 0, maizinv = 0;
        String proveedor = "";
        int azucarcomp = 0, trigocomp = 0, avenacomp = 0, maizcomp = 0;
        int precioazu = 0, preciotrigo = 0, precioavena = 0, preciomaiz = 0;
        int azucarventa = 0, trigoventa = 0, avenaventa = 0, maizventa = 0, dineroventa = 0;
        int code = 0;
        String cliente = "";
        double subTotal = 0;
        double dineroazucar = 0, dinerotrigo = 0, dineroavena = 0, dineromaiz = 0;
        double azucarTotal = 0, trigoTotal = 0, avenaTotal = 0, maizTotal = 0;
        String pregunta = "";
        double descuento = 0;
        double IVA = 0;

        //Variables para cierre de caja
        int primerIngreso = 0;
        int cajaConfirmacion = 0;
        double dineroBanco = 0;

        //variables para ranking y producto esterlla
        double totalDineroAzucar = 0, totalDineroMaiz = 0, totalDineroTrigo = 0, totalDineroAvena = 0;
        double rankTotalAzucar = 1, rankTotalAvena = 1, rankTotalTrigo = 1, rankTotalMaiz = 1;

        while (true) {
            //Variables para opcion de reportes
            int contadorVentas = 0, contadorCompras = 0;
            double volumenCompras = 0, volumenVentas = 0, margenGanancias = 0;
            double compraMayor = 0, ventaMayor = 0;

            System.out.println("---------Menu---------"
                    + "\n|  1- Abrir Caja     |"
                    + "\n|  2- Cerrar programa|"
                    + "\n----------------------");
            System.out.println("Favor ingrese el número de la accion que desea realizar: ");
            opcion = lea.nextInt();
            if (opcion == 1) {
                if (primerIngreso == 0) {
                    System.out.println("La cantidad de efectivo en caja es: " + efectivo + " Lps.");
                    System.out.println("Favor ingrese el monto que quiere añadir: ");
                    efecanadido = lea.nextDouble();
                    if (efecanadido >= 0) {
                        efectivo = efectivo += efecanadido;
                        System.out.println("Se ha añadido " + efecanadido + " Lps. el efectivo disponible es " + efectivo + "."
                                + "\n ");
                        primerIngreso = 1;
                        cajaConfirmacion = 1;
                    } else if (efecanadido < 0) {
                        System.out.println("Favor ingrese un monto valido."
                                + "\n ");
                    }
                } else {
                    cajaConfirmacion++;
                }
                while (cajaConfirmacion == 1) {
                    System.out.println("---------Menu---------"
                            + "\n|  1- Abrir Caja     |"
                            + "\n|  2- Ventas         |"
                            + "\n|  3- Compras        |"
                            + "\n|  4- Cierre de caja |"
                            + "\n|  5- Reporte        |"
                            + "\n|  6- Cerrar programa|"
                            + "\n----------------------");
                    System.out.println("Favor ingrese el número de la accion que desea realizar: ");
                    opcion = lea.nextInt();

                    if (opcion == 1) {
                        System.out.println("La cantidad de efectivo en caja es: " + efectivo + " Lps.");
                        System.out.println("Favor ingrese el monto que quiere añadir: ");
                        efecanadido = lea.nextDouble();
                        if (efecanadido >= 0) {
                            efectivo = efectivo += efecanadido;
                            System.out.println("Se ha añadido " + efecanadido + " Lps. el efectivo disponible es " + efectivo + "."
                                    + "\n ");
                        } else if (efecanadido < 0) {
                            System.out.println("Favor ingrese un monto valido."
                                    + "\n ");
                        }

                    }
                    //VENTAS--------------
                    if (opcion == 2) {
                        if (azucarinv > 0 || trigoinv > 0 || avenainv > 0 || maizinv > 0) {
                            azucarTotal = 0;
                            trigoTotal = 0; avenaTotal = 0;
                            maizTotal = 0;

                            pregunta = "SI";
                            System.out.println("-------------------------------------------------------------"
                                    + "\n|    Cliente A:    |     Cliente B:     |     Cliente C:    |"
                                    + "\n|1. Azucar: 30 Lps.| 1. Azucar: 30 Lps. | 4. Maiz: 25 Lps.  |"
                                    + "\n        " + azucarinv + "                      " + azucarinv + "                 " + maizinv
                                    + "\n|2. Avena: 25 Lps. | 2. Avena: 25 Lps.  |                   |"
                                    + "\n        " + avenainv + "                      " + avenainv
                                    + "\n|3. Trigo: 32 Lps. | 3. Trigo: 32 Lps.  |                   |"
                                    + "\n        " + trigoinv + "                      " + trigoinv
                                    + "\n|4. Maiz: 20 Lps.  |                    |                   |"
                                    + "\n        " + maizinv
                                    + "\n-------------------------------------------------------------");
                            System.out.println("Favor ingrese el tipo de cliente A/B/C: ");
                            cliente = lea.next().toUpperCase();

                            if (cliente.equals("A")) {
                                while (pregunta.equals("SI")) {
                                    if (azucarinv > 0 || trigoinv > 0 || avenainv > 0 || maizinv > 0) {

                                        System.out.println("--------------------"
                                                + "\n|    Cliente A:    |"
                                                + "\n|1. Azucar: 30 Lps.|"
                                                + "\n     " + azucarinv
                                                + "\n|2. Avena: 25 Lps. |"
                                                + "\n     " + avenainv
                                                + "\n|3. Trigo: 32 Lps. |"
                                                + "\n     " + trigoinv
                                                + "\n|4. Maiz: 20 Lps.  |"
                                                + "\n     " + maizinv
                                                + "\n--------------------");

                                        System.out.println("Favor ingrese los objetos que el cliente desea comprar: ");
                                        code = lea.nextInt();
                                        if (code == 1) {
                                            System.out.println("Favor ingrese la cantidad de Kilogramos de azucar que desea comprar: ");
                                            azucarventa = lea.nextInt();
                                            if (azucarventa > 0) {
                                                if (azucarventa <= azucarinv) {
                                                    dineroventa = azucarventa * 30;
                                                    System.out.println("----------------------------------------------------------------------------"
                                                            + "\nLos " + azucarventa + " kilogramos  de azucar se han agregado al carrito"
                                                            + "\nCon precio total de " + dineroventa + "Lps."
                                                            + "\n----------------------------------------------------------------------------");
                                                    subTotal += dineroventa;
                                                    azucarinv -= azucarventa;
                                                    dineroazucar += dineroventa;
                                                    azucarTotal += azucarventa;

                                                    dineroventa = 0;
                                                    avenaventa = 0;

                                                    System.out.println("Quieres volver a comprar? SI/NO");
                                                    pregunta = lea.next().toUpperCase();

                                                } else if (azucarventa > azucarinv) {
                                                    System.out.println("No tiene los productos necesarios para realizar la venta.");
                                                    System.out.println("Quieres volver a comprar SI/NO");
                                                    pregunta = lea.next().toUpperCase();
                                                }
                                            }
                                        } else if (code == 2) {
                                            if (avenainv > 0) {
                                                System.out.println("Favor ingrese la cantidad de avena que desea comprar: ");
                                                avenaventa = lea.nextInt();
                                                if (avenaventa > 0) {
                                                    if (avenaventa <= avenainv) {
                                                        dineroventa = avenaventa * 25;
                                                        dineroavena += dineroventa;
                                                        avenainv -= avenaventa;
                                                        avenaTotal += avenaventa;

                                                        System.out.println("----------------------------------------------------------------------------"
                                                                + "\nLos" + avenaventa + " kilogramos de avena se han añadido al carrito."
                                                                + "\nCon precio total de " + dineroventa + "Lps."
                                                                + "\n----------------------------------------------------------------------------");
                                                        subTotal += dineroventa;
                                                        dineroavena += dineroventa;

                                                        dineroventa = 0;
                                                        avenaventa = 0;

                                                        System.out.println("Quieres volver a comprar SI/NO");
                                                        pregunta = lea.next().toUpperCase();

                                                    } else if (avenaventa < 0) {
                                                        System.out.println("Favor ingrese una cantidad valida.");
                                                    }
                                                }
                                            }
                                        } else if (code == 3) {
                                            if (trigoinv > 0) {
                                                System.out.println("Favor ingrese la cantidad de Trigo que desea comprar");
                                                trigoventa = lea.nextInt();
                                                if (trigoventa > 0) {
                                                    if (trigoventa <= trigoinv) {
                                                        trigoinv -= trigoventa;
                                                        dineroventa = trigoventa * 32;
                                                        dinerotrigo += dineroventa;

                                                        System.out.println("----------------------------------------------------------------------------"
                                                                + "\nLos " + trigoventa + " kilogramos  de trigo se han agreagado al carrito."
                                                                + "\nCon precio total de " + dineroventa + "Lps."
                                                                + "\n----------------------------------------------------------------------------");

                                                        subTotal += dineroventa;
                                                        dinerotrigo += dineroventa;
                                                        trigoTotal += trigoventa;

                                                        dineroventa = 0;
                                                        trigoventa = 0;

                                                        System.out.println("Quieres volver a comprar SI/NO");
                                                        pregunta = lea.next().toUpperCase();

                                                    } else if (trigoventa > trigoinv) {
                                                        System.out.println("No hay productos necesarios para realizar la venta.");
                                                        System.out.println("Quieres volver a comprar SI/NO");
                                                        pregunta = lea.next().toUpperCase();

                                                    }

                                                }
                                            } else if (trigoinv < 0) {
                                                System.out.println("No hay producto disponible.");
                                                System.out.println("Quieres volver a comprar SI/NO");
                                                pregunta = lea.next().toUpperCase();
                                            }
                                        } else if (code == 4) {
                                            if (maizinv > 0) {
                                                System.out.println("Favor ingrese la cantidad de Trigo que desea comprar");
                                                maizventa = lea.nextInt();
                                                if (maizventa > 0) {
                                                    if (maizventa <= maizinv) {
                                                        dineroventa = maizventa * 20;
                                                        dineromaiz += dineroventa;
                                                        System.out.println("----------------------------------------------------------------------------"
                                                                + "\nLos " + trigoventa + "kilogramos de maiz se han añadido al carrito."
                                                                + "\nCon precio total de " + dineroventa + " Lps."
                                                                + "\n----------------------------------------------------------------------------");

                                                        subTotal += dineroventa;
                                                        maizinv -= maizventa;
                                                        maizTotal += maizventa;
                                                        System.out.println("Quieres volver a comprar SI/NO");
                                                        pregunta = lea.next().toUpperCase();

                                                    } else if (maizventa > maizinv) {
                                                        System.out.println("No hay productos necesarios para realizar la venta.");
                                                        System.out.println("Quieres volver a comprar SI/NO");
                                                        pregunta = lea.next().toUpperCase();

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (code < 1 || code > 4) {
                                System.out.println("Favor ingrese un codigo valido.");
                            }
                            if (pregunta.equals("NO")) {
                                System.out.println("-------------------------------Factura-------------------------------------------");
                                if (azucarTotal >= 1) {
                                    System.out.println("\nAzucar Lps.  " + dineroazucar + " / Precio unitario Lps.  " + String.format("%.2f", dineroazucar / azucarTotal));
                                    totalDineroAzucar += dineroazucar;
                                }
                                if (avenaTotal >= 1) {
                                    System.out.println("\nAvena Lps.  " + dineroavena + " / Precio unitario Lps.  " + String.format("%.2f", dineroavena / avenaTotal));
                                    totalDineroAvena += dineroavena;
                                }
                                if (trigoTotal >= 1) {
                                    System.out.println("\nTrigo Lps.  " + dinerotrigo + " / Precio unitario Lps.  " + String.format("%.2f", dinerotrigo / trigoTotal));
                                    totalDineroTrigo += dinerotrigo;
                                }
                                if (maizTotal >= 1) {
                                    System.out.println("\nMaiz Lps.  " + dineromaiz + " / Precio unitario Lps.  " + String.format("%.2f", dineromaiz / maizTotal));
                                    totalDineroMaiz += dineromaiz;
                                }

                                if (subTotal <= 1000) {
                                    System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                    IVA = subTotal * 0.07;
                                    System.out.println("\nIVA: " + String.format("%.2f", IVA) + " Lps.");
                                    subTotal = subTotal + IVA;
                                    System.out.println("\nTotal: " + String.format("%.2f", subTotal));

                                    efectivo += subTotal;
                                    volumenVentas += subTotal;
                                    contadorVentas++;
                                    if (subTotal > ventaMayor) {
                                        ventaMayor = subTotal;
                                    }

                                }
                                if (subTotal >= 1000 && subTotal < 5000) {
                                    IVA = subTotal * 0.07;
                                    descuento = (subTotal * 0.05);

                                    System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                    System.out.println("\nDescuento:" + String.format("%.2f", descuento) + " Lps.");
                                    System.out.println("\nIVA: " + String.format("%.2f", IVA));
                                    subTotal = (subTotal - descuento) + IVA;
                                    System.out.println("\nTotal: " + String.format("%.2f", subTotal) + " Lps.");
                                    contadorVentas++;
                                    volumenVentas += subTotal;
                                    if (subTotal > ventaMayor) {
                                        ventaMayor = subTotal;
                                    }

                                }
                                if (subTotal >= 5000) {
                                    IVA = subTotal * 0.07;
                                    descuento = (subTotal * 0.1);

                                    System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                    System.out.println("\nDescuento:" + String.format("%.2f", descuento) + " Lps.");
                                    System.out.println("\nIVA: " + String.format("%.2f", IVA));
                                    subTotal = (subTotal - descuento) + IVA;
                                    System.out.println("\nTotal: " + String.format("%.2f", subTotal) + " Lps.");
                                    volumenVentas += subTotal;
                                    contadorVentas++;
                                    if (subTotal > ventaMayor) {
                                        ventaMayor = subTotal;
                                    }
                                }
                                System.out.println("--------------------------------------------------------------------------------");
                            }
                        }

                        if (cliente.equals("B")) {
                            if (azucarinv > 0 || trigoinv > 0 || avenainv > 0 || maizinv > 0) {
                                while (pregunta.equals("SI")) {

                                    System.out.println("----------------------"
                                            + "\n|     Cliente B:     |"
                                            + "\n| 1. Azucar: 30 Lps. |"
                                            + "\n      " + azucarinv
                                            + "\n| 2. Avena: 25 Lps.  |"
                                            + "\n      " + avenainv
                                            + "\n| 3. Trigo: 32 Lps.  |"
                                            + "\n      " + trigoinv
                                            + "\n----------------------");

                                    System.out.println("Favor ingrese los objetos que el cliente desea comprar: ");
                                    code = lea.nextInt();

                                    if (code == 1) {
                                        System.out.println("Favor ingrese la cantidad de Kilogramos de azucar que desea comprar: ");
                                        azucarventa = lea.nextInt();
                                        if (azucarventa > 0) {
                                            if (azucarventa <= azucarinv) {
                                                dineroventa = azucarventa * 30;
                                                System.out.println("----------------------------------------------------------------------------"
                                                        + "\nLos " + azucarventa + " kilogramos  de azucar se han agregado al carrito"
                                                        + "\nCon precio total de " + dineroventa + "Lps."
                                                        + "\n----------------------------------------------------------------------------");
                                                subTotal += dineroventa;
                                                azucarinv -= azucarventa;
                                                dineroazucar += dineroventa;
                                                azucarTotal += azucarventa;

                                                dineroventa = 0;
                                                avenaventa = 0;

                                                System.out.println("Quieres volver a comprar? SI/NO");
                                                pregunta = lea.next().toUpperCase();

                                            } else if (azucarventa > azucarinv) {
                                                System.out.println("No tiene los productos necesarios para realizar la venta.");
                                                System.out.println("Quieres volver a comprar SI/NO");
                                                pregunta = lea.next().toUpperCase();
                                            }
                                        }
                                    } else if (code == 2) {
                                        if (avenainv > 0) {
                                            System.out.println("Favor ingrese la cantidad de avena que desea comprar: ");
                                            avenaventa = lea.nextInt();
                                            if (avenaventa > 0) {
                                                if (avenaventa <= avenainv) {
                                                    dineroventa = avenaventa * 25;
                                                    dineroavena += dineroventa;
                                                    avenaTotal += avenaventa;

                                                    System.out.println("----------------------------------------------------------------------------"
                                                            + "\nLos" + avenaventa + " kilogramos de avena se han añadido al carrito."
                                                            + "\nCon precio total de " + dineroventa + "Lps."
                                                            + "\n----------------------------------------------------------------------------");
                                                    subTotal += dineroventa;
                                                    avenainv -= avenaventa;
                                                    dineroavena += dineroventa;

                                                    dineroventa = 0;
                                                    avenaventa = 0;

                                                    System.out.println("Quieres volver a comprar SI/NO");
                                                    pregunta = lea.next().toUpperCase();
                                                } else if (avenaventa > avenainv) {
                                                    System.out.println("No hay productos necesarios para realizar la venta.");
                                                    System.out.println("Quieres volver a comprar SI/NO");
                                                    pregunta = lea.next().toUpperCase();
                                                } else if (avenaventa < 0) {
                                                    System.out.println("Favor ingrese una cantidad valida.");
                                                }
                                            }
                                        }
                                    } else if (code == 3) {
                                        if (trigoinv > 0) {
                                            System.out.println("Favor ingrese la cantidad de Trigo que desea comprar");
                                            trigoventa = lea.nextInt();
                                            if (trigoventa > 0) {
                                                if (trigoventa <= trigoinv) {
                                                    trigoinv -= trigoventa;
                                                    dineroventa = trigoventa * 32;
                                                    dinerotrigo += dineroventa;

                                                    System.out.println("----------------------------------------------------------------------------"
                                                            + "\nLos " + trigoventa + " kilogramos  de trigo se han agreagado al carrito."
                                                            + "\nCon precio total de " + dineroventa + "Lps."
                                                            + "\n----------------------------------------------------------------------------");

                                                    subTotal += dineroventa;
                                                    dinerotrigo += dineroventa;
                                                    trigoTotal += trigoventa;

                                                    dineroventa = 0;
                                                    trigoventa = 0;

                                                    System.out.println("Quieres volver a comprar SI/NO");
                                                    pregunta = lea.next().toUpperCase();

                                                }
                                            }
                                        } else if (code < 1 || code > 4) {
                                            System.out.println("Favor ingrese un codigo valido.");
                                        }

                                    }
                                    if (pregunta.equals("NO")) {
                                        if (azucarTotal >= 1) {
                                            System.out.println("\nAzucar Lps.  " + dineroazucar + " / Precio unitario Lps.  " + String.format("%.2f", dineroazucar / azucarTotal));
                                            totalDineroAzucar += dineroazucar;
                                        }
                                        if (avenaTotal >= 1) {
                                            System.out.println("\nAvena Lps.  " + dineroavena + " / Precio unitario Lps.  " + String.format("%.2f", dineroavena / avenaTotal));
                                            totalDineroAvena += dineroavena;
                                        }
                                        if (trigoTotal >= 1) {
                                            System.out.println("\nTrigo Lps.  " + dinerotrigo + " / Precio unitario Lps.  " + String.format("%.2f", dinerotrigo / trigoTotal));
                                            totalDineroTrigo += dinerotrigo;

                                        }
                                        if (subTotal < 1000) {
                                            System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            IVA = subTotal * 0.07;
                                            System.out.println("\nIVA: " + String.format("%.2f", IVA) + " Lps.");
                                            subTotal = subTotal + IVA;
                                            System.out.println("\nTotal: " + String.format("%.2f", subTotal));
                                            efectivo += subTotal;
                                            contadorVentas++;
                                            volumenVentas += subTotal;
                                            if (subTotal > ventaMayor) {
                                                ventaMayor = subTotal;
                                            }

                                        }
                                        if (subTotal >= 1000) {
                                            IVA = subTotal * 0.07;
                                            descuento = (subTotal * 0.05);

                                            System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            System.out.println("\nDescuento:" + String.format("%.2f", descuento) + " Lps.");
                                            System.out.println("\nIVA: " + String.format("%.2f", IVA));
                                            subTotal = (subTotal - descuento) + IVA;
                                            System.out.println("\nTotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            contadorVentas++;
                                            volumenVentas += subTotal;
                                            if (subTotal > ventaMayor) {
                                                ventaMayor = subTotal;
                                            }

                                        }
                                        if (subTotal >= 5000) {
                                            IVA = subTotal * 0.07;
                                            descuento = (subTotal * 0.1);

                                            System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            System.out.println("\nDescuento:" + String.format("%.2f", descuento) + " Lps.");
                                            System.out.println("\nIVA: " + String.format("%.2f", IVA));
                                            subTotal = (subTotal - descuento) + IVA;
                                            System.out.println("\nTotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            contadorVentas++;
                                            volumenVentas = +subTotal;

                                        }

                                    }
                                }

                            }
                        } else if (cliente.equals("C")) {
                            if (azucarinv > 0 || trigoinv > 0 || avenainv > 0 || maizinv > 0) {

                                while (pregunta.equals("SI")) {

                                    System.out.println("---------------------"
                                            + "\n|     Cliente C:    |"
                                            + "\n|       4.Maiz      |"
                                            + "\n      " + maizinv
                                            + "\n---------------------");

                                    System.out.println("Favor ingrese los objetos que el cliente desea comprar: ");
                                    code = lea.nextInt();
                                    if (code == 4) {
                                        if (maizinv > 0) {
                                            System.out.println("Favor ingrese la cantidad de Trigo que desea comprar");
                                            maizventa = lea.nextInt();
                                            if (maizventa > 0) {
                                                if (maizventa <= maizinv) {
                                                    dineroventa = maizventa * 20;
                                                    dineromaiz += dineroventa;
                                                    System.out.println("----------------------------------------------------------------------------"
                                                            + "\nLos " + trigoventa + "kilogramos de maiz se han añadido al carrito."
                                                            + "\nCon precio total de " + dineroventa + " Lps."
                                                            + "\n----------------------------------------------------------------------------");

                                                    subTotal += dineroventa;
                                                    maizinv -= maizventa;
                                                    maizTotal += maizventa;
                                                    System.out.println("Quieres volver a comprar SI/NO");
                                                    pregunta = lea.next().toUpperCase();

                                                } else if (maizventa > maizinv) {
                                                    System.out.println("No hay productos necesarios para realizar la venta.");
                                                    System.out.println("Quieres volver a comprar SI/NO");
                                                    pregunta = lea.next().toUpperCase();
                                                }
                                            }
                                        } else if (code <= 3 || code > 4) {
                                            System.out.println("Favor ingrese un codigo valido.");

                                        }
                                        if (pregunta.equals("NO")) {
                                        } else if (maizventa >= 1) {
                                            System.out.println("\nMaiz Lps.  " + dineromaiz + " / Precio unitario Lps.  " + String.format("%.2f", dineromaiz / maizTotal));
                                            totalDineroMaiz += dineromaiz;
                                        }

                                        if (subTotal < 1000) {
                                            System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            IVA = subTotal * 0.07;
                                            System.out.println("\nIVA: " + String.format("%.2f", IVA) + " Lps.");
                                            subTotal = subTotal + IVA;
                                            System.out.println("\nTotal: " + String.format("%.2f", subTotal));
                                            efectivo += subTotal;
                                            contadorVentas++;
                                            volumenVentas += +subTotal;
                                            if (subTotal > ventaMayor) {
                                                ventaMayor = subTotal;
                                            }

                                            break;
                                        }
                                        if (subTotal >= 1000) {
                                            IVA = subTotal * 0.07;
                                            descuento = (subTotal * 0.05);

                                            System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            System.out.println("\nDescuento:" + String.format("%.2f", descuento) + " Lps.");
                                            System.out.println("\nIVA: " + String.format("%.2f", IVA));
                                            subTotal = (subTotal - descuento) + IVA;
                                            System.out.println("\nTotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            contadorVentas++;
                                            volumenVentas += subTotal;
                                            if (subTotal > ventaMayor) {
                                                ventaMayor = subTotal;
                                            }

                                            break;

                                        }
                                        if (subTotal >= 5000) {
                                            IVA = subTotal * 0.07;
                                            descuento = (subTotal * 0.1);

                                            System.out.println("\nSubtotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            System.out.println("\nDescuento:" + String.format("%.2f", descuento) + " Lps.");
                                            System.out.println("\nIVA: " + String.format("%.2f", IVA));
                                            subTotal = (subTotal - descuento) + IVA;
                                            System.out.println("\nTotal: " + String.format("%.2f", subTotal) + " Lps.");
                                            contadorVentas++;
                                            volumenVentas += subTotal;
                                            if (subTotal > ventaMayor) {
                                                ventaMayor = subTotal;
                                            }

                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (opcion == 3) {
                        if (efectivo > 0) {
                            System.out.println("--------------Proveedores-------------------"
                                    + "\n--------------------------------------------"
                                    + "\n| Proveedor A: | Proveedor B: |Proveedor C:|"
                                    + "\n| '1' Azucar:  | '2' Avena:   | '2' Avena: |"
                                    + "\n|   25 Lps.    |   20 Lps.    |   22 Lps.  |"
                                    + "\n|  '4' Maiz:   | '3' Trigo:   |-------------"
                                    + "\n|   18 Lps.    |  30 Lps.     |"
                                    + "\n-------------------------------");
                            System.out.println("Favor ingrese el proveedor al que desea comprarle: ");
                            proveedor = lea.next().toUpperCase();
                            if (proveedor.equals("A")) {
                                System.out.println("\n-------------------------------------------------------------------------"
                                        + "\n|Ingrese '1' si desea comprar 'Azucar' por Lps. 25 o '4' Maiz a Lps. 18: |"
                                        + "\n-------------------------------------------------------------------------");
                                code = lea.nextInt();

                                if (code == 1) {
                                    System.out.println("Favor ingrese la cantidad de kilogramos de Azucar que desea comprar: ");
                                    azucarcomp = lea.nextInt();
                                    if (azucarcomp >= 0) {
                                        precioazu = azucarcomp * 25;
                                        if (precioazu <= efectivo) {
                                            azucarinv += azucarcomp;
                                            efectivo -= precioazu;
                                            volumenCompras += precioazu;
                                            contadorCompras++;

                                            System.out.println("----------------------------------------------------------------"
                                                    + "\n|Su compra de " + azucarcomp + " kilogramos de azucar a " + precioazu + " Lps ha sido exitosa."
                                                    + "\n|           Su balance actual es " + efectivo + " Lps."
                                                    + "\n----------------------------------------------------------------");
                                            if (precioazu > compraMayor) {
                                                compraMayor = precioazu;
                                            }
                                            azucarcomp = 0;

                                        } else if (precioazu > efectivo) {
                                            System.out.println("No tiene el efectivo necesario para realizar esta accion."
                                                    + "\n ");
                                        }
                                    } else {
                                        System.out.println("Favor ingrese un numero mayor a 0.");
                                    }

                                } else if (code == 4) {
                                    System.out.println("Favor ingrese la cantidad de kilogramos de Maiz que desea comprar: ");
                                    maizcomp = lea.nextInt();
                                    if (maizcomp >= 0) {
                                        preciomaiz = maizcomp * 18;
                                        if (preciomaiz <= efectivo) {
                                            maizinv += maizcomp;
                                            efectivo -= preciomaiz;
                                            volumenCompras += preciomaiz;
                                            contadorCompras++;
                                            System.out.println("----------------------------------------------------------------"
                                                    + "\n|Su compra de " + maizcomp + " kilogramos de maiz a " + preciomaiz + " Lps ha sido exitosa."
                                                    + "\n|Su balance actual es " + efectivo + " Lps."
                                                    + "\n----------------------------------------------------------------");
                                            if (preciomaiz > compraMayor) {
                                                compraMayor = preciomaiz;
                                            }

                                            maizcomp = 0;
                                        } else if (preciomaiz > efectivo) {
                                            System.out.println("No tiene el efectivo necesario para realizar esta accion."
                                                    + "\n ");
                                        }
                                    } else {
                                        System.out.println("Ingrese numeros positivos ");
                                    }

                                } else if (code < 1 || code < 4 || code > 4) {
                                    System.out.println("El proveedor no vende este producto.");
                                }

                            } else if (proveedor.equals("B")) {
                                System.out.println("----------------------------------------------------------------"
                                        + "\n|Ingrese '2' si desea comprar Avena por Lps. 20 o '3' Trigo a Lps. 30: |"
                                        + "\n----------------------------------------------------------------");
                                code = lea.nextInt();

                                if (code == 2) {
                                    System.out.println("Favor ingrese la cantidad de kilogramos de Avena que desea comprar: ");
                                    avenacomp = lea.nextInt();
                                    if (avenacomp >= 0) {
                                        precioavena = avenacomp * 20;
                                        if (precioavena <= efectivo) {
                                            avenainv += avenacomp;
                                            efectivo -= precioavena;
                                            volumenCompras += precioavena;
                                            contadorCompras++;
                                            System.out.println("----------------------------------------------------------------"
                                                    + "\n|Su compra de " + avenacomp + " kilogramos de avena a " + precioavena + " Lps ha sido exitosa."
                                                    + "\n|Su balance actual es " + efectivo + " Lps."
                                                    + "\n----------------------------------------------------------------");
                                            if (precioavena > compraMayor) {
                                                compraMayor = precioavena;
                                            }

                                            avenacomp = 0;
                                        } else if (precioavena > efectivo) {
                                            System.out.println("No tiene el efectivo necesario para realizar esta accion."
                                                    + "\n ");
                                        }
                                    } else {
                                        System.out.println("Favor ingrese numeros positivos.");
                                    }
                                }
                                if (code == 3) {
                                    System.out.println("Favor ingrese la cantidad de kilogramos de Trigo que desea comprar: ");
                                    trigocomp = lea.nextInt();
                                    if (trigocomp >= 0) {
                                        preciotrigo = trigocomp * 30;
                                        if (preciotrigo <= efectivo) {
                                            trigoinv += trigocomp;
                                            efectivo -= preciotrigo;
                                            volumenCompras += preciotrigo;
                                            contadorCompras++;

                                            System.out.println("----------------------------------------------------------------"
                                                    + "\nSu compra de " + trigocomp + " kilogramos de azucar a " + preciotrigo + " Lps ha sido exitosa."
                                                    + "\nSu balance actual es  " + efectivo + " Lps."
                                                    + "\n----------------------------------------------------------------");
                                            if (preciotrigo > compraMayor) {
                                                compraMayor = preciotrigo;
                                            }

                                            avenacomp = 0;
                                        } else if (preciotrigo > efectivo) {
                                            System.out.println("No tiene el efectivo necesario para realizar esta accion."
                                                    + "\n ");
                                        }
                                    } else {
                                        System.out.println("Favor ingrese numeros positivos.");
                                    }
                                } else if (code < 2 || code > 3) {
                                    System.out.println("El proveedor no vende este producto.");
                                }

                            } else if (proveedor.equals("C")) {
                                System.out.println("--------------------------------------"
                                        + "\n|Ingrese '2' si desea comprar Avena: |"
                                        + "\n--------------------------------------");
                                code = lea.nextInt();
                                if (code == 2) {
                                    System.out.println("Favor ingrese la cantidad de kilogramos de Avena que desea comprar: ");
                                    avenacomp = lea.nextInt();
                                    if (avenacomp >= 0) {
                                        precioavena = avenacomp * 22;
                                        if (precioavena <= efectivo) {
                                            avenainv += avenacomp;
                                            efectivo -= precioavena;
                                            volumenCompras += precioavena;
                                            contadorCompras++;
                                            System.out.println("----------------------------------------------------------------------------"
                                                    + "\n|Su compra de " + avenacomp + " kilogramos de azucar a " + precioavena + " Lps ha sido exitosa."
                                                    + "\n|Su balance actual es " + efectivo + " Lps."
                                                    + "----------------------------------------------------------------------------");
                                            if (precioavena > compraMayor) {
                                                compraMayor = precioavena;
                                            }

                                            avenacomp = 0;
                                        }
                                    } else {
                                        System.out.println("Favor ingrese numeros positivos.");
                                    }
                                } else if (code < 2 || code > 2) {
                                    System.out.println("El proveedor no vende este producto.");
                                }
                            }
                        } else {
                            System.out.println("No tiene efectivo en la caja.");
                        }
                    }

                    if (opcion == 4) {
                        while (true) {
                            double dineroPosibleBanco = (efectivo * 0.6);
                            double dineroDeposito = 0;
                            System.out.println("Cerrando caja...");
                            System.out.println(" ");
                            System.out.println("-----------------------------------");
                            System.out.println("Dinero disponible para guardar en el banco:");
                            System.out.println(String.format("%.2f", dineroPosibleBanco) + " Lps.");
                            System.out.println("-----------------------------------");
                            System.out.println("Ingrese el dinero que desea guardar: ");
                            dineroDeposito = lea.nextDouble();

                            if (dineroDeposito <= dineroPosibleBanco) {
                                System.out.println("-----------------------------------");
                                System.out.println("Se ha guardado " + String.format("%.2f", dineroDeposito) + " Lps. correctamente.");
                                dineroBanco += dineroDeposito;
                                efectivo -= dineroDeposito;
                                System.out.println("Dinero disponible en la caja " + String.format("%.2f", efectivo));
                                cajaConfirmacion = 0;

                                break;

                            } else {
                                System.out.println("Favor ingrese un monto valido.");
                            }
                        }

                    }
                    if (opcion == 5) {
                        if (contadorVentas > 0) {

                            margenGanancias = volumenVentas - volumenCompras;

                            double promedioVenta = volumenVentas / contadorVentas;
                            double promedioCompra = volumenCompras / contadorCompras;

                            System.out.println("-----------------Reportes------------------"
                                    + "\na. Dinero en caja: " + efectivo + " Lps."
                                    + "\nb. Numero de ventas hechas: " + contadorVentas
                                    + "\n   Numero de compras hecas: " + contadorCompras
                                    + "\n -------------------------------------------"
                                    + "\nc. Volumen de Ventas: " + String.format("%.2f", volumenVentas) + " Lps."
                                    + "\n   Volumen de Compras: " + String.format("%.2f", volumenCompras) + " Lps."
                                    + "\n   Margen de Ganancias: " + String.format("%.2f", margenGanancias) + " Lps."
                                    + "\n -------------------------------------------"
                                    + "\nd. Valor medio Compras: " + String.format("%.2f", promedioCompra) + " Lps."
                                    + "\n   Valor medio Ventas: " + String.format("%.2f", promedioVenta) + " Lps."
                                    + "\n-------------------------------------------"
                                    + "\ne. Venta mayor: " + String.format("%.2f", ventaMayor) + " Lps."
                                    + "\n   Compra mayor: " + String.format("%.2f", compraMayor) + " Lps.");
                            System.out.println("-------------------------------------------");

                            //Ranking:
                            rankTotalAzucar = 1;
                            rankTotalAvena = 1;
                            rankTotalTrigo = 1;
                            rankTotalMaiz = 1;
                            
                            if (totalDineroMaiz > totalDineroAzucar || totalDineroMaiz > totalDineroAvena || totalDineroMaiz > totalDineroTrigo) {
                                rankTotalMaiz++;
                            }
                            if (totalDineroAvena > totalDineroMaiz || totalDineroAvena > totalDineroAzucar || totalDineroAvena > totalDineroTrigo) {
                                rankTotalAvena++;
                         
                            }
                            if (totalDineroAzucar > totalDineroMaiz || totalDineroAzucar > totalDineroAvena || totalDineroAzucar > totalDineroTrigo) {
                                rankTotalAzucar++;
                            }
                            }
                            if (totalDineroTrigo > totalDineroMaiz || totalDineroTrigo > totalDineroAvena || totalDineroTrigo > totalDineroAzucar) {
                                rankTotalTrigo++;
                            }
                            System.out.println("----------------------Ranking----------------------");
                            System.out.println("Maiz: " + rankTotalMaiz);
                            System.out.println("Avena: " + rankTotalAvena);
                            System.out.println("Azucar: " + rankTotalAzucar);
                            System.out.println("Trigo: " + rankTotalTrigo);
                            System.out.println("-------------------------------------------------------");
                        } else {
                            System.out.println("Primero realice por minimo una venta.");
                        }
                    }

                    if (opcion == 6) {
                        System.out.println("El sistema se ha cerrado correctamente.");
                        System.exit(0);
                    }
                
                }else if (opcion == 2) {
                System.out.println("El sistema se ha cerrado correctamente.");
                System.exit(0);
               
            } else {
                System.out.println("Favor ingrese una opcion valida.");
            }
            }
        }
    }
