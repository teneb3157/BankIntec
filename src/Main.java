import Entites.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arg) {
System.out.println("Hello and Welcome");
//Declaration des objets
        Compte c1 = new Compte(15, 120,25000,new Date(),new Date());
        Compte c2 = new Compte(13, 160,70000, new Date(),new Date());
        Compte c3 = new Compte(10, 220,30000, new Date(),new Date());
        Compte c4 = new Compte(16, 327,45000, new Date(),new Date());
        Compte c5 = new Compte(10, 445,55000, new Date(13),new Date());


        CompteSimple cs1 = new CompteSimple(12,15,10000,new Date(),new Date());
        CompteSimple cs2 = new CompteSimple(1,11,550000,new Date(),new Date());
        CompteSimple cs3 = new CompteSimple(2,7,60000,new Date(),new Date());
        CompteSimple cs4 = new CompteSimple(9,2,40000,new Date(),new Date());
        CompteSimple cs5 = new CompteSimple(4,18,50000,new Date(),new Date());

        System.out.println(cs1.toString());
        System.out.println(cs2.toString());
        System.out.println(cs3.toString());
        System.out.println(cs4.toString());
        System.out.println(cs5.toString());

        Personne p1 = new Personne(2,"Ballo", "Ami", 20, "kati", "77007700", new Date(),new Date(),new Date());
        Personne p2 = new Personne(3,"maiga", "Awa", 20, "golf", "77055700", new Date(),new Date(),new Date());
        Personne p3 = new Personne(9,"Ballo", "Ami", 20, "faladie", "67007700", new Date(),new Date(),new Date());
        Personne p4 = new Personne(7,"Ballo", "Ami", 20, "segou", "89007700", new Date(),new Date(),new Date());
        Personne p5= new Personne(2,"Ballo", "Ami", 20, "kaye", "65007700", new Date(),new Date(),new Date());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());


            ComptePayant cp1 = new ComptePayant(12,02,45000,new Date(),new Date());
            ComptePayant cp2 = new ComptePayant(13,15,20000,new Date(),new Date());
            ComptePayant cp3 = new ComptePayant(22,22,3000,new Date(),new Date());
            ComptePayant cp4 = new ComptePayant(03,12,5000,new Date(),new Date());
            ComptePayant cp5 = new ComptePayant(15,02,90000,new Date(),new Date());

            System.out.println(cp1.toString());
            System.out.println(cp2.toString());
            System.out.println(cp3.toString());
            System.out.println(cp4.toString());
            System.out.println(cp5.toString());


            CompteEpargne ce1 =  new CompteEpargne(2);
            System.out.println(ce1.toString());

    }
}