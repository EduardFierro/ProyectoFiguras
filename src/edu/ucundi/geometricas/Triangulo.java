/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.geometricas;

/**
 * Clase Hija Triangulo 
 * @author Eduard Fierro, Arley Rivera
 */
public class Triangulo extends FigurasGeometricas{
    
    //Variables que gusradan el valor de los lados del triangulo
    double lado1, lado2, lado3;
    //Constructor
    public Triangulo(double coordenadaXC, double coordenadaYC, double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB, coordenadaXC, coordenadaYC);
        
    }
    
    public void hallarDatos() {
        lado1 = hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        lado2 = hallarLado(this.getCoordenadaXB(), this.getCoordenadaYB(), this.getCoordenadaXC(), this.getCoordenadaYC());
        lado3 = hallarLado(this.getCoordenadaXC(), this.getCoordenadaYC(), this.getCoordenadaXA(), this.getCoordenadaYA());
        this.setPerimetro(lado1+lado2+lado3);
        hallarAreaTriangulo();
        hallarTipo();
    }
    //Metodo que halla el area de la figura
    public void hallarAreaTriangulo(){
        double semiperimetro = (lado1 + lado2 + lado3) / 2;        
        double ladoAux1 = semiperimetro - lado1;
        double ladoAux2 = semiperimetro - lado2;
        double ladoAux3 = semiperimetro - lado3;
        
        double area =  Math.sqrt((semiperimetro * ladoAux1 * ladoAux2 * ladoAux3));
        this.setArea(area);
    }
    
    //Metodo get del primer lado
    public double getLado1() {
        return lado1;
    }

    //Metodo set del primer lado
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    //Metodo get del segundo lado
    public double getLado2() {
        return lado2;
    }

    //Metodo set del segundo lado
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //Metodo get del tercer lado
    public double getLado3() {
        return lado3;
    }

    //Metodo set del tercer lado
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void hallarTipo() {
        if(lado1 == lado2 && lado1==lado3 && lado2 ==lado3){
            this.setTipo("Triangulo Equilatero");
        }
        if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            this.setTipo("Triangulo Isosceles");
        }
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            this.setTipo("Triangulo Escaleno");
        }
    }
    
    
}
