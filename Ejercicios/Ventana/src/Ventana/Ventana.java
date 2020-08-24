/*
 * Creación de ventanas en Java
 */
package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
      //this.setBounds(600, 600, 500, 500);                       //Establecemos la posición inicial y el tamaño de la ventana.
        this.setLocationRelativeTo(null);                           //Establecemos la ventana en el centro de la pantalla
        
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
      //colocarRadioBotones();
        colocarCajasTexto();
      //colocarAreaTexto();
    }
    
    private void colocarPaneles(){
        
        panel = new JPanel();                                       //Creación de un panel.
      //panel.setBackground(Color.GRAY);                            //Establecemos el color del panel.
        panel.setLayout(null);                                      //Desactivamos el Layout del panel.
        this.getContentPane().add(panel);                           //Agregamos el panel a la ventana.
        
      
    }
    
    private void colocarEtiquetas(){
        
       //JLabel etiqueta = new JLabel("Bienvenidos a CRISTOBOOK",SwingConstants.CENTER);        //Creamos una etiqueta.
       //JLabel etiqueta = new JLabel();                  //Creamos una etiqueta.
        /*  ETIQUETA TIPO TEXT
        
        etiqueta.setText("Bienvenidos a CRISTOBOOK");               //Establecemos el texto de le etiqueta.
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);     //Establecemos la posicion horizontal del texto.
        etiqueta.setBounds(260, 250, 300, 200);                     //Establecemos la posición inicial y el tamaño de la etiqueta.
        etiqueta.setForeground( Color.LIGHT_GRAY);                  //Cambiamos el color de la letra.
        etiqueta.setOpaque(true);                                   //Nos deja pintar la etiqueta.
        etiqueta.setBackground(Color.BLACK);                        //Cambiamos el color de fondo de la etiqueta.
        etiqueta.setFont(new Font("Comic Sans",3, 15));             //Establecemos la fuente de la etiqueta.(Creamos en su interior un objeto de tipo Font)
       */ 
        
       /*  ETIQUETA TIPO IMAGEN */
       
      /*etiqueta.setText("Bayer 8 - 2 Barça");                       //Establecemos el texto de le etiqueta.
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);      //Establecemos la posicion horizontal del texto.
        etiqueta.setBounds(100, 20, 500, 100);                       //Establecemos la posición inicial y el tamaño de la etiqueta.
        etiqueta.setForeground( Color.BLACK);                        //Cambiamos el color de la letra.
      //etiqueta.setOpaque(true);                                    //Nos deja pintar la etiqueta.
      //etiqueta.setBackground(Color.BLACK);                         //Cambiamos el color de fondo de la etiqueta.
        etiqueta.setFont(new Font("impact",0,40));                   //Establecemos la fuente de la etiqueta.(Creamos en su interior un objeto de tipo Font)
        
        panel.add(etiqueta);                                         //Agregamos la etiqueta al panel.
      */
        /*  ETIQUETA TIPO IMAGEN */
        
      /*ImageIcon imagen = new ImageIcon("humillacion.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(100, 100, 490,200);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(490, 200, Image.SCALE_SMOOTH)));
        
        panel.add(etiqueta2);                                       //Agregamos la etiqueta2 al panel.
       */ 
      
      JLabel etiqueta = new JLabel("Ingresa tu nombre");
      etiqueta.setBounds(30, 10, 200, 30);
      etiqueta.setFont(new Font("cooper black",1,18));
      panel.add(etiqueta);
     
      
    }
    
    private void colocarCajasTexto(){
     /* JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setText("Nombre: ");
        System.out.println("Texto en la caja: " +cajaTexto.getText());
        
        panel.add(cajaTexto);
    }
    
    private void colocarAreaTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Escriba aquí su texto: ");
        areaTexto.append("\nNombre: ");                             //Este método añade más texto.(no reemplaza).
        areaTexto.setEditable(true);                                //Editar el área de texto.
        
        
        panel.add(areaTexto);
      */
     
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 30);
        
        
        
        panel.add(cajaTexto);
        
        
    }
    
    private void colocarBotones(){
        
        /* BOTÓN TEXTO. */
      /*JButton boton1 = new JButton();                             //Creamos un botón.
        boton1.setText("Enviar");                                   //Establecemos un texto en el botón.
        boton1.setBounds(100, 100, 100, 40);                        //Establecemos la posición inicial y el tamaño de la etiqueta.
        boton1.setEnabled(true);                                    //Habilitar y deshabilitar la interacción del botón.
        boton1.setMnemonic('a');                                    //Establecemos alt + letra para hacer click en el botón
        panel.add(boton1); 
        
        boton1.setForeground(Color.BLACK);                        //Cambiamos el color de la letra.
        boton1.setFont(new Font("cooper black",3,16));            //Establecemos la fuente de la etiqueta.(Creamos en su interior un objeto de tipo Font)
       */ 
        /* BOTÓN IMAGEN */
        
     /* JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
      //boton2.setBackground(Color.BLUE);
        ImageIcon jugar = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(jugar.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(boton2);
     */
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
    
    private void colocarRadioBotones(){
        
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 100, 50);
        radioBoton1.setEnabled(true);
        panel.add(radioBoton1);
            
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        
    }
    

    
}
