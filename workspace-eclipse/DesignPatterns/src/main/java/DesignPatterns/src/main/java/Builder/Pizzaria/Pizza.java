package Builder.Pizzaria;

public class Pizza {
    private Integer size = 0;

    private Boolean flagCheese = false;

    private Boolean flagPeperoni = false;

    //acessores...

    public Integer getSize() {
        return size;
    }

    public Boolean getFlagCheese() {
        return flagCheese;
    }

    public Boolean getFlagPeperoni() {
        return flagPeperoni;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setFlagCheese(Boolean flagCheese) {
        this.flagCheese = flagCheese;
    }

    public void setFlagPeperoni(Boolean flagPeperoni) {
        this.flagPeperoni = flagPeperoni;
    }
}