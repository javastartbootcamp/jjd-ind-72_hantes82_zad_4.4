package pl.javastart.task.data;

class Config {

    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    Config(int minRequiredEarnings, double percentage) {
        this.minRequiredEarnings = minRequiredEarnings;
        this.percentage = percentage;
    }

    Config() {
    }

    int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    void setMinRequiredEarnings(int minRequiredEarnings) {
        this.minRequiredEarnings = minRequiredEarnings;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
