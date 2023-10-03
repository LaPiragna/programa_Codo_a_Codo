package Java.Model.Classes;
public class CalculadoraInteresCompuesto {
    private InitialFund initialFund;
    private TranscurredDays transcurredDays;
    private AnualYield anualYield;
    private Result result;
    public CalculadoraInteresCompuesto() {
        initialFund = new InitialFund();
        transcurredDays = new TranscurredDays();
        anualYield = new AnualYield();
        result = new Result();
    }

    public int getInitialFund() {
        return initialFund.getValue();
    }

    public void setInitialFund(int initialFund) {
        this.initialFund.setValue(initialFund);
    }

    public int getTranscurredDays() {
        return transcurredDays.getValue();
    }

    public void setTranscurredDays(int transcurredDays) {
        this.transcurredDays.setValue(transcurredDays);
    }

    public float getAnualYield() {
        return anualYield.getValue();
    }

    public void setAnualYield(float anualYield) {
        this.anualYield.setValue(anualYield);
    }

    public float getResult() {
        return result.getValue();
    }

    public void setResult(int initialFunds, int transcurredDays, float anualYield) {
        this.result.setValue((float) ((initialFunds*Math.pow((1+anualYield/100/365),transcurredDays))-initialFunds));
    }

}
