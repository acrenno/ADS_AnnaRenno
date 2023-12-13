package Avançado;

public class Produto {

    private Long id;

    private String descricao;

    private double preço;

    public Produto(Long id, String descricao, double preço) {
        this.id = id;
        this.descricao = descricao;
        this.preço = preço;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preço=" + preço +
                '}';
    }

}
