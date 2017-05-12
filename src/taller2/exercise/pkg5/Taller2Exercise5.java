
package taller2.exercise.pkg5;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller2Exercise5 {

    public static void main(String[] args) {
        
        int Arreglo[] = {10, 4, 1, 6, 2};
        int arreglo[] = new int[Arreglo.length];
        int Multipli = 1;
        System.out.println("Arreglo A: ");
        
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.printf(Arreglo[i]+" ");
        }
  
        System.err.print("");
        for (int i =0; i < Arreglo.length; i++) {
                Multipli *=Arreglo[i];        
        }
        
        for (int i = 0; i < Arreglo.length; i++) {
            arreglo[i] = Multipli/Arreglo[i];
        }
        
        System.out.println("");
        System.out.println("Arreglo B: ");
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.printf(arreglo[i]+" ");
        }
    }
    
}
