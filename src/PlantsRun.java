import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PlantsRun {
    private int continueRunningCheck;
    private boolean runProgram = true;
    private final List <Plants> dayCarePlantsList = new ArrayList<>();

    void run(){
        initializeDayCarePlantsList();

        while(runProgram){
            if(continueRunningCheck == JOptionPane.YES_OPTION){
                choice();
                continueRunningCheck = JOptionPane.showConfirmDialog(null,
                        "Would you like to look up another plant?", "continue?", JOptionPane.YES_NO_OPTION);
            }else{
                runProgram = false;
            }
        }
    }

    private void initializeDayCarePlantsList(){
        Cactus plant1 = new Cactus("Igge", 0.2);
        PalmTree plant2 = new PalmTree("Laura",  5);
        CarnivorousPlant plant3 = new CarnivorousPlant("Meatloaf", 0.7);
        PalmTree plant4 = new PalmTree("Olof",  1);

        dayCarePlantsList.add(plant1);
        dayCarePlantsList.add(plant2);
        dayCarePlantsList.add(plant3);
        dayCarePlantsList.add(plant4);
    }

    /**
     * Ask user which plant they want to water.
     * Check if the user inputs plants that are actually at the daycare.
     */
    private void choice(){
        String choice = JOptionPane.showInputDialog(null, "What plants needs food?");
        boolean plantFound = false;

        if(choice != null) {
            for (Plants plants : dayCarePlantsList) {
                if (choice.equalsIgnoreCase(plants.getName())) {
                    plants.print();
                    plantFound = true;
                }
            }
        }
        if (!plantFound){
            JOptionPane.showMessageDialog(null,
                    "Please input a plant that currently exists in the daycare");
        }
    }
}
