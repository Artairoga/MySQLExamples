/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.SQLException;

/**
 *
 * @author artairg
 */
public class EjemploConControlador {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            //Abrir conexion
            Controlador.Conexion.CrearBD();
            //ejecutar consulta
            Controlador.Consultas.SumarSueldo();
            //Cerrar conexion
            Controlador.Conexion.CerrarBD();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        
    }
   
}
