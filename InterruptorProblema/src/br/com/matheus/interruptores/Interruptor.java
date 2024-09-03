package br.com.matheus.interruptores;

public class Interruptor {
	 private Lampada lampada;

	    public Interruptor(Lampada lampada) {
	        this.lampada = lampada;
	    }

	    public void ligar() {
	        this.lampada.ligar();
	    }

	    public void desligar() {
	        this.lampada.desligar();
	    }
}
