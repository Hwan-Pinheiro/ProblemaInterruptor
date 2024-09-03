package br.com.matheus.main;

import br.com.matheus.interruptores.Interruptor;
import br.com.matheus.interruptores.Lampada;

public class Main {

	public static void main(String[] args) {
		// Criação das lâmpadas
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        Lampada lampada3 = new Lampada();

        // Criação dos interruptores que controlam as lâmpadas
        Interruptor interruptorA = new Interruptor(lampada1);
        Interruptor interruptorB = new Interruptor(lampada2);
        Interruptor interruptorC = new Interruptor(lampada3);

        // Simulação das ações descritas no problema
        interruptorA.ligar();  // Liga o interruptor A (lampada1)
        // Supondo uma espera de tempo, a lâmpada aquece
        // Após 5 minutos, desliga o interruptor A
        interruptorA.desligar();

        interruptorB.ligar();  // Liga o interruptor B (lampada2)
        // O interruptor C permanece desligado

        // Determinação de qual interruptor controla qual lâmpada
        verificarLampada(lampada1, "A");
        verificarLampada(lampada2, "B");
        verificarLampada(lampada3, "C");
    }

    // Método para verificar o estado da lâmpada e associar ao interruptor correto
    public static void verificarLampada(Lampada lampada, String nomeInterruptor) {
        if (lampada.isAcesa()) {
            System.out.println("Interruptor " + nomeInterruptor + " controla a lâmpada que está acesa.");
        } else if (!lampada.isAcesa() && lampada.isQuente()) {
            System.out.println("Interruptor " + nomeInterruptor + " controla a lâmpada que está quente e apagada.");
        } else {
            System.out.println("Interruptor " + nomeInterruptor + " controla a lâmpada que está fria e apagada.");
        }
    }
}

