import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CactusTest {

    Cactus plant = new Cactus("TestPlant" , 1);

    @Test
    void getRequiredLiquid(){
        String expectedLiquid = "mineral water";
        String actualLiquid = plant.getRequiredLiquid();
        Assertions.assertEquals(expectedLiquid, actualLiquid);
    }

    @Test
    void getDailyLiquidIntake() {
        double expectedLiquidIntake = 0.2;
        double actualLiquidIntake = PlantTypesEnum.CACTUS.dailyIntake(plant.getHeight());
        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);
    }
}