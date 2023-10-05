import javax.swing.*;

public abstract class Plants {

    //Här förekommer inkapsling
    private String name;
    private double height;
    private final String species;
    private final String liquid;
    private double liquidAmount;


    public Plants(String name, double height, String species, String liquid, double liquidAmount) {
        this.name = name;
        this.height = height;
        this.species = species;
        this.liquid = liquid;
        this.liquidAmount = liquidAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid height");
        }
    }

    public String getLiquid() {
        return liquid;
    }

    public double getLiquidAmount() {
        return liquidAmount;
    }

    public void setLiquidAmount(double liquidAmount) {
        this.liquidAmount = liquidAmount;
    }

    /**
     * Print how much water a plant needs per day.
     */
    public void print(){
        String print = "The " + getSpecies() + " " + getName() + " needs " + getLiquidAmount() +
                "L of " + getLiquid();

        JOptionPane.showMessageDialog(null, print);
    }

}