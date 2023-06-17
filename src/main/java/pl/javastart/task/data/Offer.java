package pl.javastart.task.data;

public class Offer {
    private boolean valid;
    private double value;
    private double percentage;

    Offer(boolean valid, double value, double percentage) {
        this.valid = valid;
        this.value = value;
        this.percentage = percentage;
    }

    Offer() {
    }

    public boolean isValid() {
        return valid;
    }

    void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getValue() {
        return value;
    }

    void setValue(double value) {
        this.value = value;
    }

    public double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
