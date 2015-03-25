package gov.obama.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarProcessorTest {

    @Test
    public void testProcessCar() throws Exception {
        CarProcessor carProcessor = new CarProcessor();
        carProcessor.processCar();
    }
}