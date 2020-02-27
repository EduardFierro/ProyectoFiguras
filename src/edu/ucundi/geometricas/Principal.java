/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.geometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Principal
 *
 * @author Eduard Fierro, Arley Rivera
 */
public class Principal {

    //Lista que guarda todas las figuras que se crean
    private List<FigurasGeometricas> listaFiguras = new ArrayList<>();
    //Variable que guarda la respuesta para proximas figuras
    private String color,respuesta, sigue = "si";
    //Variables que permite obtener lo escrito en consola
    Scanner scannerNumeros = new Scanner(System.in);
    Scanner scannerStrings = new Scanner(System.in);
    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    //posicion x, y del tercer punto (C)
    private double coordenadaXC;
    private double coordenadaYC;

    public Principal() {
        do {
            System.out.print("Que figura desea ingresar?: ");
            respuesta = scannerStrings.nextLine();
            respuesta = respuesta.toLowerCase();
            switch (respuesta) {
                case "rectangulo":
                    datosRectangulo();
                    break;
                case "cuadrado":
                    datosCuadrado();
                    break;
                case "triangulo":
                    datosTriangulo();
                    break;
                default:
                    System.out.println("Esa figura no exste");
                    continue;
            }
            System.out.println("Desea ingresar otra figura?(si/no): ");
            sigue = scannerStrings.nextLine();
        } while (sigue.equals("si"));
        imprimirLista();
    }

    //Metodo que imprime los calculos resultantes de las figuras
    public void imprimirLista() {
        for (FigurasGeometricas lista : listaFiguras) {

            if (lista instanceof Rectangulo) {
                System.out.println(((Rectangulo) lista).getTipo());
                System.out.println("Lado inferior: " + ((Rectangulo) lista).getLado1());
                System.out.println("Lado derecho: " + ((Rectangulo) lista).getLado2());
                System.out.println("Lado superior: " + ((Rectangulo) lista).getLado3());
                System.out.println("Lado izquierdo: " + ((Rectangulo) lista).getLado4());
                System.out.println("Area: " + ((Rectangulo) lista).getArea());
                System.out.println("Perimetro: " + ((Rectangulo) lista).getPerimetro());
            }

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
        Cuadrado cuadrado = new Cuadrado(coordenadaXC, coordenadaYC, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        cuadrado.hallarDatos();
        listaFiguras.add(cuadrado);
    }
    //Metodo de set para el Cuadrado
    public void datosRectangulo() {
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
        Rectangulo rectangulo = new Rectangulo(coordenadaXC, coordenadaYC, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        rectangulo.hallarDatos();
        listaFiguras.add(rectangulo);
    }

    //Metodo de set para el Triangulo
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
        Triangulo triangulo = new Triangulo(coordenadaXC, coordenadaYC, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        triangulo.hallarDatos();
        listaFiguras.add(triangulo);
    }

}
