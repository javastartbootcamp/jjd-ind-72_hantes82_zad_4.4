package pl.javastart.task.data;

import pl.javastart.task.data.Config;
import pl.javastart.task.data.Offer;

public class SalesRepresentative {
    Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {

        if (earnings >= config.getMinRequiredEarnings()) {
            return new Offer(true, requestedAmount, config.getPercentage());
        }
        return new Offer();
    }

}
