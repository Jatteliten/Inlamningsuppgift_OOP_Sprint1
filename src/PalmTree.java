import javax.swing.*;

public class PalmTree extends Plants implements HousePlant {

    public PalmTree(String name, double height) {
        super(name, height, PlantTypesAndNeeds.PALM_TREE.species, PlantTypesAndNeeds.PALM_TREE.liquid,
                PlantTypesAndNeeds.PALM_TREE.dailyIntake(height));
    }

    //här förekommer polymorfism
    @Override
    public String getRequiredLiquid() { return PlantTypesAndNeeds.PALM_TREE.liquid; }
    @Override
    public double getDailyLiquidIntake() { return PlantTypesAndNeeds.PALM_TREE.dailyIntake(getHeight()); }
    @Override
    public void setHeight(double height){
        if (height >= 0){
            super.setHeight(height);
            setLiquidAmount(PlantTypesAndNeeds.PALM_TREE.dailyIntake(height));
        } else{
            JOptionPane.showMessageDialog(null, "Invalid height");
        }
    }

}