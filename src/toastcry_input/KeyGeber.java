/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry_input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Dient als KeyListener und erzeugt jeden Frame KeyLists, welche die aktuelle Tastendrückung enthalten
 * @author Toast
 */
public class KeyGeber implements KeyListener {

    public static final int KEY_ANZAHL = 4;
    private KeyList aktKeyList;
    
    private int upKey;
    private int leftKey;
    private int downKey;
    private int rightKey;
    
    public KeyGeber(int upKey, int leftKey, int downKey, int rightKey ){
        aktKeyList = new KeyList();
        
        this.upKey = upKey;
        this.leftKey = leftKey;
        this.downKey = downKey;
        this.rightKey = rightKey;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == upKey) {
            aktKeyList.setUpPressed(true);
        }
        if (e.getKeyCode() == leftKey) {
            aktKeyList.setLeftPressed(true);
        }
        if (e.getKeyCode() == downKey) {
            aktKeyList.setDownPressed(true);
        }
        if (e.getKeyCode() == rightKey) {
            aktKeyList.setRightPressed(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == upKey) {
            aktKeyList.setUpPressed(false);
        }
        if (e.getKeyCode() == leftKey) {
            aktKeyList.setLeftPressed(false);
        }
        if (e.getKeyCode() == downKey) {
            aktKeyList.setDownPressed(false);
        }
        if (e.getKeyCode() == rightKey) {
            aktKeyList.setRightPressed(false);
        }
    }

    public KeyList getAktKeyList() {
        return aktKeyList;
    }
    
    

}
