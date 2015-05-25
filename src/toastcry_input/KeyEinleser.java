/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry_input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Dient zum Einlesen von der Tastatur
 * @author Toast
 */
public class KeyEinleser implements KeyListener {
    
    KeysPressed aktKeysPressed;
    
    public KeyEinleser(KeysPressed aktKeysPressed){
        
        this.aktKeysPressed = aktKeysPressed;
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        aktKeysPressed.pressKey(e.getExtendedKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        aktKeysPressed.releaseKey(e.getExtendedKeyCode());
    }

   
    
    
    
}
