/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // System.out.println("Starting Qcalc...");
        // StandardCalculator calc=new StandardCalculator();
        // calc.subtract(-Double.MAX_VALUE, 0.0);
        // calc.printResult();
        LogicCalculator calc = new LogicCalculator();
        calc.divide(10, 0);
        calc.printResult();
    }
}
