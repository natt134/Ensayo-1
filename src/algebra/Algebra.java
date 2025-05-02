package algebra;
import java.util.Scanner;
public class Algebra {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[25];
        System.out.println("Ingrese las 25 notas de los estudiantes de Álgebra Lineal:");
        for (int i = 0; i < 25; i++) {
            notas[i] = scanner.nextDouble();
        }
        
        Algebra analisis = new Algebra();
        analisis.analizarNotas();
        
    }

    private void analizarNotas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

    
    

