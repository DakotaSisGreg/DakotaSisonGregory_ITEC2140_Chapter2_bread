public class Cake extends Bread{

    private String frostingType;
    private String cakeFlavor;

    public Cake() {
        super("2 cups", "1 cup (milk)", "0.5 tsp", "1.5 cups (sugar)", "0.5 cup (oil)", "Not applicable", "Cake", "not baked", "See detailed recipe");
        this.frostingType = "Vanilla";
        this.cakeFlavor = "Chocolate";
    }

    public Cake(String flour, String milk, String salt, String sugar, String oil, String breadName, String state, String recipe, String frostingType, String cakeFlavor) {
        super(flour, milk, salt, sugar, oil, "Not applicable", breadName, state, recipe);
        this.frostingType = frostingType;
        this.cakeFlavor = cakeFlavor;
    }

    public String getFrostingType() {
        return frostingType;
    }

    public void setFrostingType(String frostingType) {
        this.frostingType = frostingType;
    }

    public String getCakeFlavor() {
        return cakeFlavor;
    }

    public void setCakeFlavor(String cakeFlavor) {
        this.cakeFlavor = cakeFlavor;
    }

    public String getIngredients() {
        // Assuming getIngredients in Bread class returns a String
        return super.getIngredients() + ", Frosting Type: " + frostingType + ", Cake Flavor: " + cakeFlavor;
    }

    public String getCakeRecipe() {
        if (getState().equals("baked")) {
            return "The cake is already baked!";
        } else {
            return "Ingredients of Cake are:\n" + getIngredients() +
                    "\n\nA recipe of Cake:\n" +
                    "1. Mix the dry ingredients including flour, sugar, and salt.\n" +
                    "2. Mix in the wet ingredients including milk and oil.\n" +
                    "3. Pour the batter into a cake pan.\n" +
                    "4. Bake at 350°F for 30 minutes or until a toothpick inserted comes out clean.\n" +
                    "5. Let the cake cool before applying frosting.";
        }
    }

}
