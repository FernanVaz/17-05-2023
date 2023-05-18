package com.softteck.modelo;
import java.util.Scanner;
public class Dado {
    private int resultado;

    public Dado() {
    }

    public void lanzar() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.print("¿QUIERES LANZAR EL DADO? (si/no): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                resultado = (int) (Math.random() * 6) + 1;
                switch (resultado) {
                    case 1:
                        dibujar1();
                        break;
                    case 2:
                        dibujar2();
                        break;
                    case 3:
                        dibujar3();
                        break;
                    case 4:
                        dibujar4();
                        break;
                    case 5:
                        dibujar5();
                        break;
                    case 6:
                        dibujar6();
                        break;
                    default:
                        System.out.println("Número inválido.");
                }
            } else if (respuesta.equalsIgnoreCase("no")) {
                salir = true;
            } else {
                System.out.println("NO HE ENTENDIDO TU RESPUESTA, RESPONDE CON SI O NO ");
            }
        } while (!salir);
    }
    public void dibujar1() {
        String dibujo = "HA SALIDO EL 1\n" +
                " ------- \n" +
                "|       |\n" +
                "|   *   |\n" +
                "|       |\n" +
                " ------- ";
        System.out.println(dibujo);
    }

    public void dibujar2() {
        String dibujo = "HA SALIDO EL 2\n" +
                " ------- \n" +
                "|     * |\n" +
                "|       |\n" +
                "| *     |\n" +
                " ------- ";
        System.out.println(dibujo);
    }

    public void dibujar3() {
        String dibujo = "HA SALIDO EL 3\n" +
                " ------- \n" +
                "|     * |\n" +
                "|   *   |\n" +
                "| *     |\n" +
                " ------- ";
        System.out.println(dibujo);
    }

    public void dibujar4() {
        String dibujo = "HA SALIDO EL 4\n" +
                " ------- \n" +
                "| *   * |\n" +
                "|       |\n" +
                "| *   * |\n" +
                " ------- ";
        System.out.println(dibujo);
    }

    public void dibujar5() {
        String dibujo = "HA SALIDO EL 5\n" +
                " ------- \n" +
                "| *   * |\n" +
                "|   *   |\n" +
                "| *   * |\n" +
                " ------- ";
        System.out.println(dibujo);
    }

    public void dibujar6() {
        String dibujo = "HA SALIDO EL 6\n" +
                " ------- \n" +
                "| *   * |\n" +
                "| *   * |\n" +
                "| *   * |\n" +
                " ------- ";
        System.out.println(dibujo);
    }
}
