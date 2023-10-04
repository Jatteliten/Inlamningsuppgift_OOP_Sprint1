public class CarnivorousPlant extends Plants implements HousePlant {

    public CarnivorousPlant(String name, double height) {
        super(name, height, PlantTypesEnum.CARNIVOROUS_PLANT.species, PlantTypesEnum.CARNIVOROUS_PLANT.liquid,
                PlantTypesEnum.CARNIVOROUS_PLANT.dailyIntake(height));
    }

    //här förekommer polymorfism
    @Override
    public String getRequiredLiquid() {return PlantTypesEnum.CARNIVOROUS_PLANT.liquid;}
    @Override
    public double getDailyLiquidIntake() {return PlantTypesEnum.CARNIVOROUS_PLANT.dailyIntake(getHeight());}

}