package com.cj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.cj")
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(App.class);

        Barista barista = context.getBean(Barista.class);
        barista.makeCoffee();

        context.close();
    }
}
