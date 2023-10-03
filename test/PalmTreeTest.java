import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalmTreeTest {

    PalmTree plant = new PalmTree("TestPlant" , 1);

    @Test
    void getRequiredLiquid(){
        String expectedLiquid = "mineral water";
        String actualLiquid = plant.getRequiredLiquid();
        Assertions.assertEquals(expectedLiquid, actualLiquid);
    }

    @Test
    void getDailyLiquidIntake(){
        double expectedLiquidIntake = 0.5;
        double actualLiquidIntake = (double) Math.round(plant.getDailyLiquidIntake() * 100) /100;

        Assertions.assertEquals(expectedLiquidIntake, actualLiquidIntake);
    }

}