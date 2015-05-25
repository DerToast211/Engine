/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry;

import toastcry_input.KeysPressed;
import toastcry_input.KeyEinleser;

/**
 * Wird Toasts hinzugefügt, welche mit der Tastatur kontrolliert werden sollen
 * @author Toast
 */
public class PlayerMovement extends Movement {
    
    KeysPressed belegung;
    
    int upKey;
    int leftKey;
    int downKey;
    int rightKey;
    
    /**
     * Erzeugt ein neues P
     * @param upKey
     * @param leftKey
     * @param downKey
     * @param rightKey
     * @param t
     */
    public PlayerMovement(int upKey, int leftKey, int downKey, int rightKey, Toast t){
        super(t);
        this.belegung = t.getWelt().getAktKeysPressed();
        
        this.upKey = upKey;
        belegung.addKey(upKey);
        this.leftKey = leftKey;
        belegung.addKey(leftKey);
        this.downKey = downKey;
        belegung.addKey(downKey);
        this.rightKey = rightKey;
        belegung.addKey(rightKey);
    }
    
    public PlayerMovement(KeysPressed belegung, Toast t){
        super(t);
        this.belegung = belegung;
    }
    
    @Override
    public void update(){
        
        
        if(belegung.keyPressed(upKey)){
            super.setyMovement(-5.0); //Speed sollte man natürlich auch angeben können
        }
        
        if(belegung.keyPressed(leftKey)){
            super.setxMovement(-5.0);
        } 
        
        if(belegung.keyPressed(downKey)){
            super.setyMovement(5.0);
        } else if(!belegung.keyPressed(upKey)) {
            super.setyMovement(0.0);
        }
        
        if(belegung.keyPressed(rightKey)){
            super.setxMovement(5.0);
        } else if (!belegung.keyPressed(leftKey)){
            super.setxMovement(0.0);
        }
    }

    public KeysPressed getGeber() {
        return belegung;
    }
    
    
}
