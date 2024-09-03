package br.com.matheus.interruptores;

public class Lampada {
	 private boolean estado; // true = ligada, false = desligada

	    public Lampada() {
	        this.estado = false;
	    }

	    public void ligar() {
	        this.estado = true;
	    }

	    public void desligar() {
	        this.estado = false;
	    }

	    public boolean getEstado() {
	        return this.estado;
	    }
}
