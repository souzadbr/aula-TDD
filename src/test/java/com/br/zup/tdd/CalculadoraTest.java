package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testarSomaDeDoisNumerosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 2);

        Assert.assertEquals(4, resultado);
    }

    @Test
    public void testarSomaDeUmNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, -4);

        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testarSomaDeDoisNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(-2, -4);

        Assert.assertEquals(-6, resultado);
    }

    @Test
    public void testarSubtrairDeDoisNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(-2, -2);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void testarSubtrairDeDoisNumerosPositivosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(2, 2);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void testarDividirDeDoisNumerosPositivosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(4, 2);

        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testarDividirDeDoisNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(-4, -2);

        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testarMultiplicarDeDoisNumerosPositivosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 2);

        Assert.assertEquals(8, resultado);
    }

    @Test
    public void testarMultiplicarDeDoisNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(-2, -2);

        Assert.assertEquals(4, resultado);
    }



}
