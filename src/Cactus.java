public class Cactus extends Plants implements HousePlant {

    public Cactus(String name, double height) {
        super(name, height, PlantTypesAndNeeds.CACTUS.species, PlantTypesAndNeeds.CACTUS.liquid,
                PlantTypesAndNeeds.CACTUS.dailyIntake(height));
    }

    //här förekommer polymorfism
    @Override
    public String getRequiredLiquid() { return PlantTypesAndNeeds.CACTUS.liquid; }
    @Override
    public double getDailyLiquidIntake() { return PlantTypesAndNeeds.CACTUS.dailyIntake(getHeight()); }

}