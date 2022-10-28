package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;
import patterns.generate.abstractFactory.model.viktorian.VictorianChair;
import patterns.generate.abstractFactory.model.viktorian.VictorianSofa;
import patterns.generate.abstractFactory.model.viktorian.VictorianTable;

public class ViktorianFurnityraFactory implements FurnityraFactory{
    @Override
    public Chair createChair() {
        System.out.println("Создан викторианчар");
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Создан викториан тайбле");
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Создан викториансофа");
        return new VictorianSofa();
    }
}
