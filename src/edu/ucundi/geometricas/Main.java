/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.geometricas;

import java.awt.EventQueue;

/**
 * Clase Main de ejecucion del programa
 * @author Eduard Fierro, Arley Rivera
 */
public class Main {
    public static void main(String[] args) {
        Principal prin = new Principal();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FigurasGeometricas frame = new FigurasGeometricas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
}
