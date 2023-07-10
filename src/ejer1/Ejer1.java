
package ejer1;


public class Ejer1 {

   
    public static void main(String[] args) {
       
  // Crear un objeto Numero con el valor 1459
        Numero numero = new Numero(1459);

        // Mostrar por consola si es par o no
        System.out.println("¿Es par? " + numero.esPar());

        // Mostrar por consola si es positivo o no
        System.out.println("¿Es positivo? " + numero.esPositivo());

        // Mostrar por consola si es múltiplo de 3
        System.out.println("¿Es múltiplo de 3? " + numero.esMultiploDe(3));
    }
    
}
