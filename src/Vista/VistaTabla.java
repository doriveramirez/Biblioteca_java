package Vista;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class VistaTabla extends AbstractTableModel {

    ResultSet resultadosDevueltos;
    ResultSetMetaData metaDatos; //contiene información sobre la estructura de un ResulSet,especialmente sobre sus nom campos
    int numColumnas;
    int numFilas;

    public VistaTabla(ResultSet resultadosDevueltosAux) {
        resultadosDevueltos = resultadosDevueltosAux;
        try {
            metaDatos = resultadosDevueltosAux.getMetaData();
            resultadosDevueltos.last();
            numFilas = resultadosDevueltos.getRow();
            numColumnas = metaDatos.getColumnCount();
        } catch (SQLException ex) {
        }
    }

    public int getRowCount() {
        return numFilas;

    }

    public int getColumnCount() {
        return numColumnas;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            resultadosDevueltos.absolute(rowIndex + 1);
            Object objeto = resultadosDevueltos.getObject(columnIndex + 1);
            return objeto;
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

}
