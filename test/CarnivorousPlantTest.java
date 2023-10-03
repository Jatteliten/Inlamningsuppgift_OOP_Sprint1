import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CarnivorousPlantTest {


    CarnivorousPlant plant = new CarnivorousPlant("TestPlant", 1);

    @Test
    void getRequiredLiquid(){
        String expectedLiquid = "protein";
        String actualLiquid = plant.getRequiredLiquid();
        Assertions.assertEquals(expectedLiquid, actualLiquid);
    }

    @Test
    void getDailyLiquidIntake() {
        double expectedLiquidIntake = 0.3;
        double actualLiquidIntake = (double) Math.round(plant.getDailyLiquidIntake() * 100) /100;
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);
    }
}