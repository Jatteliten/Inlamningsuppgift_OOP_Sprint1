import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CarnivorousPlantTest {


    CarnivorousPlant testPlant = new CarnivorousPlant("TestPlant", 1);
    CarnivorousPlant testPlantMeatloaf = new CarnivorousPlant("Meatloaf", 0.7);

    @Test
    void getRequiredLiquid(){
        String expectedLiquid = "protein";
        String actualLiquid = testPlant.getRequiredLiquid();
        Assertions.assertEquals(expectedLiquid, actualLiquid);
    }

    @Test
    void getDailyLiquidIntake() {
        double expectedLiquidIntake = 0.3;
        double actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

        expectedLiquidIntake = 0.24;
        actualLiquidIntake = testPlantMeatloaf.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);
    }

    @Test
    void setHeight(){
        testPlant.setHeight(10);
        double expectedLiquidIntake = 2.1;
        double actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

        testPlant.setHeight(20);
        expectedLiquidIntake = 4.1;
        actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

    }
}