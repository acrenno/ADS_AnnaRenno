<<<<<<< HEAD
package Builder.Pizzaria;

public class PizzariaBuilder {
    private Pizza pizza = new Pizza();


    public PizzariaBuilder addCheese() {
        pizza.setFlagCheese(true);
        return this;
    }

    public PizzariaBuilder addPeperoni() {
        pizza.setFlagPeperoni(true);
        return this;
    }

    public PizzariaBuilder defineSize(Integer s) {
        pizza.setSize(s);
        return this;
    }

    private void validarIngredients() {
        if(!pizza.getFlagCheese() && !pizza.getFlagPeperoni())
            throw new IllegalStateException("Não foi adicionado nenhum ingrediente");
    }

    private void validateSize() {
        if(pizza.getSize() < 1 || pizza.getSize() > 3)
            throw new IllegalStateException("Tamanho inválido (deve ser 1, 2 ou 3)");
    }

    public Pizza getPizza() {
        validateSize();
        validarIngredients();
        return pizza;
    }
=======
package Builder.Pizzaria;

public class PizzariaBuilder {
    private Pizza pizza = new Pizza();


    public PizzariaBuilder addCheese() {
        pizza.setFlagCheese(true);
        return this;
    }

    public PizzariaBuilder addPeperoni() {
        pizza.setFlagPeperoni(true);
        return this;
    }

    public PizzariaBuilder defineSize(Integer s) {
        pizza.setSize(s);
        return this;
    }

    private void validarIngredients() {
        if(!pizza.getFlagCheese() && !pizza.getFlagPeperoni())
            throw new IllegalStateException("Não foi adicionado nenhum ingrediente");
    }

    private void validateSize() {
        if(pizza.getSize() < 1 || pizza.getSize() > 3)
            throw new IllegalStateException("Tamanho inválido (deve ser 1, 2 ou 3)");
    }

    public Pizza getPizza() {
        validateSize();
        validarIngredients();
        return pizza;
    }
>>>>>>> c17b67154066372b0d93a1c33ab5f0ad1ae08856
}