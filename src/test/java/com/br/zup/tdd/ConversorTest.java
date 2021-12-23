package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

    @Test
    public void testarMetodoDeConversaoNumerosRomanos(){
        String resultado = new Conversor().converterParaNumeroRoman(5478);

        Assert.assertEquals("VCDLXXVIII",resultado);
    }

    @Test
    public void testarMetodoDeConversaoNumerosCaminhoNegativo(){
        Assert.assertThrows(RuntimeException.class, ()->{new Conversor().converterParaNumeroRoman(-5478);
        });

        //lambda execulta o codigo de maneira isolada. Primeiro o que esperamos, no caso a exception e depois
        //o que vai ser execultado
    }
}
