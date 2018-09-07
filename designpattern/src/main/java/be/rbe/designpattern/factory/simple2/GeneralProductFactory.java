package be.rbe.designpattern.factory.simple2;

public class GeneralProductFactory implements ProductFactory {
    @Override
    public Product from(String type) {
        // todo move Type choice to Class
        if (type == "CONCRETE") {
            return new ConcreteProduct();
        } else {
            return new OtherProduct();
        }
    }
}
