/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry_input;

/**
 * Im Array ist gespeichert, welche Tasten in diesem Frame gedrückt/nicht gedrückt wurden
 * @author Toast
 */
public class KeyList {
    
    Boolean[] pushMe;
    
    public KeyList(){
        
        pushMe = new Boolean[KeyGeber.KEY_ANZAHL];
        
        for(int i = 0; i<KeyGeber.KEY_ANZAHL; i++){
            pushMe[i] = false;
        }
    }
    
    public void setUpPressed(boolean up){
        pushMe[0] = up;
    }
    
    public void setLeftPressed(boolean left){
        pushMe[1] = left;
    }
    
    public void setDownPressed(boolean down){
        pushMe[2] = down;
    }
    
    public void setRightPressed(boolean right){
        pushMe[3] = right;
    }
    
    public boolean isUpPressed(){
        return pushMe[0];
    }
    
    public boolean isLeftPressed(){
        return pushMe[1];
    }
    
    public boolean isDownPressed(){
        return pushMe[2];
    }
    
    public boolean isRightPressed(){
        return pushMe[3];
    }
}
