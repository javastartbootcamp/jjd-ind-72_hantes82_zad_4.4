package pl.javastart.task.data;

public class Offer {
    boolean valid;
    double value;
    double percentage;

    public Offer(boolean valid, double value, double percentage) {
        this.valid = valid;
        this.value = value;
        this.percentage = percentage;
    }

    public Offer() {
    }

    boolean isValid() {
        return valid;
    }

    void setValid(boolean valid) {
        this.valid = valid;
    }

    double getValue() {
        return value;
    }

    void setValue(double value) {
        this.value = value;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
