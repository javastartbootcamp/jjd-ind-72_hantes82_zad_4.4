package pl.javastart.task.data;

public class Config {

    public int minRequiredEarnings = 2000;
    public double percentage = 0.03;

    public Config(int minRequiredEarnings, double percentage) {
        this.minRequiredEarnings = minRequiredEarnings;
        this.percentage = percentage;
    }

    public Config() {
    }

    public int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    public void setMinRequiredEarnings(int minRequiredEarnings) {
        this.minRequiredEarnings = minRequiredEarnings;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
