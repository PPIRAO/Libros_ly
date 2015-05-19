package ventanas;
 
//package librosEntornosComrprar;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class CompradoExito extends JFrame {
 
    private JPanel contentPane;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CompradoExito frame = new CompradoExito();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public CompradoExito() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 533, 433);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
         
        JLabel lblFactura = new JLabel("Factura");
        lblFactura.setBounds(50, 11, 46, 14);
        contentPane.add(lblFactura);
         
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(50, 50, 46, 14);
        contentPane.add(lblNombre);
         
        JLabel lblApellidos = new JLabel("Apellidos");
        lblApellidos.setBounds(50, 75, 46, 14);
        contentPane.add(lblApellidos);
         
        JLabel lblDni = new JLabel("Dni");
        lblDni.setBounds(50, 100, 46, 14);
        contentPane.add(lblDni);
         
        JLabel lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta");
        lblNumeroDeTarjeta.setBounds(50, 132, 108, 14);
        contentPane.add(lblNumeroDeTarjeta);
         
        JLabel lblHora = new JLabel("Hora");
        lblHora.setBounds(50, 158, 46, 14);
        contentPane.add(lblHora);
         
        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(50, 183, 46, 14);
        contentPane.add(lblPrecio);
         
        JLabel lblDescuento = new JLabel("Descuento");
        lblDescuento.setBounds(50, 208, 67, 14);
        contentPane.add(lblDescuento);
         
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
     
             
                 
                 
                 
             
                 
                 
            }
        });
        btnSalir.setBounds(50, 258, 89, 23);
        contentPane.add(btnSalir);
    }
}