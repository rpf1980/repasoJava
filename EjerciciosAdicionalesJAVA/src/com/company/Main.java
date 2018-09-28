package com.company;

import java.util.Scanner;

public class Main
{

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
        System.out.println();
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

                    System.out.println("Suma = " + (a+b));
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

                    if(a > b)
                    {
                        System.out.println("El nº mayor es = " + a);
                    }
                    else
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
                    codigo = (int)caracter;

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

                    total = precio + (precio*iva);

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
                    while(i <= 100)
                    {
                        System.out.println(i);
                        i++;
                    }
                }
                break;

            case 10:
                {
                    int i;

                    for(i = 1; i <= 100; i++)
                    {
                        System.out.println(i);
                    }
                }
                break;

            case 11:
                {
                    int i;

                    i = 1;
                    while(i <= 100)
                    {
                        if(i %2 == 0 || i %3 == 0)
                        {
                            System.out.println(i);
                        }
                        i++;
                    }
                }
                break;
        }

    }
}
