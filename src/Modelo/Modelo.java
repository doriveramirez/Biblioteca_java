package Modelo;

import Modelo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Modelo {
    Conexion conexion = null;
    private int controlador = 0;
    public Modelo(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public void ejecutarConsulta(String sql){
        conexion.abrirConexion();
        try {
            Statement sentencia = conexion.getConn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conexion.setResultadosDevueltos(sentencia.executeQuery(sql));
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }

    public int ejecutarSqlActualizacion(String sql) {
        int i;
        try {
            Statement sentencia = conexion.getConn().createStatement();
            i = sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            i = 0;
        }
        return i;
    }
    
    public void btnAltasBotonesClick(String txt1, String txt2, String txt3, String txt4, String txt5, String txt6, String txt7) {
        ejecutarConsulta("SET FOREIGN_KEY_CHECKS = 1;");
        String sql = "";
        String error = "";
        if (controlador == 0){
            sql = "insert into personas values ('" + txt1 + "', " + txt2 + ",'" + txt3 + "', '" + txt4 + "', '" + txt5 + "', '" + txt6 + "', " + txt7 + ")";
            error = "El campo DNI no puede estar vacío o repetido  / Puede que el Código Préstamo no exista";
        }
        if (controlador == 1){
            sql = "insert into prestamos values (" + txt1 + ", '" + txt2 + "','" + txt3 + "', " + txt4 + ", '" + txt5 + "')";
            error = "El campo Código Préstamo no puede estar vacío o repetido / Puede que el Código Volumen o DNI no exista/n";
        }
        if (controlador == 2){
           sql = "insert into autor values (" + txt1 + ", '" + txt2 + "')";
           error = "El campo Código Autor no puede estar vacío o repetido";
        }
        if (controlador == 3){
            sql = "insert into volumenes values (" + txt1 + ", " + txt2 + ",'" + txt3 + "')";
            error = "El campo Código Volumen no puede estar vacío o repetido / Puede que el ISBN no exista";
        }
        if (controlador == 4){
            sql = "insert into libros values ('" + txt1 + "', '" + txt2 + "','" + txt3 + "', year('" + txt4 + "'), " + txt5 + ")";
            error = "El campo ISBN no puede estar vacío o repetido  / Puede que el Código Autor no exista";
        }
        System.out.println(sql);
        if (ejecutarSqlActualizacion(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Alta añadida correctamente");
        } else {
            JOptionPane.showMessageDialog(null, error);
        }
    }                                     

    public void btnBajasActionPerformed(String txt1) {  
        String error = "";
        ejecutarConsulta("SET FOREIGN_KEY_CHECKS = 0;");
     String sql = "";
        if (controlador == 0){
            sql = "delete from personas where dni='" + txt1 + "';";
            error = "El campo DNI no puede estar vacío o inexistente / Puede que el Código Préstamo no exista";
        }
        if (controlador == 1){
            sql = "delete from prestamos where codigoPrestamo=" + txt1 + ";";
            error = "El campo Código Préstamo no puede estar vacío o inexistente / Puede que el Código Volumen o DNI no exista/n";
        }
        if (controlador == 2){
            sql = "delete from autor where codigoAutor=" + txt1 + ";";
            error = "El campo Código Autor no puede estar vacío o inexistente.";
        }
        if (controlador == 3){
            sql = "delete from volumenes where codigoVolumen=" + txt1 + ";";
            error = "El campo Código Volumen no puede estar vacío o inexistente / Puede que el ISBN no exista";
        }
        if (controlador == 4){
            sql = "delete from libros where isbn='" + txt1 + "';";
            error = "El campo ISBN no puede estar vacío o inexistente / Puede que el Código Autor no exista";
        }
     if (ejecutarSqlActualizacion(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Baja realizada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, error);
        }
    }                                        

    public void btnModificacionesActionPerformed(String txt1, String txt2, String txt3, String txt4, String txt5, String txt6, String txt7) {        
        String error = "";
        ejecutarConsulta("SET FOREIGN_KEY_CHECKS = 1;");
        String sql = "";
        if (controlador == 0){
            sql = "update personas set codigoSocio=" + txt2 + ", nombre='" + txt3 + "', apellidos='" + txt4 + "', telefono='" + txt5 + "', direccion='" + txt6 + "', codigoPrestamo=" + txt7
            + " where dni='" + txt1 + "';";
            error = "El campo DNI no puede estar vacío o inexistente / Puede que el Código Préstamo no exista";
        }
        if (controlador == 1){
            sql = "update prestamos set fechaPrestamo='" + txt2 + "', fecha='" + txt3 + "', codigoVolumen=" + txt4 + ", dni='" + txt5 + "' where codigoPrestamo=" + txt1 + ";";
            error = "El campo Código Préstamo no puede estar vacío o inexistente / Puede que el Código Volumen o DNI no exista/n";
        }
        if (controlador == 2){
            sql = "update autor set nombre='" + txt2 + "' where codigoAutor=" + txt1 + ";";
            error = "El campo Código Autor no puede estar vacío o inexistente.";
        }
        if (controlador == 3){
            sql = "update volumenes set deterioro=" + txt2  + " where codigoVolumen=" + txt1 + ";";
            error = "El campo Código Volumen no puede estar vacío o inexistente / Puede que el ISBN no exista";
        }
        if (controlador == 4){
            sql = "update libros set titulo='" + txt2 + "', editorial='" + txt3 + "', anoPublicacion=year('" + txt4 + "'), codigoAutor=" + txt5 + " where isbn='" + txt1 + "';";
            error = "El campo ISBN no puede estar vacío o inexistente / Puede que el Código Autor no exista";
        }
        if (ejecutarSqlActualizacion(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Modificación realizada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
    public void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {  
        System.exit(0);
    }   
    
    public void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {
        controlador = 0;
    }   
    
    public void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {                                      
        controlador = 1;
    }   
    
    public void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {                                         
        controlador = 2;
    }   
    
    public void btnVolumenesActionPerformed(java.awt.event.ActionEvent evt) {                                         
        controlador = 3;
    }   
    
    public void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {                                         
        controlador = 4;
    }   

    public int getControlador() {
        return controlador;
    }

}
