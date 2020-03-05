package edu.ucundi.geometricas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.List;

/**
 * Clase Super Padre de las figuras geometricas
 *
 * @author Eduard Fierro, Arley Rivera
 */
public abstract class FigurasGeometricas implements IFiguras {

    private double coordenadaXA;
    private double coordenadaYA;

    private double coordenadaXB;
    private double coordenadaYB;

    private double coordenadaXC;
    private double coordenadaYC;

    private double coordenadaXD;
    private double coordenadaYD;

    private double area;

    private double perimetro;

    private String tipo;
    private String color;

    /**
     *
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
    public FigurasGeometricas(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB, double coordenadaXC, double coordenadaYC, double coordenadaXD, double coordenadaYD, String color) {
        this.coordenadaXA = coordenadaXA;
        this.coordenadaYA = coordenadaYA;
        this.coordenadaXB = coordenadaXB;
        this.coordenadaYB = coordenadaYB;
        this.coordenadaXC = coordenadaXC;
        this.coordenadaYC = coordenadaYC;
        this.coordenadaXD = coordenadaXD;
        this.coordenadaYD = coordenadaYD;
        this.color = color;

    }

    /**
     * Metodo que ayuda a calcular el lado de las figuras
     *
     * @param coordenadaXA
     * @param coordenadaYA
     * @param coordenadaXB
     * @param coordenadaYB
     * @return
     */
    public double hallarLado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        double auxiliarX = Math.pow(coordenadaXB - coordenadaXA, 2);
        double auxiliarY = Math.pow(coordenadaYB - coordenadaYA, 2);
        double lado = Math.sqrt(auxiliarX + auxiliarY);
        return lado;
    }

    /**
     * Metodo get del area
     *
     * @return
     */
    public double getArea() {
        return area;
    }

    /**
     * Metodo set del area
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Metodo get de las coordenadas en X del punto A
     *
     * @return
     */
    public double getCoordenadaXA() {
        return coordenadaXA;
    }

    /**
     * Metodo set de las coordenadas en X del punto A
     *
     * @param coordenadaXA
     */
    public void setCoordenadaXA(double coordenadaXA) {
        this.coordenadaXA = coordenadaXA;
    }

    /**
     * Metodo get de las coordenadas en Y del punto A
     *
     * @return
     */
    public double getCoordenadaYA() {
        return coordenadaYA;
    }

    /**
     * Metodo set de las coordenadas en Y del punto A
     *
     * @param coordenadaYA
     */
    public void setCoordenadaYA(double coordenadaYA) {
        this.coordenadaYA = coordenadaYA;
    }

    /**
     * Metodo get de las coordenadas en X del punto B
     *
     * @return
     */
    public double getCoordenadaXB() {
        return coordenadaXB;
    }

    /**
     * Metodo set de las coordenadas en X del punto B
     *
     * @param coordenadaXB
     */
    public void setCoordenadaXB(double coordenadaXB) {
        this.coordenadaXB = coordenadaXB;
    }

    /**
     * Metodo get de las coordenadas en Y del punto B
     *
     * @return
     */
    public double getCoordenadaYB() {
        return coordenadaYB;
    }

    /**
     * Metodo set de las coordenadas en Y del punto B
     *
     * @param coordenadaYB
     */
    public void setCoordenadaYB(double coordenadaYB) {

        this.coordenadaYB = coordenadaYB;
    }

    /**
     * Metodo get de las coordenadas en X del punto C
     *
     * @return
     */
    public double getCoordenadaXC() {
        return coordenadaXC;
    }

    /**
     * Metodo set de las coordenadas en X del punto C
     *
     * @param coordenadaXC
     */
    public void setCoordenadaXC(double coordenadaXC) {
        this.coordenadaXC = coordenadaXC;
    }

    /**
     * Metodo get de las coordenadas en Y del punto C
     *
     * @return
     */
    public double getCoordenadaYC() {
        return coordenadaYC;
    }

    /**
     * Metodo set de las coordenadas en Y del punto C
     *
     * @param coordenadaYC
     */
    public void setCoordenadaYC(double coordenadaYC) {
        this.coordenadaYC = coordenadaYC;
    }

    /**
     * Metodo get del perimetro
     *
     * @return
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Metodo set del perimetro
     *
     * @param perimetro
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * Metodo get del tipo de figura
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo set del tipo de figura
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public double getCoordenadaXD() {
        return coordenadaXD;
    }

    /**
     *
     * @param coordenadaXD
     */
    public void setCoordenadaXD(double coordenadaXD) {
        this.coordenadaXD = coordenadaXD;
    }

    /**
     *
     * @return
     */
    public double getCoordenadaYD() {
        return coordenadaYD;
    }

    /**
     *
     * @param coordenadaYD
     */
    public void setCoordenadaYD(double coordenadaYD) {
        this.coordenadaYD = coordenadaYD;
    }

}
