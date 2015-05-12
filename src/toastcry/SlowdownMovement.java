/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry;

/**
 * Funktioniert (noch) nicht
 * @author Toast
 */
public class SlowdownMovement extends Movement {

    private Toast toast;
    private double slowdown;

    public SlowdownMovement(Toast t, double slowdown) {
        super();
        this.toast = t;
        this.slowdown = slowdown;

    }

    @Override
    public void update() {

        if ((super.getxMovement() < slowdown && super.getxMovement() > 0.0) || (super.getxMovement() > -slowdown && super.getxMovement() < 0.0)) {
            super.setxMovement(0.0);
        } else if (super.getxMovement() > 0.0) {
            super.setxMovement(super.getxMovement() - slowdown);
        } else {
            super.setxMovement(super.getxMovement() + slowdown);
        }
        
        if ((super.getyMovement() < slowdown && super.getyMovement() > 0.0) || (super.getyMovement() > -slowdown && super.getyMovement() < 0.0)) {
            super.setyMovement(0.0);
        } else if (super.getyMovement() > 0.0) {
            super.setyMovement( - slowdown);
        } else {
            super.setyMovement(super.getyMovement() + slowdown);
        }

    }

    private void slowdown(double richtung) {

    }
}
