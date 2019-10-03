package Controlador;

import Modelo.Conexion;
import Modelo.Modelo;
import Vista.VistaPrincipal;
import Vista.VistaTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class Controlador {

    VistaPrincipal vista = null;
    Modelo modelo = null;
    Conexion conexion = null;
    VistaTabla tabla = null;

    public Controlador() {
        this.conexion = new Conexion();
        conexion.abrirConexion();
        conexion.ejecutarConsulta("select * from personas");
        this.tabla = new VistaTabla(conexion.getResultadosDevueltos());
        this.vista = new VistaPrincipal();
        this.modelo = new Modelo(conexion);
        vista.getTxtLabel1().setText("DNI");
        vista.getTxtLabel2().setText("Código Socio");
        vista.getTxtLabel3().setText("Nombre");
        vista.getTxtLabel4().setText("Apellidos");
        vista.getTxtLabel5().setText("Teléfono");
        vista.getTxtLabel6().setText("Dirección");
        vista.getTxtLabel7().setText("Código Préstamo");
        vista.getTablaAlumnos().setModel(tabla);
        vista.setVisible(true);
        vista.getBtnAltas().addActionListener(new ControladorAlta());
        vista.getBtnBajas().addActionListener(new ControladorBaja());
        vista.getBtnModificaciones().addActionListener(new ControladorModificaciones());
        vista.getBtnSalir().addActionListener(new ControladorCierre());
        vista.getBtnTablaPersonas().addActionListener(new ControladorPersonas());
        vista.getBtnTablaPrestamos().addActionListener(new ControladorPrestamos());
        vista.getBtnTablaAutores().addActionListener(new ControladorAutores());
        vista.getBtnTablaVolumenes().addActionListener(new ControladorVolumenes());
        vista.getBtnTablaLibros().addActionListener(new ControladorLibros());
        vista.getTablaAlumnos().addMouseListener(new ControladorTabla());
    }

    private class ControladorBaja implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            modelo.btnBajasActionPerformed(vista.getTxt1().getText());
            actualizar();
        }
    };

    private class ControladorModificaciones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (modelo.getControlador() == 0) {
                modelo.btnModificacionesActionPerformed(vista.getTxt1().getText(), vista.getTxt2().getText(), vista.getTxt3().getText(), vista.getTxt4().getText(), vista.getTxt5().getText(), vista.getTxt6().getText(), vista.getTxt7().getText());
            }
            if (modelo.getControlador() == 1) {
                modelo.btnModificacionesActionPerformed(vista.getTxt1().getText(), vista.getTxt2().getText(), vista.getTxt3().getText(), vista.getTxt4().getText(), vista.getTxt5().getText(), "", "");
            }
            if (modelo.getControlador() == 2) {
                modelo.btnModificacionesActionPerformed(vista.getTxt1().getText(), vista.getTxt2().getText(), "", "", "", "", "");
            }
            if (modelo.getControlador() == 3) {
                modelo.btnModificacionesActionPerformed(vista.getTxt1().getText(), deterioro(), vista.getTxt3().getText(), "", "", "", "");
            }
            if (modelo.getControlador() == 4) {
                modelo.btnModificacionesActionPerformed(vista.getTxt1().getText(), vista.getTxt2().getText(), vista.getTxt3().getText(), vista.getTxt4().getText(), vista.getTxt5().getText(), "", "");
            }
            actualizar();
        }
    };

    private class ControladorTabla extends MouseAdapter {

        public void mouseClicked(java.awt.event.MouseEvent e) {
            Mostrar_datos(vista.getTablaAlumnos().getSelectedRow());
        }
    };

    private class ControladorAlta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (modelo.getControlador() == 0) {
                modelo.btnAltasBotonesClick(vista.getTxt1().getText(), vista.getTxt2().getText(), vista.getTxt3().getText(), vista.getTxt4().getText(), vista.getTxt5().getText(), vista.getTxt6().getText(), vista.getTxt7().getText());
            }
            if (modelo.getControlador() == 1) {
                modelo.btnAltasBotonesClick(vista.getTxt1().getText(), vista.getTxt2().getText(), vista.getTxt3().getText(), vista.getTxt4().getText(), vista.getTxt5().getText(), "", "");
            }
            if (modelo.getControlador() == 2) {
                modelo.btnAltasBotonesClick(vista.getTxt1().getText(), vista.getTxt2().getText(), "", "", "", "", "");
            }
            if (modelo.getControlador() == 3) {
                modelo.btnAltasBotonesClick(vista.getTxt1().getText(), deterioro(), vista.getTxt3().getText(), "", "", "", "");
            }
            if (modelo.getControlador() == 4) {
                modelo.btnAltasBotonesClick(vista.getTxt1().getText(), vista.getTxt2().getText(), vista.getTxt3().getText(), vista.getTxt4().getText(), vista.getTxt5().getText(), "", "");
            }
            actualizar();
        }
    };

    private class ControladorCierre implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            modelo.btnSalirActionPerformed(arg0);
        }
    };

    private class ControladorPersonas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            resetVistas();
            vista.getTxtLabel1().setText("DNI");
            vista.getTxtLabel2().setText("Código Socio");
            vista.getTxtLabel3().setText("Nombre");
            vista.getTxtLabel4().setText("Apellidos");
            vista.getTxtLabel5().setText("Teléfono");
            vista.getTxtLabel6().setText("Dirección");
            vista.getTxtLabel7().setText("Código Préstamo");
            vista.getDeterioro().setVisible(false);
            vista.getTxt2().setVisible(true);
            vista.getTxt3().setVisible(true);
            vista.getTxt4().setVisible(true);
            vista.getTxt5().setVisible(true);
            vista.getTxt6().setVisible(true);
            vista.getTxt7().setVisible(true);
            vista.getImagenLabel().setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios.png")));
            conexion.ejecutarConsulta("select * from personas");
            tabla = new VistaTabla(conexion.getResultadosDevueltos());
            vista.getTablaAlumnos().setModel(tabla);
            modelo.btnPersonasActionPerformed(arg0);
        }
    };

    private class ControladorPrestamos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            resetVistas();
            vista.getTxtLabel1().setText("Código Préstamo");
            vista.getTxtLabel2().setText("Fecha Préstamo");
            vista.getTxtLabel3().setText("Fecha tope");
            vista.getTxtLabel4().setText("Código Volumen");
            vista.getTxtLabel5().setText("DNI");
            vista.getTxtLabel6().setText("");
            vista.getTxtLabel7().setText("");
            vista.getDeterioro().setVisible(false);
            vista.getTxt2().setVisible(true);
            vista.getTxt3().setVisible(true);
            vista.getTxt4().setVisible(true);
            vista.getTxt5().setVisible(true);
            vista.getTxt6().setVisible(false);
            vista.getTxt7().setVisible(false);
            vista.getImagenLabel().setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Prestamos.png")));
            conexion.ejecutarConsulta("select * from prestamos");
            tabla = new VistaTabla(conexion.getResultadosDevueltos());
            vista.getTablaAlumnos().setModel(tabla);
            modelo.btnPrestamosActionPerformed(arg0);
        }
    };

    private class ControladorAutores implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            resetVistas();
            vista.getTxtLabel1().setText("Código Autor");
            vista.getTxtLabel2().setText("Nombre");
            vista.getTxtLabel3().setText("");
            vista.getTxtLabel4().setText("");
            vista.getTxtLabel5().setText("");
            vista.getTxtLabel6().setText("");
            vista.getTxtLabel7().setText("");
            vista.getDeterioro().setVisible(false);
            vista.getTxt2().setVisible(true);
            vista.getTxt3().setVisible(false);
            vista.getTxt4().setVisible(false);
            vista.getTxt5().setVisible(false);
            vista.getTxt6().setVisible(false);
            vista.getTxt7().setVisible(false);
            vista.getImagenLabel().setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Autores.png")));
            conexion.ejecutarConsulta("select * from autor");
            tabla = new VistaTabla(conexion.getResultadosDevueltos());
            vista.getTablaAlumnos().setModel(tabla);
            modelo.btnAutoresActionPerformed(arg0);
        }
    };

    private class ControladorVolumenes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            resetVistas();
            vista.getTxtLabel1().setText("Código Volumen");
            vista.getTxtLabel2().setText("Deterioro");
            vista.getDeterioro().setSelectedItem("No");
            vista.getTxtLabel3().setText("ISBN");
            vista.getTxtLabel4().setText("");
            vista.getTxtLabel5().setText("");
            vista.getTxtLabel6().setText("");
            vista.getTxtLabel7().setText("");
            vista.getDeterioro().setVisible(true);
            vista.getTxt2().setVisible(false);
            vista.getTxt3().setVisible(true);
            vista.getTxt4().setVisible(false);
            vista.getTxt5().setVisible(false);
            vista.getTxt6().setVisible(false);
            vista.getTxt7().setVisible(false);
            vista.getImagenLabel().setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Volumenes.png")));
            conexion.ejecutarConsulta("select * from volumenes");
            tabla = new VistaTabla(conexion.getResultadosDevueltos());
            vista.getTablaAlumnos().setModel(tabla);
            modelo.btnVolumenesActionPerformed(arg0);
        }
    };

    private class ControladorLibros implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            resetVistas();
            vista.getTxtLabel1().setText("ISBN");
            vista.getTxtLabel2().setText("Título");
            vista.getTxtLabel3().setText("Editorial");
            vista.getTxtLabel4().setText("Año Publicación");
            vista.getTxtLabel5().setText("Código Autor");
            vista.getTxtLabel6().setText("");
            vista.getTxtLabel7().setText("");
            vista.getDeterioro().setVisible(false);
            vista.getTxt2().setVisible(true);
            vista.getTxt3().setVisible(true);
            vista.getTxt4().setVisible(true);
            vista.getTxt5().setVisible(true);
            vista.getTxt6().setVisible(false);
            vista.getTxt7().setVisible(false);
            vista.getImagenLabel().setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Libros.png")));
            conexion.ejecutarConsulta("select * from libros");
            tabla = new VistaTabla(conexion.getResultadosDevueltos());
            vista.getTablaAlumnos().setModel(tabla);
            modelo.btnLibrosActionPerformed(arg0);
        }
    };

    public void Mostrar_datos(int fila) {
        if (modelo.getControlador() == 0) {
            vista.getTxt1().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 0)));
            vista.getTxt2().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 1)));
            vista.getTxt3().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 2)));
            vista.getTxt4().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 3)));
            vista.getTxt5().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 4)));
            vista.getTxt6().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 5)));
            vista.getTxt7().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 6)));
        }
        if (modelo.getControlador() == 1) {
            vista.getTxt1().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 0)));
            vista.getTxt2().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 1)));
            vista.getTxt3().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 2)));
            vista.getTxt4().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 3)));
            vista.getTxt5().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 4)));
            vista.getTxt6().setText("");
            vista.getTxt7().setText("");
        }
        if (modelo.getControlador() == 2) {
            vista.getTxt1().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 0)));
            vista.getTxt2().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 1)));
            vista.getTxt3().setText("");
            vista.getTxt4().setText("");
            vista.getTxt5().setText("");
            vista.getTxt6().setText("");
            vista.getTxt7().setText("");
        }
        if (modelo.getControlador() == 3) {
            vista.getTxt1().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 0)));
            if (String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 1)) == "true") {
                vista.getDeterioro().setSelectedItem("Sí");
            } else {
                vista.getDeterioro().setSelectedItem("No");
            }
            vista.getTxt3().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 2)));
            vista.getTxt4().setText("");
            vista.getTxt5().setText("");
            vista.getTxt6().setText("");
            vista.getTxt7().setText("");
        }
        if (modelo.getControlador() == 4) {
            vista.getTxt1().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 0)));
            vista.getTxt2().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 1)));
            vista.getTxt3().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 2)));
            vista.getTxt4().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 3)));
            vista.getTxt5().setText(String.valueOf(vista.getTablaAlumnos().getValueAt(fila, 4)));
            vista.getTxt6().setText("");
            vista.getTxt7().setText("");
        }
    }

    private void resetVistas() {
        vista.getTxt1().setText("");
        vista.getTxt2().setText("");
        vista.getTxt3().setText("");
        vista.getTxt4().setText("");
        vista.getTxt5().setText("");
        vista.getTxt6().setText("");
        vista.getTxt7().setText("");
    }

    private String deterioro() {
        if (vista.getDeterioro().getSelectedItem() == "Sí") {
            return "true";
        } else {
            return "false";
        }
    }

    private void actualizar() {
        if (modelo.getControlador() == 0) {
            conexion.ejecutarConsulta("select * from personas");
        }
        if (modelo.getControlador() == 1) {
            conexion.ejecutarConsulta("select * from prestamos");
        }
        if (modelo.getControlador() == 2) {
            conexion.ejecutarConsulta("select * from autor");
        }
        if (modelo.getControlador() == 3) {
            conexion.ejecutarConsulta("select * from volumenes");
        }
        if (modelo.getControlador() == 4) {
            conexion.ejecutarConsulta("select * from libros");
        }
        tabla = new VistaTabla(conexion.getResultadosDevueltos());
        vista.getTablaAlumnos().setModel(tabla);
    }

}
