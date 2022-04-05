/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.sql.*;  
/**
 *
 * @author artairg
 */
public class EjemploSimple {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con;
        Statement sentencia;
        ResultSet rs;
        String sql;
        String url="jdbc:mysql://192.168.56.101:3306/ejemplo";
        String username="root";
        String password="root";
        
        try {
            //Abrir conexion
            con=DriverManager.getConnection(url, username, password);
            if(con !=null){
                System.out.println("Conexione establecida correctamente");
            }else{
                System.out.println("La conexion a fallado no se abrio correctamente");
            }
            //Sentencia
            sql="Select empleados.emp_no, empleados.apellido, IFNULL(emp2.apellido,'No tiene Jefe') as jefes "
                    + "FROM empleados LEFT OUTER JOIN empleados as emp2 "
                    + "ON(empleados.dir=emp2.emp_no) "
                    + "ORDER BY empleados.emp_no;";
            sentencia=con.createStatement();
            rs=sentencia.executeQuery(sql);
            //Ejecucion
            System.out.println("Lista de empleados");
            
            while(rs.next()){
                System.out.println("Empleado nº "+rs.getString(1)+"---"+rs.getString(2)+"---"+"(Jefe: "+rs.getString(3)+")");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        
    }
   
}
