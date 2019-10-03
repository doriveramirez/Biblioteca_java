package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection conn = null;
    private ResultSet resultadosDevueltos = null;

    public void abrirConexion() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String sUrl = "jdbc:mysql://localhost:3306/biblioteca?serverTimezone=UTC";
            conn = (Connection) DriverManager.getConnection(sUrl, "root", "elrincon1920");
        } catch (SQLException ex) {
            conn = null;
            throw new RuntimeException("Error con la conexión!!!");
        }
    }

    public void ejecutarConsulta(String sql) {
        try {

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultadosDevueltos = stmt.executeQuery(sql);

        } catch (SQLException ex) {
        }
    }

    public int Ejecutar_Sql_Actualizacion(String sql) {
        int i;
        try {
            Statement stmt = conn.createStatement();
            JOptionPane.showMessageDialog(null, sql);
            i = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            i = 0;
        }
        return i;
    }

    public Connection getConn() {
        return conn;
    }

    public ResultSet getResultadosDevueltos() {
        return resultadosDevueltos;
    }

    public void setResultadosDevueltos(ResultSet resultadosDevueltos) {
        this.resultadosDevueltos = resultadosDevueltos;
    }

}
