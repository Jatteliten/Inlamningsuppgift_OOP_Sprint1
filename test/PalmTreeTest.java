import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalmTreeTest {

    PalmTree testPlant = new PalmTree("TestPlant" , 1);
    PalmTree testPlantLaura = new PalmTree("Laura",  5);
    PalmTree testPlantOlof = new PalmTree("Olof",  1);

    @Test
    void getRequiredLiquid(){
        String expectedLiquid = "mineral water";
        String actualLiquid = testPlant.getRequiredLiquid();
        Assertions.assertEquals(expectedLiquid, actualLiquid);
    }

    @Test
    void getDailyLiquidIntake(){
        double expectedLiquidIntake = 0.5;
        double actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

        actualLiquidIntake = testPlantOlof.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

        expectedLiquidIntake = 2.5;
        actualLiquidIntake = testPlantLaura.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);
    }

    @Test
    void setHeight(){
        testPlant.setHeight(10);
        double expectedLiquidIntake = 5;
        double actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

        testPlant.setHeight(20);
        expectedLiquidIntake = 10;
        actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

    }


}