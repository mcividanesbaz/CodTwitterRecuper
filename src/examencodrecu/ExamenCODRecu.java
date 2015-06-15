/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencodrecu;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author Marcos
 */
public class ExamenCODRecu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
/*
        variables 
        */
      String busqueda;
        String tweet;
        int opcion;
        
        
        
        MetodosTwitter obj = new MetodosTwitter();
        /*
        menu para elegir la opcion que quieres
        */
         do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("opciones: \n1 --> TimeLine\n2 --> Buscar\n3 --> Tweettear\n4 --> Exit"));
            switch (opcion) {
                case 1:
                    obj.verLineaTiempo();
                    break;
                case 2:
                    busqueda = JOptionPane.showInputDialog("Introduzca lo que desee buscar");
                    obj.buscarTuit(busqueda);
                    break;
                case 3:
                    tweet = JOptionPane.showInputDialog("Introduzca lo que desee twittear");
                    obj.twittear(tweet);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        } while (opcion != 0 && opcion != 4);
    }
        
        
    }
    

