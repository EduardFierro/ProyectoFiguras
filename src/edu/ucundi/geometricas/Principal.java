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
    private String color;
    int respuesta;
    //Variables que permite obtener lo escrito en consola
    Scanner scannerNumeros = new Scanner(System.in);

    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    //posicion x, y del tercer punto (C)
    private double coordenadaXC;
    private double coordenadaYC;
    //posicion x, y del Cuarto punto (D)
    private double coordenadaXD;
    private double coordenadaYD;
    
    public Principal() {

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

        imprimirLista();
    }

    //Metodo que imprime los calculos resultantes de las figuras
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
        Cuadrado cuadrado = new Cuadrado(coordenadaXC, coordenadaYC, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXD, coordenadaYD);
        cuadrado.hallarDatos();
        listaFiguras.add(cuadrado);
    }

    //Metodo para obtener datos del Triangulo
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
