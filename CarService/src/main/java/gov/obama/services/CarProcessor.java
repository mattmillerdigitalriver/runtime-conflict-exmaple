package gov.obama.services;

import com.matt.lib.Printer;

public class CarProcessor {

    /**
     * This method uses the car-printer.
     */
    public void processCar() {
        Printer printer = new Printer();

        //This printer is from the CarPrinter... look at the pom if you don't believe me!
        printer.print();
    }
}
