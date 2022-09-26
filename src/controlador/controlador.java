/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author jvargas
 */
public class controlador implements ActionListener {
    
    private modelo modelo;
    private vista vista;
    
    public controlador (vista vista, modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnMostrar.addActionListener(this);
    }
    
    public void iniciarVista(){
        vista.setTitle("Parseo de parametros");
        vista.setLocationRelativeTo(null);
        modelo.setNombre( String.valueOf(vista.txtNombre.getText()) );
        modelo.setApellido( String.valueOf(vista.txtApellido.getText()) );
        modelo.setEdad( String.valueOf(vista.txtEdad.getText()) );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
