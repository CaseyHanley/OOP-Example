package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OOPconfig.class);

        //Polymorphism: As you can see these are Both Workers. Even though they do the same things they have different results
        Worker doc = context.getBean("doctor", Doctor.class);
        Worker fullStackEngineer = context.getBean("softwareEngineer", SoftwareEngineer.class);


        //Abstraction: You can see what it does without having to see what the code is Doing
        doc.workDescription();
        fullStackEngineer.workDescription();

    }
}
