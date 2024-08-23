import javax.swing.JOptionPane;

public class Ej3 {
    public static void main(String[] args) {

        int suma = 0;
        int c = 0;

        for (;;) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
            suma += n;
            c++;

            String r = JOptionPane.showInputDialog("¿Desea ingresar otro numero? (si/no)");

            if (r.equalsIgnoreCase("no")) {
                break;
                
            }
        }

        double promedio = suma/c;

        System.out.println("La suma de los numeros ingresados es: " + suma+"\n" + "El promedio de los datos ingresados es: " + promedio);
        
        
    
    }
}
