package br.com.matheus.interruptores;

public class Interruptor {
	private Lampada lampada;  // Referência à lâmpada que o interruptor controla

    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }

    // Método para ligar o interruptor (liga a lâmpada)
    public void ligar() {
        lampada.ligar();
    }

    // Método para desligar o interruptor (desliga a lâmpada)
    public void desligar() {
        lampada.desligar();
    }
}
