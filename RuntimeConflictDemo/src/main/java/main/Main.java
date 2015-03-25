package main;

import com.matt.lib.Printer;
import gov.obama.services.CarProcessor;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) {
        printClassPath();

        System.out.println("The animal-printer should do animal stuff...");
        Printer animalPrinter = new Printer();
        animalPrinter.print();

        System.out.println();
        System.out.println("The car-processor should do car stuff...");
        CarProcessor carProcessor = new CarProcessor();
        carProcessor.processCar();
        System.out.println("But did it???");

    }

    public static void printClassPath() {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)cl).getURLs();
        for(URL url: urls){
            System.out.println(url.getFile());
        }
        System.out.println("----------------------------------------------------------------");
    }
}
