package pl.javastart.task;

import pl.javastart.task.data.CustomerService;
import pl.javastart.task.data.SalesRepresentative;
import pl.javastart.task.data.Offer;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
        // salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);
        //Offer offer1 = new Offer(true, 1000000, 0);
        //offer1.setValue(10000000);
        //offer1.setPercentage(5);
        // to również nie powinno być możliwe
//        offer.valid = true;
//        offer.percentage = -0.5;
//        offer.value = 2_000_000;

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}