/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry;

/**
 * Der Plan ist, dass man jedem Toast Movements hinzufügen kann, nach denen er sich bewegt
 * Diese Erben alle von dieser Klasse
 * weiß nicht wie gut die Idee ist
 * @author Toast
 */
public abstract class Movement {
    
    private double xMovement;
    private double yMovement;
      
    /**
     * Führt dieses Movement für zwischen diesem Frame und dem nächsten aus (Hoffe ist klar was ich meine)
     */
    public void update(){
        
    };

    public double getxMovement() {
        return xMovement;
    }

    public double getyMovement() {
        return yMovement;
    }

    public void setxMovement(double xMovement) {
        this.xMovement = xMovement;
    }

    public void setyMovement(double yMovement) {
        this.yMovement = yMovement;
    }
    
    
    
}
