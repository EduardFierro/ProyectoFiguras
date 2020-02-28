/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.geometricas;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase Hija cuadrado
 *
 * @author Eduard Fierro, Arley Rivera
 */
public class Cuadrado extends FigurasGeometricas {

    //Variables que guardan los valores de los lados del cuadrado 
    private int lado1, lado2, lado3, lado4;
    //private double coordenadaXD, coordenadaYD;

    //Constructor de la clase
    public Cuadrado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB, double coordenadaXC, double coordenadaYC, double coordenadaXD, double coordenadaYD, String color) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXC, coordenadaYC, coordenadaXD, coordenadaYD,color);
        
    }

    public void hallarDatos() {
        lado1 = (int) hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        lado2 = (int) hallarLado(this.getCoordenadaXB(), this.getCoordenadaXC(), this.getCoordenadaYB(), this.getCoordenadaYC());
        lado3 = (int) hallarLado(this.getCoordenadaXC(), this.getCoordenadaXD(), this.getCoordenadaYC(), this.getCoordenadaYD());
        lado4 = (int) hallarLado(this.getCoordenadaXD(), this.getCoordenadaXA(), this.getCoordenadaYD(), this.getCoordenadaYA());
        this.setArea(lado1 * lado2);
        this.setPerimetro(lado1 + lado2 + lado3 + lado4);
        hallarTipo();
        FigurasGeometricas frame = new FigurasGeometricas(this);
        frame.setVisible(true);
    }
  

    //Metodo get del primer lado de la figura
    public double getLado1() {
        return lado1;
    }
    //Metodo set del primer lado de la figura

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    //Metodo get del segundo lado de la figura
    public double getLado2() {
        return lado2;
    }

    //Metodo set del segundo lado de la figura
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    //Metodo get del tercer lado de la figura
    public double getLado3() {
        return lado3;
    }

    //Metodo set del tercer lado de la figura
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    //Metodo get del cuarto lado de la figura
    public double getLado4() {
        return lado4;
    }

    //Metodo set del cuarto lado de la figura
    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
/*
    //Metodo Get de la CoordenaXD de la figura
    public double getCoordenadaXD() {
        return coordenadaXD;
    }

    //Metodo set de la CoordenaXD de la figura
    public void setCoordenadaXD(double coordenadaXD) {
        this.coordenadaXD = coordenadaXD;
    }

    //Metodo get de la CoordenaYD de la figura
    public double getCoordenadaYD() {
        return coordenadaYD;
    }

    //Metodo set de la CoordenaYD de la figura
    public void setCoordenadaYD(double coordenadaYD) {
        this.coordenadaYD = coordenadaYD;
    }
*/
    public void hallarTipo() {
        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
            this.setTipo("Cuadrado");
        } else if (lado1 == lado3 && lado2 == lado4) {
            this.setTipo("Rectangulo");
        } else {
            this.setTipo("No es una figura de la clase");

        }

    }

}
