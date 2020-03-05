
package edu.ucundi.geometricas;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase Hija cuadrado
 *
 * @author Eduard Fierro
 * @author Arley Rivera
 */
public class Cuadrado extends FigurasGeometricas {
    private int lado1, lado2, lado3, lado4;
    /**
     * Constructor de la clase
     * @param coordenadaXA
     * @param coordenadaYA
     * @param coordenadaXB
     * @param coordenadaYB
     * @param coordenadaXC
     * @param coordenadaYC
     * @param coordenadaXD
     * @param coordenadaYD
     * @param color 
     */
    public Cuadrado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB, double coordenadaXC, double coordenadaYC, double coordenadaXD, double coordenadaYD, String color) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXC, coordenadaYC, coordenadaXD, coordenadaYD,color);
        
    }

    @Override
    public void hallarDatos() {
        lado1 = (int) hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        lado2 = (int) hallarLado(this.getCoordenadaXB(), this.getCoordenadaXC(), this.getCoordenadaYB(), this.getCoordenadaYC());
        lado3 = (int) hallarLado(this.getCoordenadaXC(), this.getCoordenadaXD(), this.getCoordenadaYC(), this.getCoordenadaYD());
        lado4 = (int) hallarLado(this.getCoordenadaXD(), this.getCoordenadaXA(), this.getCoordenadaYD(), this.getCoordenadaYA());
        this.setArea(lado1 * lado2);
        this.setPerimetro(lado1 + lado2 + lado3 + lado4);
        hallarTipo();
        Pintar frame = new Pintar(this);
        frame.setVisible(true);
    }
    /**
     * Metodo get del primer lado de la figura
     * @return 
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * Metodo set del primer lado de la figura
     * @param lado1 
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    /**
     * Metodo get del segundo lado de la figura
     * @return 
     */
    public double getLado2() {
        return lado2;
    }
    /**
     * Metodo set del segundo lado de la figura
     * @param lado2 
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    /**
     * Metodo get del tercer lado de la figura
     * @return 
     */
    public double getLado3() {
        return lado3;
    }
    /**
     * Metodo set del tercer lado de la figura
     * @param lado3 
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    /**
     * Metodo get del cuarto lado de la figura
     * @return 
     */
    public double getLado4() {
        return lado4;
    }
    /**
     * Metodo set del cuarto lado de la figura
     * @param lado4 
     */
    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
    
    @Override
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
