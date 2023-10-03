public class PalmTree extends Plants implements HousePlant {

    public PalmTree(String name, double height) {
        super(name, height, PlantTypesEnum.PALM_TREE.species, PlantTypesEnum.PALM_TREE.liquid,
                PlantTypesEnum.PALM_TREE.dailyIntake(height));
    }

    //här förekommer polymorfism
    @Override
    public String getRequiredLiquid() { return PlantTypesEnum.CACTUS.liquid; }
    @Override
    public double getDailyLiquidIntake() { return PlantTypesEnum.PALM_TREE.dailyIntake(getHeight()); }

}