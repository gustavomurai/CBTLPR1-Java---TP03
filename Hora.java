package TP03_Hora;

//// trabalho feito por Gustavo Murai e Igor Murai
import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    Scanner sc = new Scanner(System.in);

    // Construtor sem parâmetros
    public Hora() {
        setHor();
        setMin();
        setSeg();
    }

    // Construtor com parâmetros
    public Hora(int h, int m, int s) {
        if (validaHora(h)) this.hora = h;
        else this.hora = 0;

        if (validaMinutoSegundo(m)) this.min = m;
        else this.min = 0;

        if (validaMinutoSegundo(s)) this.seg = s;
        else this.seg = 0;
    }

    // Métodos set com parâmetro
    public void setHor(int h) {
        if (validaHora(h)) this.hora = h;
    }

    public void setMin(int m) {
        if (validaMinutoSegundo(m)) this.min = m;
    }

    public void setSeg(int s) {
        if (validaMinutoSegundo(s)) this.seg = s;
    }

    // Métodos set sem parâmetro (leitura via teclado)
    public void setHor() {
        while (true) {
            try {
                System.out.print("Digite a hora (0-23): ");
                int h = Integer.parseInt(sc.nextLine());
                if (validaHora(h)) {
                    this.hora = h;
                    break;
                } else {
                    System.out.println("Hora inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }

    public void setMin() {
        while (true) {
            try {
                System.out.print("Digite o minuto (0-59): ");
                int m = Integer.parseInt(sc.nextLine());
                if (validaMinutoSegundo(m)) {
                    this.min = m;
                    break;
                } else {
                    System.out.println("Minuto inválido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }

    public void setSeg() {
        while (true) {
            try {
                System.out.print("Digite o segundo (0-59): ");
                int s = Integer.parseInt(sc.nextLine());
                if (validaMinutoSegundo(s)) {
                    this.seg = s;
                    break;
                } else {
                    System.out.println("Segundo inválido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }

    // Métodos get
    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    public String getHora2() {
        int hora12 = hora % 12;
        if (hora12 == 0) hora12 = 12;
        String periodo = (hora < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hora12, min, seg, periodo);
    }

    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }

    // Métodos auxiliares
    private boolean validaHora(int h) {
        return h >= 0 && h < 24;
    }

    private boolean validaMinutoSegundo(int valor) {
        return valor >= 0 && valor < 60;
    }
}
