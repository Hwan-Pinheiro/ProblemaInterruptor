package br.com.matheus.main;

import br.com.matheus.interruptores.Interruptor;
import br.com.matheus.interruptores.Lampada;
import br.com.matheus.interruptores.Sala;

public class Main {

	public static void main(String[] args) {
		// Criar lâmpadas
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        Lampada lampada3 = new Lampada();

        // Criar interruptores
        Interruptor interruptor1 = new Interruptor(lampada1);
        Interruptor interruptor2 = new Interruptor(lampada2);
        Interruptor interruptor3 = new Interruptor(lampada3);

        // Criar sala
        Sala sala = new Sala(new Interruptor[] {interruptor1, interruptor2, interruptor3}, new Lampada[] {lampada1, lampada2, lampada3});

        // Primeira ida até a sala das lâmpadas
        interruptor1.ligar();
        interruptor2.desligar();
        interruptor3.desligar();

        sala.verificarLampadas();

        // Segunda ida até a sala das lâmpadas
        interruptor1.desligar();
        interruptor2.ligar();
        interruptor3.desligar();

        sala.verificarLampadas();

        // Análise dos resultados
        boolean[] resultados1 = sala.getEstadosLampadas();
        boolean[] resultados2 = sala.getEstadosLampadas();

        // Conclusão
        if (resultados1[0] && !resultados1[1]) {
            System.out.println("Interruptor 1 controla a lâmpada 1");
            System.out.println("Interruptor 2 controla a lâmpada 2");
            System.out.println("Interruptor 3 controla a lâmpada 3");
        } else if (!resultados1[0] && resultados1[1]) {
            System.out.println("Interruptor 1 controla a lâmpada 2");
            System.out.println("Interruptor 2 controla a lâmpada 1");
            System.out.println("Interruptor 3 controla a lâmpada 3");
        } else {
            System.out.println("Interruptor 1 controla a lâmpada 3");
            System.out.println("Interruptor 2 controla a lâmpada 1");
            System.out.println("Interruptor 3 controla a lâmpada 2");
        }
    }
}

