package TP03_Hora;
// trabalho feito por Gustavo Murai e Igor Murai

public class TestaHora {
    public static void main(String[] args) {
        System.out.println(">>> Testando construtor sem parâmetros <<<");
        Hora hora1 = new Hora();

        System.out.println("Hora (formato 24h): " + hora1.getHora1());
        System.out.println("Hora (formato 12h): " + hora1.getHora2());
        System.out.println("Total de segundos: " + hora1.getSegundos());

        System.out.println("\n>>> Testando construtor com parâmetros <<<");
        Hora hora2 = new Hora(13, 45, 30);
        System.out.println("Hora (formato 24h): " + hora2.getHora1());
        System.out.println("Hora (formato 12h): " + hora2.getHora2());
        System.out.println("Total de segundos: " + hora2.getSegundos());

        System.out.println("\n>>> Testando métodos set com valores <<<");
        hora2.setHor(22);
        hora2.setMin(59);
        hora2.setSeg(10);
        System.out.println("Nova hora: " + hora2.getHora1());

        System.out.println("\n>>> Testando leitura via setHor(), setMin(), setSeg() <<<");
        hora2.setHor();
        hora2.setMin();
        hora2.setSeg();
        System.out.println("Hora digitada: " + hora2.getHora1());
    }
}
