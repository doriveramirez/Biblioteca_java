package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaPrincipal extends JFrame {

    public VistaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JButton btnAltas;
    private javax.swing.JButton btnBajas;
    private javax.swing.JButton btnModificaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablaPersonas;
    private javax.swing.JButton btnTablaPrestamos;
    private javax.swing.JButton btnTablaVolumenes;
    private javax.swing.JButton btnTablaLibros;
    private javax.swing.JButton btnTablaAutores;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane barraDesplazamiento;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JLabel txtLabel1;
    private javax.swing.JLabel txtLabel2;
    private javax.swing.JLabel txtLabel3;
    private javax.swing.JLabel txtLabel4;
    private javax.swing.JLabel txtLabel5;
    private javax.swing.JLabel txtLabel6;
    private javax.swing.JLabel txtLabel7;
    private javax.swing.JComboBox deterioro;

    private void initComponents() {

        barraDesplazamiento = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        datosPanel = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txtLabel1 = new javax.swing.JLabel();
        txtLabel2 = new javax.swing.JLabel();
        txtLabel3 = new javax.swing.JLabel();
        txtLabel4 = new javax.swing.JLabel();
        txtLabel5 = new javax.swing.JLabel();
        txtLabel6 = new javax.swing.JLabel();
        txtLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAltas = new javax.swing.JButton();
        btnBajas = new javax.swing.JButton();
        btnModificaciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnTablaPersonas = new javax.swing.JButton();
        btnTablaPrestamos = new javax.swing.JButton();
        btnTablaVolumenes = new javax.swing.JButton();
        btnTablaLibros = new javax.swing.JButton();
        btnTablaAutores = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();
        deterioro = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));

        barraDesplazamiento.setViewportView(TablaAlumnos);

        btnAltas.setText("Altas");
        btnAltas.setMaximumSize(new java.awt.Dimension(90, 25));
        btnAltas.setMinimumSize(new java.awt.Dimension(90, 25));
        btnAltas.setPreferredSize(new java.awt.Dimension(99, 25));

        btnBajas.setText("Bajas");
        btnBajas.setMinimumSize(new java.awt.Dimension(90, 25));
        btnBajas.setPreferredSize(new java.awt.Dimension(70, 25));

        btnModificaciones.setText("Modificar");

        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSalir.setMinimumSize(new java.awt.Dimension(90, 25));

        btnTablaPersonas.setText("Usuarios");
        btnTablaPersonas.setBounds(15, 25, 100, 25);
        add(btnTablaPersonas);

        btnTablaPrestamos.setText("Préstamos");
        btnTablaPrestamos.setBounds(15, 55, 100, 25);
        add(btnTablaPrestamos);

        btnTablaAutores.setText("Autores");
        btnTablaAutores.setBounds(15, 85, 100, 25);
        add(btnTablaAutores);

        btnTablaVolumenes.setText("Volúmenes");
        btnTablaVolumenes.setBounds(15, 115, 100, 25);
        add(btnTablaVolumenes);

        btnTablaLibros.setText("Libros");
        btnTablaLibros.setBounds(15, 145, 100, 25);
        add(btnTablaLibros);

        txt1.setBounds(118, 200, 300, 25);
        add(txt1);
        txt2.setBounds(118, 250, 300, 25);
        add(txt2);
        deterioro.setBounds(118, 250, 300, 25);
        add(deterioro);
        deterioro.addItem("No");
        deterioro.addItem("Sí");
        deterioro.setVisible(false);
        txt3.setBounds(118, 300, 300, 25);
        add(txt3);
        txt4.setBounds(118, 350, 300, 25);
        add(txt4);
        txt5.setBounds(118, 400, 300, 25);
        add(txt5);
        txt6.setBounds(118, 450, 300, 25);
        add(txt6);
        txt7.setBounds(118, 500, 300, 25);
        add(txt7);
        
        txtLabel1.setBounds(15, 200, 300, 25);
        add(txtLabel1);
        txtLabel2.setBounds(15, 250, 300, 25);
        add(txtLabel2);
        txtLabel3.setBounds(15, 300, 300, 25);
        add(txtLabel3);
        txtLabel4.setBounds(15, 350, 300, 25);
        add(txtLabel4);
        txtLabel5.setBounds(15, 400, 300, 25);
        add(txtLabel5);
        txtLabel6.setBounds(15, 450, 300, 25);
        add(txtLabel6);
        txtLabel7.setBounds(15, 500, 300, 25);
        add(txtLabel7);

        imagenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnModificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnBajas, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnModificaciones)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(datosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(94, 94, 94))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(barraDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(barraDesplazamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(datosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }

    public JTable getTablaAlumnos() {
        return TablaAlumnos;
    }

    public JButton getBtnAltas() {
        return btnAltas;
    }

    public JButton getBtnBajas() {
        return btnBajas;
    }

    public JButton getBtnModificaciones() {
        return btnModificaciones;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JTextField getTxt4() {
        return txt4;
    }

    public JTextField getTxt5() {
        return txt5;
    }

    public JTextField getTxt1() {
        return txt1;
    }

    public JTextField getTxt3() {
        return txt3;
    }

    public JTextField getTxt2() {
        return txt2;
    }
    
    public JTextField getTxt6() {
        return txt6;
    }
    
    public JTextField getTxt7() {
        return txt7;
    }

    public JButton getBtnTablaPersonas() {
        return btnTablaPersonas;
    }

    public JButton getBtnTablaPrestamos() {
        return btnTablaPrestamos;
    }

    public JButton getBtnTablaVolumenes() {
        return btnTablaVolumenes;
    }

    public JButton getBtnTablaLibros() {
        return btnTablaLibros;
    }

    public JButton getBtnTablaAutores() {
        return btnTablaAutores;
    }

    public JLabel getTxtLabel1() {
        return txtLabel1;
    }

    public JLabel getTxtLabel2() {
        return txtLabel2;
    }

    public JLabel getTxtLabel3() {
        return txtLabel3;
    }

    public JLabel getTxtLabel4() {
        return txtLabel4;
    }

    public JLabel getTxtLabel5() {
        return txtLabel5;
    }

    public JLabel getTxtLabel6() {
        return txtLabel6;
    }

    public JLabel getTxtLabel7() {
        return txtLabel7;
    }

    public JComboBox getDeterioro() {
        return deterioro;
    }

    public JLabel getImagenLabel() {
        return imagenLabel;
    }

}
