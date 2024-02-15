//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bread {


    // *** What are things that make up bread "bread"?
    // *** Things most breads have in common?
    private String flour;
    private String water;
    private String salt;
    private String sugar;
    private String bakingPowder;
    private String yeast;
    private String breadName;
    private String state = "not baked";
    private String recipe;



    // *** particularly THESE ingredients
    public Bread(String s, String string, String s1, String notSpecified, String not_specified, String string1, String sourdoughBread, String notBaked, String seeDetailedRecipe) {

        this.flour = "flour";
        this.water = "water";
        this.salt = "salt";
        this.sugar = "sugar";
        this.bakingPowder = "baking powder";
        this.yeast = "yeast";
        this.breadName = "bread";
        this.state = "baked";
        this.recipe = "recipe";
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(String bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }


    // *** This tells the program how to bake bread
    public void bake() {
        if (!this.state.equals("baked")) {
            this.state = "baked";
        }
    }


    // *** This acquires the ingredients we'll need to make the bread

    public String getIngredients() {
        return String.format("Flour: %s, Water: %s, Salt: %s, Sugar: %s, Baking Powder: %s, Yeast: %s", flour, water, salt, sugar, bakingPowder, yeast);
    }


    @Override
    public String toString() {
        return String.format("Name: %s, State: %s, Recipe: %s", breadName, state, recipe);
    }


}