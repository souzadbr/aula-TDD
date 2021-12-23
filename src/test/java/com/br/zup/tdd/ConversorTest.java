package com.br.zup.tdd;

import org.junit.Assert;

public class Conversor {

    public void testarMetodoDeConversaoNumerosRomanos(){
        String resultado = new Conversor().converterParaNumeroRoman(5478);

        Assert.assertEquals("VCDLXXVIII",resultado);
    }
}
