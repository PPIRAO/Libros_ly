package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class fondo extends JFrame {
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
fondo frame = new fondo();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public fondo() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
PanelImagen p = new PanelImagen();
p.setBorder(new EmptyBorder(5, 5, 5, 5));
p.setLayout(new BorderLayout(0, 0));
setContentPane(p);
}
}