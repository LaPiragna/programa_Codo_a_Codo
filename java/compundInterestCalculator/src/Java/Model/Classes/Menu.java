package Java.Model.Classes;

public class Menu {
    public static String printMenu() {
        return """
                0. Salir.
                1. Modificar fondos iniciales.
                2. Modificar días transcurridos.
                3. Modificar rendimiento anual.
                """ + "\n";
    }

    public static String printActualResult(int initialFunds, int transcurredDays, float anualYield, float result) {
        return "Fondos iniciales -> $" + initialFunds + ".\n" +
                "Dias transcurridos -> " + transcurredDays + ".\n" +
                "Rendimiento anual -> " + anualYield + ".\n" +
                "Resultado -> $" + result + ".\n";
    }

    public static String askForModFunds() {
        return """
                New value of initial funds:
                """;
    }
    public static String askForModTranscurredDays() {
        return """
                New value of days transcurred:
                """;
    }
    public static String askForModAnualYield() {
        return """
                New value of anual yield:
                """;
    }
}
