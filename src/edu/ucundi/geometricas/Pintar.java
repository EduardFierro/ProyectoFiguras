package edu.ucundi.geometricas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Eduard Fierro
 * @author jersson arley
 */
public class Pintar extends JFrame{
     private JPanel contentPane;
     private FigurasGeometricas figura;
    /**
     * 
     * @param figura 
     */
    public Pintar(FigurasGeometricas figura) {
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

    /**
     * 
     * @param g 
     */
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
           
            g.drawLine(xa, ya, xb, yb);
            g.drawLine(xb, yb, xc, yc);
            g.drawLine(xc, yc, xd, yd);
            g.drawLine(xd, yd, xa, ya);
            
        }

    }
}
