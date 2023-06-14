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

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
