public class CoffeeCake extends Bread{

    private String streuselTopping;
    private String coffeeFlavor;


    public CoffeeCake() {
        super("3 cups", "1 cup (milk)", "1 tsp", "2 cups (sugar)", "0.75 cup (oil)", "Not applicable", "Coffee Cake", "not baked", "See detailed recipe");
        this.streuselTopping = "Crumbly streusel";
        this.coffeeFlavor = "Rich coffee";
    }


    public CoffeeCake(String flour, String milk, String salt, String sugar, String oil, String breadName, String state, String recipe, String streuselTopping, String coffeeFlavor) {
        super(flour, milk, salt, sugar, oil, "Not applicable", breadName, state, recipe);
        this.streuselTopping = streuselTopping;
        this.coffeeFlavor = coffeeFlavor;
    }


    public String getStreuselTopping() {
        return streuselTopping;
    }

    public void setStreuselTopping(String streuselTopping) {
        this.streuselTopping = streuselTopping;
    }

    public String getCoffeeFlavor() {
        return coffeeFlavor;
    }

    public void setCoffeeFlavor(String coffeeFlavor) {
        this.coffeeFlavor = coffeeFlavor;
    }

    @Override
    public String getIngredients() {
        // Assuming getIngredients in Bread class returns a String
        return super.getIngredients() + ", Streusel Topping: " + streuselTopping + ", Coffee Flavor: " + coffeeFlavor;
    }

    public String getCoffeeCakeRecipe() {
        if (getState().equals("baked")) {
            return "The coffee cake is already baked!";
        } else {
            return "Ingredients of Coffee Cake are:\n" + getIngredients() +
                    "\n\nA recipe of Coffee Cake:\n" +
                    "1. Prepare the cake batter as per the Coffee Cake recipe.\n" +
                    "2. Mix in the coffee flavor into the batter.\n" +
                    "3. Sprinkle the streusel topping over the batter before baking.\n" +
                    "4. Bake at 350°F for 35-45 minutes or until a toothpick inserted comes out clean.\n" +
                    "5. Allow the coffee cake to cool before serving.";
        }
    }
}
