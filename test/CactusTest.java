import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CactusTest {

    Cactus testPlant = new Cactus("TestPlant" , 1);
    Cactus testPlantIgge = new Cactus("Igge", 0.2);

    @Test
    void getRequiredLiquid(){
        String expectedLiquid = "mineral water";
        String actualLiquid = testPlant.getRequiredLiquid();
        Assertions.assertEquals(expectedLiquid, actualLiquid);
    }

    @Test
    void getDailyLiquidIntake() {
        double expectedLiquidIntake = 0.2;
        double actualLiquidIntake = testPlant.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);

        actualLiquidIntake = testPlantIgge.getDailyLiquidIntake();
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);
    }
}