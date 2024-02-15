public class Cookies  extends Bread{

    private String chocolateChips;
    private String brownSugar;


    public Cookies() {
        super("2.25 cups", "1 cup", "1 tsp", "3/4 cup", "2 tbsp", "1 tsp", "Cookies", "not baked", "See detailed recipe");
        this.chocolateChips = "2 cups";
        this.brownSugar = "3/4 cup";

    }

    public Cookies(String flour, String water, String salt, String sugar, String oil, String yeast, String breadName, String state, String recipe, String chocolateChips, String brownSugar) {
        super(flour, water, salt, sugar, oil, yeast, breadName, state, recipe);
        this.chocolateChips = chocolateChips;
        this.brownSugar = brownSugar;
    }

    public String getChocolateChips() {
        return chocolateChips;
    }

    public void setChocolateChips(String chocolateChips) {
        this.chocolateChips = chocolateChips;
    }

    public String getBrownSugar() {
        return brownSugar;
    }

    public void setBrownSugar(String brownSugar) {
        this.brownSugar = brownSugar;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Chocolate Chips; " + chocolateChips + ", Brown Sugar; " + brownSugar;
    }

    public String getCookiesRecipe() {
        if (getState().equals("baked")) {
            return "I can't bake these, they're already baked!";
        } else {
            return "Ingredients of Cookies are:\n" + getIngredients() +
                    "\n\nA recipe of Cookies:\n" +
                    "1. Cream together butter, brown sugar, and sugar.\n" +
                    "2. Beat in eggs and vanilla until fluffy.\n" +
                    "3. Mix in the dry ingredients until combined.\n" +
                    "4. Fold in the chocolate chips.\n" +
                    "5. Drop by spoonfuls onto baking sheets.\n" +
                    "6. Bake at 375°F for 8-10 minutes or until golden brown.\n" +
                    "7. Let them cool before serving.";
        }
    }
}
