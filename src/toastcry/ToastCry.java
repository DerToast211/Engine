/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toastcry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;
import toastcry_input.KeyEinleser;
import toastcry_input.KeysPressed;

/**
 * Die Engine (Namen können wir noch ändern ^^) Lässt sich einem Fenster
 * hinzufügen
 *
 * @author Toast
 */
public class ToastCry extends JLabel {

    private ArrayList<Toast> toasts; //Alle aktuellen Toast-Objekte, welche der Engine hinzugefügt wurden
    
    public final int XSIZE;
    public final int YSIZE;
    
    private KeysPressed aktKeysPressed;
    

    public ToastCry() {
        super();
        
        toasts = new ArrayList();
        
        aktKeysPressed = new KeysPressed();
        this.addKeyListener(new KeyEinleser(aktKeysPressed));
        //this.setSize(800, 600);

        //Egal was man probiert um die Hröße festzulegen, die Methode pack() verkleinert das Fenster später trotzdem auf ein ganz kleines Fenster
        XSIZE = 800;
        YSIZE = 600;
        super.setSize(800, 600);
        super.setMinimumSize(new Dimension(800, 600));

        this.setBackground(Color.BLACK);
        this.setOpaque(true); //Damit Hintergrund auch angezeigt wird
    }

    /**
     * Versetzt die Engine in den nächsten Frame Updatet alle Toasts und
     * repaintet, warten dann 15 millisekunden
     *
     * @throws InterruptedException
     */
    public void update() throws InterruptedException {

        for (Toast t : toasts) {
            t.update();
        }

        this.repaint();

        Thread.sleep(15);

    }

    //
    /**
     * Fügt einen Toast hinzu
     *
     * @param t
     */
    public void addToast(Toast t) {
        toasts.add(t);
        t.setWelt(this);
    }

    //Beschreibt was bei repaint getan wird 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Toast t : toasts) {
            g.setColor(t.getFarbe());
            g.fillRect(t.getGrafik().x, t.getGrafik().y, t.getGrafik().width, t.getGrafik().height);

        }
    }

    public KeysPressed getAktKeysPressed() {
        return aktKeysPressed;
    }
    
    

}
