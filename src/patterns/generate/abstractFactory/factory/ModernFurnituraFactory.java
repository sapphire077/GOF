package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;
import patterns.generate.abstractFactory.model.modern.ModernChair;
import patterns.generate.abstractFactory.model.modern.ModernSofa;
import patterns.generate.abstractFactory.model.modern.ModernTable;

public class ModernFurnituraFactory implements FurnityraFactory{
    @Override
    public Chair createChair() {
        System.out.println("Создан модернчар стул");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("модернтэйбл стул");
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Создан модернсофа стул");
        return new ModernSofa();
    }
}
