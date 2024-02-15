public class SourDough extends Bread {
    private String ripeStarter;

    public SourDough() {
        super("5.00 cups", "1.50 cups", "2.50 tsps", "Not specified", "Not specified", "1.00 tsp", "Sourdough Bread", "not baked", "See detailed recipe");
        this.ripeStarter = "1.00 cup of ripe sourdough starter";
    }


    public String getSourDoughRecipe() {
        if (getState().equals("baked")) {
            return "I can't bake this, it's already baked my friend!";
        } else {
            return "Ingredients of Sourdough Bread are:\n" + getIngredients() + "\n" + ripeStarter +
                    "\n\nA recipe of Sourdough Bread:\n" +
                    "1. Mix flour, water, salt, yeast, and ripe sourdough starter.\n" +
                    "2. Make the dough\n" +
                    "3. Bulk Rise\n" +
                    "4. Stretch and fold the dough\n" +
                    "5. Cut and shape the dough\n" +
                    "6. Second rise\n" +
                    "7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                    "8. Spray the loaf with lukewarm water.\n" +
                    "9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                    "10. Remove the bread from the oven.\n" +
                    "11. Let the bread cool until good to eat.";
        }
    }



    @Override

    public String getIngredients() {
        return super.getIngredients() + ", Ripe Starter; " + ripeStarter;
    }

    public String getRipeStarter() {
        return ripeStarter;
    }

    public void setRipeStarter(String ripeStarter) {
        this.ripeStarter = ripeStarter;
    }
}
