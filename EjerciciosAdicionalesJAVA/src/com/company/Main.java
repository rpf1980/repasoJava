package com.company;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    //https://github.com/LuisJoseSanchez/aprende-java-con-ejerciciosjava
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("MENÚ MAS EJERCICIOS");
        System.out.println("===================");
        System.out.println("[1] Suma, resta, multiplica, divide, módulo");
        System.out.println("[2] Mayor de dos");
        System.out.println("[3] Área de un círculo");
        System.out.println("[4] Saber CARACTER mediante código ASCII");
        System.out.println("[5] Sabet CÓDIGO ASCII mediante caracter");
        System.out.println("[6] Obtener el precio con IVA de un producto que no tiene IVA");
        System.out.println("[7] Obtener el precio de un producto antes de aplicar el IVA");
        System.out.println("[8] Lee un caracter");
        System.out.println("[9] Números del 1 al 100 con bucle While");
        System.out.println("[10] Números del 1 al 100 con bucle For");
        System.out.println("[11] Números divisibles por 2 y 3 del 1 al 100 con bucle While");
        System.out.println("[12] Número de ventas");
        System.out.println("[13] Calcula volumen de un cono");
        System.out.println("[14] Conversor Mb a Kb");
        System.out.println("[15] Conversor Mb a Gb");
        System.out.println("[16] Nota primer examen 40% || Nota fianal");
        System.out.println("[17] ¿Qué asignatura toca a primera hora?");
        System.out.println("[18] Ordena 3 enteros");
        System.out.println("[19] Elige vértices de una pirámide o elige rombo");
        System.out.println("[20] Última cifra de un número entero");
        System.out.println("[21] Primera cifra de un número entero");
        System.out.println("[22] ¿Cuántos minutos faltan para el fin de semana?");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                // Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
                // resta, multiplicación, división y módulo (resto de la división).

                int a, b;
                a = 4;
                b = 16;

                System.out.println("Suma = " + (a + b));
                System.out.println("Resta = " + (b - a));
                System.out.println("Multiplicacion = " + (a * b));
                System.out.println("División = " + (b / a));
                System.out.println("Resto = " + (b % a));
            }
            break;

            case 2:
            {
                //Declara 2 variables numéricas (con el valor que desees),
                // he indica cual es mayor de los dos. Si son iguales indicarlo también.
                // Ves cambiando los valores para comprobar que funciona.

                int a = 200;
                int b = 19;

                if (a > b)
                {
                    System.out.println("El nº mayor es = " + a);
                } else
                {
                    System.out.println("El nº mayor es = " + b);
                }
            }
            break;

            case 3:
            {
                // Haz una aplicación que calcule el área de un círculo(pi*R2).
                // El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
                // Usa la constante PI y el método pow de Math.

                double area;
                double radio;
                System.out.println("Escribe el radio: ");
                radio = sc.nextDouble();

                area = 3.1416 * (radio * radio);
                System.out.println("El área del círulo es = " + area);
            }
            break;

            case 4:
            {
                //Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
                // Por ejemplo: si introduzco un 97, me muestre una a.

                String texto = "";
                int codigo;
                char caracter;

                //Leemos el codigo
                System.out.print("Escribe un código de la tabla ASCII: ");
                texto = sc.next();

                //Pasamos string a int
                codigo = Integer.parseInt(texto);

                //Pasamos codigo a char
                caracter = (char) codigo;

                System.out.println("El código " + codigo + " = " + caracter);
            }
            break;

            case 5:
            {
                //Saber código de tabla ASCII mediante caracter
                char caracter;
                int codigo;

                //Leemos el caracter
                System.out.print("Escribe caracter: ");
                caracter = sc.next().charAt(0);

                //Pasamos caracter a int
                codigo = (int) caracter;

                System.out.println("El código " + codigo + " = " + caracter);
            }
            break;

            case 6:
            {
                // Lee un número por teclado que pida el precio de un producto (puede tener decimales)
                // y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

                double precio;
                double total;
                final double iva = 0.21;

                //Leemos número
                System.out.println("Escribe el precio del producto: ");
                precio = sc.nextDouble();

                total = precio + (precio * iva);

                System.out.println("Precio = " + precio);
                System.out.println("Precio con iva = " + total);
            }
            break;

            case 7:
            {
                //Calcula el precio de un producto antes de llevar IVA

                final double iva = 1.21;
                double precio;
                double resultado;

                System.out.println("Escribe el precio: ");
                precio = sc.nextDouble();

                resultado = precio / 1.21;

                System.out.println("Precio = " + precio);
                System.out.println("IVA = " + resultado);

            }
            break;

            case 8:
            {
                char caracter;

                System.out.println("Escribe caracter: ");
                caracter = sc.next().charAt(0);

                System.out.println(caracter);
            }
            break;

            case 9:
            {
                int i;

                i = 1;
                while (i <= 100)
                {
                    System.out.println(i);
                    i++;
                }
            }
            break;

            case 10:
            {
                int i;

                for (i = 1; i <= 100; i++)
                {
                    System.out.println(i);
                }
            }
            break;

            case 11:
            {
                int i;

                i = 1;
                while (i <= 100)
                {
                    if (i % 2 == 0 || i % 3 == 0)
                    {
                        System.out.println(i);
                    }
                    i++;
                }
            }
            break;

            case 12:
            {
                //Realiza una aplicación que nos pida un número de ventas a introducir,
                //después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
                //Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

                int tope;
                int suma = 0;
                int venta = 0;
                int i;

                System.out.println("Escribe número de ventas: ");
                tope = sc.nextInt();

                for (i = 0; i < tope; i++)
                {
                    System.out.println("Escribe venta: ");
                    venta = sc.nextInt();
                    suma = suma + venta;
                }
                System.out.println("La suma de las ventas es = " + suma);
            }
            break;

            case 13:
            {
                //Escribe un programa que calcule el area de un cono.
                // Fórmula superficie lateral:   Al = π * r * h
                // Fórmula superfice del cono:   At = π * r * (h + r)

                final double pi = 3.1415926;
                double radio;
                double altura;
                double area;

                //Leemos datos
                System.out.print("Escribe el radio: ");
                radio = sc.nextDouble();
                System.out.print("Escribe la altura: ");
                altura = sc.nextInt();

                area = pi * radio * altura;

                System.out.println("Superficie lateral = " + area);

                area = pi * radio * (altura + radio);

                System.out.println("Superfice del cono = " + area);

            }
            break;

            case 14:
            {
                //1 bit = 1 posición binaria (valor 0/1)
                //1 bytes = 8 bits
                //1.024 bytes = 1 kilobyte (abreviado KB)
                //
                //1.024 KB = 1 Megabyte (abreviado MB. Aunque, para simplificar, muchas veces se explica como “aproximadamente 1.000 KB y, popularmente, conocido como “mega”)
                //
                //1.024 MB = 1 Gigabyte (GB, giga)
                //1.024 GB = 1 Terabyte (TB, tera)
                //1.024 TB = 1 Petabyte (PB, peta)
                //1.014 PB = 1 Exabyte (EB)
                //1.014 EB = 1 Zettabyte (ZB)
                //1.014 ZB = 1 Yottabyte (YB)
                //
                //... via Definicion ABC https://www.definicionabc.com/tecnologia/byte-kb-mb-gb-tb.php

                System.out.println("=================");
                System.out.println("Conversor Mb a Kb");
                System.out.println("=================");
                System.out.println();

                int mb, kb;

                System.out.println("Escribe los Mb: ");
                mb = sc.nextInt();

                kb = mb * 1024;

                System.out.println(mb + " MB = " + kb + " KB");
            }
            break;

            case 15:
            {
                int mb, gb;

                System.out.println("=================");
                System.out.println("Conversor Mb a Gb");
                System.out.println("=================");
                System.out.println();

                System.out.print("Escribe los MB: ");
                mb = sc.nextInt();

                gb = mb / 1024;

                System.out.println(mb + " MB = " + gb + " GB");
            }
            break;

            case 16:
            {
                //Realiza un programa que calcule la nota que hace falta sacar en el segundo
                //examen de la asignatura **Programación** para obtener la media deseada.
                //Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la
                //del segundo examen un 60%.

                // Ejemplo 1:
                //Introduce la nota del primer examen: 7
                //¿Qué nota quieres sacar en el trimestre? 8.5
                //Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.

                //Ejemplo 2:
                //Introduce la nota del primer examen: 8
                //¿Qué nota quieres sacar en el trimestre? 7
                //Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.

                double nota1, nota2;
                double notaFinal;
                DecimalFormat df = new DecimalFormat("#.00");

                System.out.print("Escribe primera nota: ");
                nota1 = sc.nextDouble();
                System.out.println("¿Qué nota quieres sacar en el trimestre?");
                notaFinal = sc.nextDouble();

                //La nota final la calculamos de esta forma
                // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100;

                //Por tanto, despejando nota2 tenemos:
                nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;

                System.out.println("Para tener una nota final en el trimestre de " + notaFinal + " necesitas sacar un " + df.format(nota2));

            }
            break;

            case 17:
            {
                //Escribe un programa que pida por teclado un día de la semana
                //y que diga qué asignatura toca a primera hora ese día.

                String dia;

                //Pedimos el día
                System.out.println("Escribe día: ");
                dia = sc.next();

                switch (dia)
                {
                    case "Lunes":
                        System.out.println("Álgebra");
                        break;
                    case "Martes":
                        System.out.println("Historia");
                        break;
                    case "Miércoles":
                        System.out.println("Inglés");
                        break;
                    case "Jueves":
                        System.out.println("Lengua");
                        break;
                    case "Viernes":
                        System.out.println("Informática");
                        break;
                    default:
                        ;
                        break;

                }
            }
            break;

            case 18:
            {
                //Este programa ordena 3 números enteros que se introducen por teclado

                int a, b, c;

                System.out.println("Escribe 3 enteros: ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();

                if (a < b && b < c)
                {
                    System.out.println("Menor = " + a);
                    System.out.println("Mediano = " + b);
                    System.out.println("Mayor = " + c);
                } else
                {
                    if (a < c && c < b)
                    {
                        System.out.println("Menor = " + a);
                        System.out.println("Mediano = " + c);
                        System.out.println("Mayor = " + b);
                    } else
                    {
                        if (b < a && a < c)
                        {
                            System.out.println("Menor = " + b);
                            System.out.println("Mediano = " + a);
                            System.out.println("Mayor = " + c);
                        } else
                        {
                            if (b < c && c < a)
                            {
                                System.out.println("Menor = " + b);
                                System.out.println("Mediano = " + c);
                                System.out.println("Mayor = " + a);
                            } else
                            {
                                if (c < a && a < b)
                                {
                                    System.out.println("Menor = " + c);
                                    System.out.println("Mediano = " + a);
                                    System.out.println("Mayor = " + b);
                                } else
                                {
                                    if (c < b && b < a)
                                    {
                                        System.out.println("Menor = " + c);
                                        System.out.println("Mediano = " + b);
                                        System.out.println("Mayor = " + a);
                                    } else
                                    {
                                        System.out.println("¡Los números son iguales!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            break;

            case 19:
            {
                //Escribe un programa que pinte una pirámide rellena con un carácter
                //introducido por teclado que podrá ser una letra, un número o un
                //símbolo como *, +, -, $, &, etc. El programa debe permitir al
                //usuario mediante un menú elegir si el vértice de la pirámide está
                //apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
                //derecha.

                int menu;

                System.out.println("=============");
                System.out.println(">>> MENÚ <<<<");
                System.out.println("=============");
                System.out.println("[1] Pirámide con vértice hacia arriba");
                System.out.println("[2] Pirámide con vértice hacia abajo");
                System.out.println("[3] Rombo");
                System.out.println();
                System.out.print("Elige una opción: ");
                menu = sc.nextInt();

                switch (menu)
                {
                    case 1:
                    {
                        int numeroFilas;
                        System.out.print("Escribe el número de filas: ");
                        numeroFilas = sc.nextInt();

                        for (int altura = 1; altura <= numeroFilas; altura++)
                        {
                            for (int blanco = 1; blanco <= numeroFilas - altura; blanco++)
                            {
                                System.out.print(" ");
                            }
                            for (int asterisco = 1; asterisco <= (altura * 2) - 1; asterisco++)
                            {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                    case 2:
                    {
                        int numeroFilas;
                        System.out.print("Número de filas: ");
                        numeroFilas = sc.nextInt();

                        for (int numBlancos = 0, numAsteriscos = (numeroFilas * 2) - 1; numAsteriscos > 0; numBlancos++, numAsteriscos -= 2)
                        {
                            //Espacios en blanco
                            for (int i = 0; i < numBlancos; i++)
                            {
                                System.out.print(" ");
                            }
                            //Asteriscos
                            for (int j = numAsteriscos; j > 0; j--)
                            {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                    case 3:
                    {
                        char espacio = ' ';
                        char asterisco = '*';

                        for (int i = 1; i <= 5; i++)
                        {
                            for (int espacios = 5 - i; espacios > 0; espacios--)
                                System.out.print(espacio);

                            for (int lineas = 1; lineas < 2 * i; lineas++)
                                System.out.print(asterisco);

                            System.out.println();

                        }

                        for (int i = 4; i >= 1; i--)
                        {
                            for (int espacios = 5 - i; espacios > 0; espacios--)
                                System.out.print(espacio);

                            for (int lineas = 1; lineas < 2 * i; lineas++)
                                System.out.print(asterisco);

                            System.out.println();
                        }
                    }
                    break;

                }
            }
            break;

            case 20:
            {
                int n;
                System.out.print("Escriba un número: ");
                n = sc.nextInt();

                System.out.println("La última cifra del número es = " + (n % 10));
            }
            break;

            case 21:
            {
                int n, primera;
                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                if (n < 10)
                {
                    primera = n;
                    System.out.println("La primera cifra de n " + n + " = " + primera);
                } else
                {
                    if (n >= 10 && n < 100)
                    {
                        primera = n / 10;
                        System.out.println("La primera cifra de n " + n + " = " + primera);
                    } else
                    {
                        if (n >= 100 && n < 1000)
                        {
                            primera = n / 100;
                            System.out.println("La primera cifra de n " + n + " = " + primera);
                        } else
                        {
                            if (n >= 1000 && n < 10000)
                            {
                                primera = n / 1000;
                                System.out.println("La primera cifra de n " + n + " = " + primera);
                            } else
                            {
                                if (n >= 10000)
                                {
                                    primera = n / 10000;
                                    System.out.println("La primera cifra de n " + n + " = " + primera);
                                }
                            }
                        }
                    }
                }
            }
            break;

            case 22:
                {
                    //Realiza un programa que, dado un día de la semana (de lunes a viernes) y
                    //una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
                    //semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
                    //Se da por hecho que el usuario introducirá un día y hora correctos,
                    //anterior al viernes a las 15:00h.
                }
                break;
        }

    }
}

