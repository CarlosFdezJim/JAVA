/*
 * Creación de ventanas en Java
 */

package Ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Fernández
 */

public class Ventana extends JFrame{
    private JPanel panel;
    private JButton boton;
    private JTextField cajaTexto;
    private JLabel saludo;
    private JTextArea areaTexto;
    private JComboBox listaDesplegable;
    
    public Ventana(){

        this.setSize(500, 500);                                     //Establecemos el tamaño de la ventana. (Ancho, Alto)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);               //Cerramos la venta y termina el programa.
        this.setTitle("Eventos");                                //Ponemos un titulo a la ventana.
        this.setLocationRelativeTo(null);                           //Establecemos la ventana en el centro de la pantalla

        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        
        colocarPaneles();
      //colocarAreaTexto();
      //colocarBotones();
      //colocarCajasTexto();
      //colocarEtiquetas();
        colocarListasDesplegables();
    } 
    
    private void colocarListasDesplegables(){
        String [] paises = {"España", "Francia", "Italia","Portugal"};
        
        listaDesplegable = new JComboBox(paises);
        listaDesplegable.setBounds(20, 20, 100, 30);
        
        listaDesplegable.addItem("Argentina");                  //Añadir objetos a tu lista desplegable.
        listaDesplegable.setSelectedItem("Francia");                  //Seleccionar el primer objeto visto.
        panel.add(listaDesplegable);
    }
    
    private void colocarPaneles(){
        
        panel = new JPanel();                                       //Creación de un panel.
        panel.setLayout(null);                                      //Desactivamos el Layout del panel.
        this.getContentPane().add(panel);                           //Agregamos el panel a la ventana.
      
    }
    
    private void colocarAreaTexto(){
        
        areaTexto = new JTextArea();
        areaTexto.setBounds(230, 30, 200, 300);
        panel.add(areaTexto);
        
    }
    
    private void colocarEtiquetas(){
        
      JLabel etiqueta = new JLabel("Ingresa tu nombre");
      etiqueta.setBounds(30, 10, 200, 30);
      etiqueta.setFont(new Font("cooper black",1,18));
      panel.add(etiqueta);
      
    }
    
    private void colocarCajasTexto(){
     
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 30, 150, 30);
        
        panel.add(cajaTexto);
        
        eventosDeTeclado();
        
    }
    
    private void eventosDeTeclado(){
        
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
              //areaTexto.append("keyTyped\n");                     //Funcia sólo con caracteres UNICODE
            }

            @Override
            public void keyPressed(KeyEvent e) {
              //areaTexto.append("KeyPress\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
              //areaTexto.append("keyReleased\n");
              if(e.getKeyChar()== 'p'){
                  areaTexto.append("Letra p\n");
              }
              if(e.getKeyChar() == '\n'){
                  areaTexto.append("ENTER\n");
              }
              if(e.getKeyChar() == ' '){
                  areaTexto.append("ESPACIO\n");
              }
              
            }
        };
        
        cajaTexto.addKeyListener(eventoTeclado);
        
    }
    
    private void colocarBotones(){
        
        boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150, 350, 150, 40);      
        boton.setFont(new Font("Arial", 0, 15));
        
        panel.add(boton); 
        
        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));

        panel.add(saludo);

      //eventoOyenteDeAccion();
      //eventoOyenteDeRaton();
    }
    
    private void eventoOyenteDeAccion(){
        
        //Agregando Evento de tipo ActionListener.
         ActionListener oyenteDeAccion = new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
            
        };
         
          boton.addActionListener(oyenteDeAccion); 
    }
    
    private void eventoOyenteDeRaton(){
        //Agregando Evento de tipo MouseListener.
        MouseListener oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("mouseClicked\n"); 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("mouseExited\n");
            }
        };
        
        boton.addMouseListener(oyenteRaton);
    }

}
