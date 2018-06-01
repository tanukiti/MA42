package local.hal.ma42.androidjava.lesson5.ex01;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cooktail {
    private class Ingredient {
        private double _price;

        private String _name;

        private int _quantity;


        public Ingredient(String name, double price, int quantity) {
            _name = name;
            _price = price;
            _quantity = quantity;
        }

        public int getCost() {
            BigDecimal bigCost = new BigDecimal(_price * _quantity);
            bigCost = bigCost.setScale(0, BigDecimal.ROUND_HALF_EVEN);
            return bigCost.intValue();
        }
    }
    private ArrayList<Ingredient> _ingredients = new ArrayList<Ingredient>();

    private String _name;

    public Cooktail(String name) {
        _name = name;
    }

    public void addIngredient(String name, double price, int quantity) {
        Ingredient ingredient = new Ingredient(name, price, quantity);
        _ingredients.add(ingredient);
    }

    public String getRecipe() {
        StringBuffer sb = new StringBuffer();
        sb.append(_name);
        sb.append("のレシピ:\n");
        for(Ingredient ing : _ingredients) {
            sb.append(ing._name);
            sb.append(": ");
            sb.append(ing._quantity);
            sb.append("mm\t");
        }
        return sb.toString();
    }

    public int getCost() {
        int cost = 0;
        for(Ingredient ing : _ingredients) {
            cost += ing.getCost();
        }
        return cost;
    }
}
