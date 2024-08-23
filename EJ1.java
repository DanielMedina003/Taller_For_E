import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {

        int n = 0;
        
        for (; n <= 500;) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            
        }
        
        JOptionPane.showMessageDialog(null, "El numero es mayor a 500");
    }
}