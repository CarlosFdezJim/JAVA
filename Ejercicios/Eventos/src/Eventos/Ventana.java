/*
 * Creación de ventanas en Java
 */
package Ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author Fernández
 */

public class Ventana extends JFrame{
    private JPanel panel;
    private JButton boton;
    private JTextField cajaTexto;
    private JLabel saludo;
    
    
    public Ventana(){

        this.setSize(500, 500);                                     //Establecemos el tamaño de la ventana. (Ancho, Alto)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);               //Cerramos la venta y termina el programa.
        this.setTitle("Eventos");                                //Ponemos un titulo a la ventana.
        this.setLocationRelativeTo(null);                           //Establecemos la ventana en el centro de la pantalla

        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarCajasTexto();
    }    
    private void colocarPaneles(){
        
        panel = new JPanel();                                       //Creación de un panel.
        panel.setLayout(null);                                      //Desactivamos el Layout del panel.
        this.getContentPane().add(panel);                           //Agregamos el panel a la ventana.
        
      
    }
    
    private void colocarEtiquetas(){
        
      JLabel etiqueta = new JLabel("Ingresa tu nombre");
      etiqueta.setBounds(30, 10, 200, 30);
      etiqueta.setFont(new Font("cooper black",1,18));
      panel.add(etiqueta);
      
    }
    
    private void colocarCajasTexto(){
     
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 30);
        
        cajaTexto.setText("Prueba");
        
        panel.add(cajaTexto);
        
    }
    
    private void colocarBotones(){
        
        boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150, 100, 150, 40);      
        boton.setFont(new Font("Arial", 0, 15));
        
        panel.add(boton); 
        
        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));

        panel.add(saludo);

        //Agregando Evento de tipo ActionListener.
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
            
        };
         
          boton.addActionListener(oyenteDeAccion); 
        
    }

}
