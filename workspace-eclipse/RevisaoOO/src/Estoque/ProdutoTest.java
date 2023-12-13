package Estoque;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class ProdutoTest{



    @Test
    void testeProdutoComoJavaBean()
    {
        Produto p = new Produto();
        p.setDescricao("QUEIJO 1kg");
        p.setValorCompra(5.00);
        p.setDataValidade(LocalDate.of(2028, Month.NOVEMBER, 22));

        System.out.println("Dados do produto");
        System.out.println(p.getDescricao());
        System.out.println(p.getValorCompra());
        System.out.println(p.getDataValidade());


    }

}



