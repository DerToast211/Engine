/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry_input;

import java.awt.event.KeyEvent;
import java.util.HashMap;

/**
 *
 * Gibt immer an, welche Tasten aktuell gedrückt sind
 *
 * @author Toast
 */
public class KeysPressed {
    
    private HashMap<Integer, Boolean> keys;
    
    public KeysPressed() {
        
        keys = new HashMap();
        
    }
    
    public void addKey(int i) {
        if (!keys.containsKey(i)) {
            keys.put(i, false);
        }
    }
    
    public void removeKey(int i) {
        keys.remove(i);
    }
    
    public boolean keyPressed(int i) {
        return keys.get(i);
    }
    
    public void pressKey(int i) {
        if (keys.containsKey(i)) {
            keys.put(i, true);
        }
    }
    
    public void releaseKey(int i) {
        if (keys.containsKey(i)) {
            keys.put(i, false);
        }
    }
    
    public boolean containsKey(int i){
        return keys.containsKey(i);
    }
    
}
