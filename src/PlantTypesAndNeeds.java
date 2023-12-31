enum PlantTypesAndNeeds {
    PALM_TREE("Palm tree", "tap water"){
        @Override
        public double dailyIntake(double height){ return rounding(height*0.5); }
    },
    CACTUS("Cactus", "mineral water"){
        @Override
        public double dailyIntake(double height){
            return 0.2;
        }
    },
    CARNIVOROUS_PLANT("Carnivorous plant", "protein"){
        @Override
        public double dailyIntake(double height){ return rounding(0.1 + (height * 0.2)); }
    };

    public final String species;
    public final String liquid;

    PlantTypesAndNeeds(String species, String liquid){
        this.species = species;
        this.liquid = liquid;
    }

    public abstract double dailyIntake(double height);

    public double rounding(double inputValue){
        return (double) Math.round(inputValue * 100d) / 100d;
    }

}