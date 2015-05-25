/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 * Beschreibt ein Objekt innerhalb der Engine
 * Wollte es nicht Objekt nennen wegen Bedeutung in Programmierung
 * Später wird es wahrscheinlich noch Subklassen für unterschiedliche Arten von Toasts geben
 * @author Toast
 */
public class Toast {

    //Brauch man denke ich nicht, da schon in Grafik enthalten hab aber jetzt keine Lust das umzubauen
    private double x;
    private double y;

    private Rectangle grafik; //Denke erklärt sich von selbst

    private Color Farbe; //Die Farbe

    private ArrayList<Movement> movements; //Alle aktuellen Bewegungen dieses Toasts
    
    private ToastCry welt; //Die Engine in der sich dieser Toast befindet

    public Toast(int xPos, int yPos, int xSize, int ySize, Color c) {

        x = xPos;
        y = yPos;

        grafik = new Rectangle((int) x, (int) y, xSize, ySize);
        Farbe = c;
        
        movements = new ArrayList();

    }
    
    /**
     * Versetzt diesen Toast in den nächsten Frame, indem Koordinaten angepasst werden
     */
    public void update() {

        //Auch alle Movements werden geupdated
        for (Movement m : movements) {
            m.update();
            //Die Werte der Movements werden auf die Koordinaten dieses Toasts gerechnet
            x += m.getxMovement();
            y += m.getyMovement();
        }

        grafik.setLocation((int) x, (int) y);

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Rectangle getGrafik() {
        return grafik;
    }

    public Color getFarbe() {
        return Farbe;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setGrafik(Rectangle grafik) {
        this.grafik = grafik;
    }

    public void setFarbe(Color Farbe) {
        this.Farbe = Farbe;
    }

    public void setWelt(ToastCry welt) {
        this.welt = welt;
    }

    public ToastCry getWelt() {
        return welt;
    }
    
    
    
    
    
    public void addMovement(Movement m){
        movements.add(m);
    }
    
    /**
     * Dieser Toast wird als spielbarer Charackter festgelegt, indem ihm ein PlayerMovement hinzugefügt wird
     * Den Toast kann man mit den als Parameter angegebenen Tasten steuern
     * @param upKey
     * @param leftKey
     * @param downKey
     * @param rightKey
     */
    public void setPlayer(int upKey, int leftKey, int downKey, int rightKey){
        PlayerMovement p = new PlayerMovement(upKey, leftKey, downKey, rightKey, this);
        this.addMovement(p);
    }

    
    

}
