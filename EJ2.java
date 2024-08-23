import javax.swing.JOptionPane;

public class EJ2 {
    public static void main(String[] args) {
     
        final int Hora = 4000;

        int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de empleados"));

       
        String[] empleados = new String[cantidadEmpleados];
        double[] sueldos = new double[cantidadEmpleados];
        double[] HorasT = new double[cantidadEmpleados];

        for (int i = 0; i < cantidadEmpleados; i++) {
            empleados[i] = JOptionPane.showInputDialog(null, "Digite el nombre del empleado número " + (i+1) + ":");
            HorasT[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de horas trabajadas por " + empleados[i]));
            sueldos[i] = HorasT[i] * Hora;
        }

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("El empleado " + empleados[i] + " trabajo " + HorasT[i] + " horas y tiene un sueldo de $" + sueldos[i]); 
            
        }

    }
}