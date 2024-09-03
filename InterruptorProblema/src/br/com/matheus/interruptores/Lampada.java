package br.com.matheus.interruptores;

public class Lampada {
	 private boolean acesa;  // Estado da lâmpada: acesa ou apagada
	    private boolean quente; // Estado da lâmpada: quente ou fria

	    public Lampada() {
	        this.acesa = false;
	        this.quente = false;
	    }

	    // Método para ligar a lâmpada
	    public void ligar() {
	        this.acesa = true;
	        this.quente = true;
	    }

	    // Método para desligar a lâmpada
	    public void desligar() {
	        this.acesa = false;
	    }

	    // Verifica se a lâmpada está acesa
	    public boolean isAcesa() {
	        return acesa;
	    }

	    // Verifica se a lâmpada está quente
	    public boolean isQuente() {
	        return quente;
	    }
}
