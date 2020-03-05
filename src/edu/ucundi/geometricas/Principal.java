package edu.ucundi.geometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Principal
 *
 * @author Eduard Fierro
 * @author Arley Rivera
 */
public class Principal {
    
    
    private List<FigurasGeometricas> listaFiguras = new ArrayList<>();
   
    public String color;
    public int respuesta;
    
    Scanner scannerNumeros = new Scanner(System.in);
    Scanner scannerLetra = new Scanner(System.in);
    /**
     *  posicion x, y del primer punto (A)
     *  posicion x, y del segundo punto (B)
     *  posicion x, y del tercer punto (C)
     *  posicion x, y del Cuarto punto (D)
     */
    
    private double coordenadaXA;
    private double coordenadaYA;
    
    private double coordenadaXB;
    private double coordenadaYB;
    
    private double coordenadaXC;
    private double coordenadaYC;
   
    private double coordenadaXD;
    private double coordenadaYD;
    public String res;
    
    public Principal() {
        do {
            System.out.println("Que figura desea ingresar?: ");
            System.out.println("1.Triangulo");
            System.out.println("2.Cuadrado/Rectangulo");
            System.out.print(": ");

            respuesta = scannerNumeros.nextInt();

            switch (respuesta) {
                case 1:
                    datosTriangulo();
                    break;
                case 2:
                    datosCuadrado();
                    break;
                default:
                    System.out.println("Esa figura no exste");
            }
            System.out.print("Quiere ingresar otra figura (si/no):  ");
            res = scannerLetra.nextLine();
            
        } while (res.equals("si"));

        imprimirLista();
    }
    /**
     * Metodo que imprime los calculos resultantes de las figuras
     */
    public void imprimirLista() {
        for (FigurasGeometricas lista : listaFiguras) {

            if (lista instanceof Cuadrado) {
                System.out.println(((Cuadrado) lista).getTipo());
                System.out.println("Lado inferior: " + ((Cuadrado) lista).getLado1());
                System.out.println("Lado derecho: " + ((Cuadrado) lista).getLado2());
                System.out.println("Lado superior: " + ((Cuadrado) lista).getLado3());
                System.out.println("Lado izquierdo: " + ((Cuadrado) lista).getLado4());
                System.out.println("Area: " + ((Cuadrado) lista).getArea());
                System.out.println("Perimetro: " + ((Cuadrado) lista).getPerimetro());
            }
            if (lista instanceof Triangulo) {
                System.out.println(((Triangulo) lista).getTipo());
                System.out.println("Lado 1: " + ((Triangulo) lista).getLado1());
                System.out.println("Lado 2: " + ((Triangulo) lista).getLado2());
                System.out.println("Lado 3: " + ((Triangulo) lista).getLado3());
                System.out.println("Area: " + ((Triangulo) lista).getArea());
                System.out.println("Perimetro: " + ((Triangulo) lista).getPerimetro());
            }

            System.out.println("--------------------------------------");
        }
    }

    //Metodo de set para el Cuadrado
    public void datosCuadrado() {
        System.out.print("Ingrese coordenada X del primer punto: ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto: ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto: ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto: ");
        coordenadaYB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del tercer punto: ");
        coordenadaXC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del tercer punto: ");
        coordenadaYC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del cuarto punto: ");
        coordenadaXD = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del cuarto punto: ");
        coordenadaYD = scannerNumeros.nextDouble();
        System.out.println("digite el color para dibujar la figura: ");
        color = scannerLetra.nextLine();
        Cuadrado cuadrado = new Cuadrado(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXC, coordenadaYC, coordenadaXD, coordenadaYD, color);
        cuadrado.hallarDatos();
        listaFiguras.add(cuadrado);
    }

    /**
     * //Metodo para obtener datos del Triangulo
    */
    public void datosTriangulo() {
        System.out.print("Ingrese coordenada X del primer punto: ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto: ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto: ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto: ");
        coordenadaYB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del tercer punto: ");
        coordenadaXC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del tercer punto: ");
        coordenadaYC = scannerNumeros.nextDouble();
        System.out.println("digite el color para dibujar la figura: ");
        color = scannerLetra.nextLine();
        Triangulo triangulo = new Triangulo(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXC, coordenadaYC, color);
        triangulo.hallarDatos();
        listaFiguras.add(triangulo);
    }
}
