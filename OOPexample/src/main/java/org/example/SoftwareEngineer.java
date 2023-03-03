package org.example;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Worker{

    //Encapsulation: you can not easily access this value
    private double pay = 100.00;

    //Encapsulation: you can only set the variable if you are meaning to set this variable specifically
    @Override
    public void setPay(double pay) {

    }

    //Encapsulation: you can only get the variable if you are meaning to get this variable specifically
    @Override
    public double getPay() {
        return pay;
    }

    //Inheriting from Worker
    @Override
    public void workDescription() {
        System.out.println("I hate my life;");
    }
}
