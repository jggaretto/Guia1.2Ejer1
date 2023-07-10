/*
 
 */
package ejer1;


public class Numero {
     private int valor; // Atributo de tipo entero

    // Constructor que permite inicializar el atributo "valor"
    public Numero(int valor) {
        this.valor = valor;
    }

    // Método getter para obtener el valor del atributo "valor"
    public int getValor() {
        return valor;
    }

    // Método setter para establecer el valor del atributo "valor"
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método para determinar si el valor es par o no
    public boolean esPar() {
        return valor % 2 == 0;
    }

    // Método para determinar si el valor es positivo o no
    public boolean esPositivo() {
        return valor >= 0;
    }

    // Método para determinar si el valor es múltiplo de un número dado
    public boolean esMultiploDe(int num) {
        return valor % num == 0;
    }
}
