/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondapplication;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Naveen
 */
public class MainFrame extends JFrame {

    public void init() {
        setTitle("Hello Main");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MainFrame mainFrame = new MainFrame();
        mainFrame.init();
    }
    
}
