package technique;

public class Five {
        // Simulação das lâmpadas
        private static boolean[] lampadas = new boolean[3]; // false = desligada, true = ligada

        public static void main(String[] args) {
            // Inicialização das lâmpadas de forma aleatória
            // Aqui você pode definir manualmente, por exemplo: lampadas[0] = true; etc.
            lampadas[0] = false; // Lâmpada 1 (desligada)
            lampadas[1] = true;  // Lâmpada 2 (ligada)
            lampadas[2] = false; // Lâmpada 3 (desligada)

            // Passo 1: Ligar o interruptor 1 e o interruptor 2
            ligarInterruptor(1);
            ligarInterruptor(2);

            // Esperar um pouco (simular o tempo para aquecer a lâmpada)
            try {
                Thread.sleep(5000); // 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Passo 2: Desligar o interruptor 2
            desligarInterruptor(2);

            // Passo 3: Ir até a sala das lâmpadas para verificar
            verificarLampadas();

            // Passo 4: Desligar o interruptor 1 antes de sair
            desligarInterruptor(1);

            // Passo 5: Ir até a sala novamente para a verificação final
            verificarLampadas();
        }

        private static void ligarInterruptor(int i) {
            System.out.println("Ligando o interruptor " + i);
            // Aqui você simula a ligação da lâmpada
            if (i >= 1 && i <= 3) {
                lampadas[i - 1] = true; // Liga a lâmpada correspondente
            }
        }

        private static void desligarInterruptor(int i) {
            System.out.println("Desligando o interruptor " + i);
            // Aqui você simula a desligação da lâmpada
            if (i >= 1 && i <= 3) {
                lampadas[i - 1] = false; // Desliga a lâmpada correspondente
            }
        }

        private static void verificarLampadas() {
            System.out.println("Verificando as lâmpadas...");
            for (int i = 0; i < lampadas.length; i++) {
                System.out.println("Lâmpada " + (i + 1) + ": " + (lampadas[i] ? "Ligada" : "Desligada"));
            }
            System.out.println();
        }
    }

