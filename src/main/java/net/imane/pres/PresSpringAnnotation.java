package net.imane.pres;

import net.imane.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.imane");

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Resultat : "+metier.calcul());
    }
}
