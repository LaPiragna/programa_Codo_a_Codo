package Java.Model.Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controladora {
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        CalculadoraInteresCompuesto calculadoraInteresCompuesto = new CalculadoraInteresCompuesto();
        int choice = -1;
        do {
            calculadoraInteresCompuesto.setResult(calculadoraInteresCompuesto.getInitialFund(),
                    calculadoraInteresCompuesto.getTranscurredDays(),
                    calculadoraInteresCompuesto.getAnualYield());
            System.out.println(Menu.printActualResult(calculadoraInteresCompuesto.getInitialFund(),
                    calculadoraInteresCompuesto.getTranscurredDays(),
                    calculadoraInteresCompuesto.getAnualYield(),calculadoraInteresCompuesto.getResult()));
            System.out.println(Menu.printMenu());
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 0:break;//salir.
                    case 1://modificar fondos iniciales.
                        System.out.println(Menu.askForModFunds());calculadoraInteresCompuesto.setInitialFund(scanner.nextInt());break;
                    case 2://modificar dias transcurridos.
                        System.out.println(Menu.askForModTranscurredDays());calculadoraInteresCompuesto.setTranscurredDays(scanner.nextInt());break;
                    case 3://modificar rendimiento anual.
                        System.out.println(Menu.askForModAnualYield());calculadoraInteresCompuesto.setAnualYield(scanner.nextFloat());break;
                }
            }
            catch (InputMismatchException e){System.out.println("Input inválido.");choice=-1;}
        } while (choice != 0);
    }

}
