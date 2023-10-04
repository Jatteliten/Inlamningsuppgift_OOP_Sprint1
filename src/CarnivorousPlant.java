import javax.swing.*;

public class CarnivorousPlant extends Plants implements HousePlant {

    public CarnivorousPlant(String name, double height) {
        super(name, height, PlantTypesAndNeeds.CARNIVOROUS_PLANT.species, PlantTypesAndNeeds.CARNIVOROUS_PLANT.liquid,
                PlantTypesAndNeeds.CARNIVOROUS_PLANT.dailyIntake(height));
    }

    //här förekommer polymorfism
    @Override
    public String getRequiredLiquid() {return PlantTypesAndNeeds.CARNIVOROUS_PLANT.liquid;}
    @Override
    public double getDailyLiquidIntake() {return PlantTypesAndNeeds.CARNIVOROUS_PLANT.dailyIntake(getHeight());}
    @Override
    public void setHeight(double height){
        if (height >= 0){
            super.setHeight(height);
            setLiquidAmount(PlantTypesAndNeeds.CARNIVOROUS_PLANT.dailyIntake(height));
        } else{
            JOptionPane.showMessageDialog(null, "Invalid height");
        }
    }

}