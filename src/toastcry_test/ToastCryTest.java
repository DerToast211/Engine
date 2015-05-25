/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry_test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import toastcry.*;
import toastcry_input.KeysPressed;

/**
 * Dient nur zum Testen der Engine, also alles hierdrin gehört nicht dazu
 * @author Toast
 */
public class ToastCryTest {

    private static ToastCry toastcry; //Die Engine
    private static JFrame Fenster; // Das Fenster
    private static Toast player; //Spieler 1

    /**
     * Nachdem initialisiert wurde wird die Engine die ganze Zeit geupdatet
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        ToastCryTest.FensterErzeugen();
        player = new Toast(400-15, 300-15, 30, 30, Color.GREEN);
        Toast player2 = new Toast(200, 100, 40, 3, Color.RED);
        toastcry.addToast(player);
        toastcry.addToast(player2);
        player.setPlayer(KeyEvent.VK_W, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_D);
        player2.setPlayer(KeyEvent.VK_UP, KeyEvent.VK_LEFT, KeyEvent.VK_DOWN, KeyEvent.VK_RIGHT);
        //player.addMovement(new SlowdownMovement(player, 0.5));
        
        
        while(true){
            toastcry.update();
        }

    }
    
    public static void FensterErzeugen() throws InterruptedException{
        Fenster = new JFrame();
        Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Fenster.setLayout(new BorderLayout());
        //Fenster.setSize(800, 600);
        

        toastcry = new ToastCry();
        
        Fenster.add(toastcry);
        
        //Fenster.setResizable(false);
        
        
        //Fenster.add(new JPanel(new FlowLayout()), BorderLayout.SOUTH);

        Fenster.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 -400, Toolkit.getDefaultToolkit().getScreenSize().height / 2 -300);
        
        
        //Fenster.pack(); 
        
        //Eigentlich sollte pack() verwendet werden, da dann das Fenster so angepasst werden sollte, dass alle Komponenten perfekt reinpassen
        //Das passiert aber nicht, das Fenster ist nachher immer ganz klein, und ich hab keine Ahnung woran das liegt
        Fenster.setSize(800, 600);
        
        
        Fenster.setVisible(true);
        toastcry.requestFocusInWindow(); //Die Engine braucht den Tastaturfokus, damit KeyListener auf ihr funktionieren
        toastcry.requestFocus();
    }

}
