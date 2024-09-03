package br.com.matheus.interruptores;

public class Sala {
	private Interruptor[] interruptores;
    private Lampada[] lampadas;

    public Sala(Interruptor[] interruptores, Lampada[] lampadas) {
        this.interruptores = interruptores;
        this.lampadas = lampadas;
    }

    public void verificarLampadas() {
        for (Lampada lampada : lampadas) {
            System.out.println("Lâmpada está " + (lampada.getEstado() ? "ligada" : "desligada"));
        }
    }

    public boolean[] getEstadosLampadas() {
        boolean[] estados = new boolean[lampadas.length];
        for (int i = 0; i < lampadas.length; i++) {
            estados[i] = lampadas[i].getEstado();
        }
        return estados;
    }
}
