/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.geometricas;

/**
 * Clase Hija Rectangulo
 *
 * @author Eduard Fierro, Arley Rivera
 */
public class Rectangulo extends FigurasGeometricas {

    //Variables que guardan los valores de los lados del rectangulo 
    private double lado1, lado2, lado3, lado4;

    //Constructor de la clase
    public Rectangulo(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB, double coordenadaXC, double coordenadaYC) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXC, coordenadaYC);
    }

    public void hallarDatos() {
        lado1 = hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        lado2 = hallarLado(this.getCoordenadaXB(), this.getCoordenadaXC(), this.getCoordenadaYB(), this.getCoordenadaYC());
        lado3 = lado1;
        lado4 = lado2;
        this.setArea(lado1 * lado2);
        this.setPerimetro(lado1 + lado2 + lado3 + lado4);
        hallarTipo();
    }

    //Metodo get del primer lado de la figura
    public double getLado1() {
        return lado1;
    }
    //Metodo set del primer lado de la figura

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    //Metodo get del segundo lado de la figura
    public double getLado2() {
        return lado2;
    }

    //Metodo set del segundo lado de la figura
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //Metodo get del tercer lado de la figura
    public double getLado3() {
        return lado3;
    }

    //Metodo set del tercer lado de la figura
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    //Metodo get del cuarto lado de la figura
    public double getLado4() {
        return lado4;
    }

    //Metodo set del cuarto lado de la figura
    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    public void hallarTipo() {

        if (lado1 == lado3 && lado2 == lado4) {
            this.setTipo("Rectangulo");
        } else {
            this.setTipo("No es un rectangulo");
        }

    }

}
