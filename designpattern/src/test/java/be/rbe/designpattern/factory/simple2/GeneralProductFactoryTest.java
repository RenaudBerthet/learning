package be.rbe.designpattern.factory.simple2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GeneralProductFactoryTest {

    private static String TYPE_CONCRETE = "CONCRETE";
    private static String TYPE_NOT_CONCRETE = "SOMETHING";

    @Test
    void can_produce_concrete_product_when_type_is_concrete() {
        //Given
        GeneralProductFactory givenGeneralProductFactory = new GeneralProductFactory();
        //When
        Product actualProduct = givenGeneralProductFactory.from(TYPE_CONCRETE);
        //Then
        Assertions.assertTrue(actualProduct instanceof ConcreteProduct);
    }

    @Test
    void can_produce_other_product_when_type_is_not_concrete() {
        //Given
        GeneralProductFactory givenGeneralProductFactory = new GeneralProductFactory();
        //When
        Product actualProduct = givenGeneralProductFactory.from(TYPE_NOT_CONCRETE);
        //Then
        Assertions.assertTrue(actualProduct instanceof OtherProduct);
    }


}