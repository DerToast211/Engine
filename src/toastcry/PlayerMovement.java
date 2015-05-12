/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry;

import toastcry_input.KeyGeber;
import toastcry_input.KeyList;

/**
 * Wird Toasts hinzugefügt, welche mit der Tastatur kontrolliert werden sollen
 * @author Toast
 */
public class PlayerMovement extends Movement {
    
    KeyGeber geber; //Der Key-Listener für dieses Movement
    //Wahrscheinlich ist es eine bessere Idee, wenn alle Toasts durch einen zentralen Key-Listener versorgt werden
    //Dafür müsste man aber auch die Key-Klassen verändern
    
    /**
     * Erzeugt ein neues P
     * @param upKey
     * @param leftKey
     * @param downKey
     * @param rightKey
     */
    public PlayerMovement(int upKey, int leftKey, int downKey, int rightKey){
        super();
        this.geber = new KeyGeber(upKey, leftKey, downKey, rightKey);
    }
    
    public PlayerMovement(KeyGeber geber){
        super();
        this.geber = geber;
    }
    
    @Override
    public void update(){
        
        KeyList aktKeyList = geber.getAktKeyList();
        
        if(aktKeyList.isUpPressed()){
            super.setyMovement(-5.0); //Speed sollte man natürlich auch angeben können
        } 
        
        if(aktKeyList.isLeftPressed()){
            super.setxMovement(-5.0);
        } 
        
        if(aktKeyList.isDownPressed()){
            super.setyMovement(5.0);
        } else if(!aktKeyList.isUpPressed()) {
            super.setyMovement(0.0);
        }
        
        if(aktKeyList.isRightPressed()){
            super.setxMovement(5.0);
        } else if (!aktKeyList.isLeftPressed()){
            super.setxMovement(0.0);
        }
    }

    public KeyGeber getGeber() {
        return geber;
    }
    
    
}
