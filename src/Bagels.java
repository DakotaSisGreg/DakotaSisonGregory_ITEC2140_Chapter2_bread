public class Bagels extends Bread {

    private String maltSyrup;
    private String barleyFlour;


    public Bagels() {
        super("4.00 cups", "1.25 cups", "1.00 tsp", "Not specified", "Not specified", "2.00 tsp", "Bagels", "not baked", "See detailed recipe");
        this.maltSyrup = "2.00 tbsp";
        this.barleyFlour = "0.50 cup";
    }

    public Bagels(String flour, String water, String salt, String sugar, String oil, String yeast, String breadName, String state, String recipe, String maltSyrup, String barleyFlour) {
        super(flour, water, salt, sugar, oil, yeast, breadName, state, recipe);
        this.maltSyrup = maltSyrup;
        this.barleyFlour = barleyFlour;
    }


    public String getMaltSyrup() {
        return maltSyrup;
    }

    public void setMaltSyrup(String maltSyrup) {
        this.maltSyrup = maltSyrup;
    }

    public String getBarleyFlour() {
        return barleyFlour;
    }

    public void setBarleyFlour(String barleyFlour) {
        this.barleyFlour = barleyFlour;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Malt Syrup; " + maltSyrup + ", Barley Flour; " + barleyFlour;
    }

    public String getBagelsRecipe() {
        if (getState().equals("baked")) {
            return "I can't bake this, it's already baked!";
        } else {
            return "Ingredients of Bagels are:\n" + getIngredients() +
                    "\n\nA recipe of Bagels:\n" +
                    "1. Mix flour, water, salt, yeast, malt syrup, and barley flour.\n" +
                    "2. Make the dough\n" +
                    "3. Put em in the oven!";
        }
    }
}

