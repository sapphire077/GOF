package patterns.generate.abstractFactory.model;

import patterns.generate.abstractFactory.factory.FurnityraFactory;
import patterns.generate.abstractFactory.factory.ModernFurnituraFactory;
import patterns.generate.abstractFactory.factory.ViktorianFurnityraFactory;

import java.util.Scanner;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ведите стиль мебели для заказа на заводе");

        String type= sc.next();
        FurnityraFactory factory= null;

        if ("Викторианский_стиль".equals(type)){
            factory = new ViktorianFurnityraFactory();

        }else if ("Модерн".equals(type)){
            factory= new ModernFurnituraFactory();
        }
        System.out.println("Введите товар который хотите заказать? (стол, стул, диван)");
        String productType= sc.next();
        if ("стол".equals(productType)){
          Table е=  factory.createTable();

        }else if ("стул".equals(productType)){
            Chair с= factory.createChair();
        }else if ("софа".equals(productType)) {
            Sofa s= factory.createSofa();
        }
    }
}
