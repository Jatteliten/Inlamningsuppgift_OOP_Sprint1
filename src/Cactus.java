public class Cactus extends Plants implements HousePlant {

    public Cactus(String name, double height) {
        super(name, height, PlantTypesEnum.CACTUS.species, PlantTypesEnum.CACTUS.liquid,
                PlantTypesEnum.CACTUS.dailyIntake(height));
    }

    //här förekommer polymorfism
    @Override
    public String getRequiredLiquid() { return PlantTypesEnum.CACTUS.liquid; }
    @Override
    public double getDailyLiquidIntake() { return PlantTypesEnum.CARNIVOROUS_PLANT.dailyIntake(getHeight()); }

}