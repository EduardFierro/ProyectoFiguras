/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.geometricas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;

/**
 * Clase Super Padre de las figuras geometricas
 *
 * @author Eduard Fierro, Arley Rivera
 */
public class FigurasGeometricas extends JFrame {

    private JPanel contentPane;
    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    //posicion x, y del tercer punto (C)
    private double coordenadaXC;
    private double coordenadaYC;
    //posicion x, y del tercer punto (D)
    private double coordenadaXD;
    private double coordenadaYD;
    //Variable que guarda el area de las figuras
    private double area;
    //Variable que guarda el perimetro de las figuras
    private double perimetro;
    //Variable que guarda el tipo de figura 
    private String tipo;
    private String color;
    private FigurasGeometricas figura;
    //Constructor de la clase

    public FigurasGeometricas(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB, double coordenadaXC, double coordenadaYC, double coordenadaXD, double coordenadaYD,String color) {
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

    //Metodo que ayuda a calcular el lado de las figuras 
    public double hallarLado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        double auxiliarX = Math.pow(coordenadaXB - coordenadaXA, 2);
        double auxiliarY = Math.pow(coordenadaYB - coordenadaYA, 2);
        double lado = Math.sqrt(auxiliarX + auxiliarY);
        return lado;
    }

    public FigurasGeometricas(FigurasGeometricas figura) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(200, 0, 800, 600);
        setResizable(false);
        this.figura = figura;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        try{
        Color c = new Color(Integer.parseInt(figura.getColor()));
        g.setColor(c);
        }catch(Exception ex){
            System.out.println("El color debe ser un numero");
            Color a = new Color(0);
            g.setColor(a);
        }        
        if (figura instanceof Triangulo) {
            int xa = (int) figura.getCoordenadaXA() * 10;
            int ya = (int) figura.getCoordenadaYA() * 10;
            int xb = (int) figura.getCoordenadaXB() * 10;
            int yb = (int) figura.getCoordenadaYB() * 10;
            int xc = (int) figura.getCoordenadaXC() * 10;
            int yc = (int) figura.getCoordenadaYC() * 10;
            
            System.out.println(xa);
            
            g.drawLine(xa, ya, xb, yb);
            g.drawLine(xb, yb, xc, yc);
            g.drawLine(xc, yc, xa, ya);
        }
        if (figura instanceof Cuadrado) {
            int xa = (int) figura.getCoordenadaXA() * 10;
            int ya = (int) figura.getCoordenadaYA() * 10;
            int xb = (int) figura.getCoordenadaXB() * 10;
            int yb = (int) figura.getCoordenadaYB() * 10;
            int xc = (int) figura.getCoordenadaXC() * 10;
            int yc = (int) figura.getCoordenadaYC() * 10;
            int xd = (int) figura.getCoordenadaXD() * 10;
            int yd = (int) figura.getCoordenadaYD() * 10;
            System.out.println(xa);
            
            g.drawLine(xa, ya, xb, yb);
            g.drawLine(xb, yb, xc, yc);
            g.drawLine(xc, yc, xd, yd);
            g.drawLine(xd, yd, xa, ya);
            
        }

    }

    //Metodo get del area
    public double getArea() {
        return area;
    }

    //Metodo set del area
    public void setArea(double area) {
        this.area = area;
    }

    //Metodo get de las coordenadas en X del punto A
    public double getCoordenadaXA() {
        return coordenadaXA;
    }

    //Metodo set de las coordenadas en X del punto A
    public void setCoordenadaXA(double coordenadaXA) {
        this.coordenadaXA = coordenadaXA;
    }

    //Metodo get de las coordenadas en Y del punto A
    public double getCoordenadaYA() {
        return coordenadaYA;
    }

    //Metodo set de las coordenadas en Y del punto A
    public void setCoordenadaYA(double coordenadaYA) {
        this.coordenadaYA = coordenadaYA;
    }

    //Metodo get de las coordenadas en X del punto B
    public double getCoordenadaXB() {
        return coordenadaXB;
    }

    //Metodo set de las coordenadas en X del punto B
    public void setCoordenadaXB(double coordenadaXB) {
        this.coordenadaXB = coordenadaXB;
    }

    //Metodo get de las coordenadas en Y del punto B
    public double getCoordenadaYB() {
        return coordenadaYB;
    }

    //Metodo set de las coordenadas en Y del punto B
    public void setCoordenadaYB(double coordenadaYB) {

        this.coordenadaYB = coordenadaYB;
    }

    //Metodo get de las coordenadas en X del punto C
    public double getCoordenadaXC() {
        return coordenadaXC;
    }

    //Metodo set de las coordenadas en X del punto C
    public void setCoordenadaXC(double coordenadaXC) {
        this.coordenadaXC = coordenadaXC;
    }

    //Metodo get de las coordenadas en Y del punto C
    public double getCoordenadaYC() {
        return coordenadaYC;
    }

    //Metodo set de las coordenadas en Y del punto C
    public void setCoordenadaYC(double coordenadaYC) {
        this.coordenadaYC = coordenadaYC;
    }

    //Metodo get del perimetro
    public double getPerimetro() {
        return perimetro;
    }

    //Metodo set del perimetro
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //Metodo get del tipo de figura
    public String getTipo() {
        return tipo;
    }

    //Metodo set del tipo de figura
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCoordenadaXD() {
        return coordenadaXD;
    }

    public void setCoordenadaXD(double coordenadaXD) {
        this.coordenadaXD = coordenadaXD;
    }

    public double getCoordenadaYD() {
        return coordenadaYD;
    }

    public void setCoordenadaYD(double coordenadaYD) {
        this.coordenadaYD = coordenadaYD;
    }
    
}
