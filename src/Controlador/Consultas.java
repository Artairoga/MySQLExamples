/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.sql.*;
import Controlador.*;
/**
 *
 * @author artairg
 */
public class Consultas {
    public static void VerEmpleados() throws SQLException{
        String consulta="SELECT * FROM empleados";
        Statement statement=Conexion.getBD().createStatement();
        ResultSet SetResultados=statement.executeQuery(consulta);
        while(SetResultados.next()){
                System.out.println("Empleado nº "+SetResultados.getString(1)+"---"+SetResultados.getString(2)+"---"+"(Jefe: "+SetResultados.getString(3)+")");
        }
    }
    public static void SumarSueldo() throws SQLException{
        String consulta="UPDATE empleados SET salario=salario+1";
        Statement statement=Conexion.getBD().createStatement();
        System.out.println("Numero de registros mod: "+statement.executeUpdate(consulta));
    }
}
