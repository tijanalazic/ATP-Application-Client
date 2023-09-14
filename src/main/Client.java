/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.Communication;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import form.FrmLogin;

/**
 *
 * @author DELL
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Communication.getInstance();
        new FrmLogin().setVisible(true);
    }

    
}
