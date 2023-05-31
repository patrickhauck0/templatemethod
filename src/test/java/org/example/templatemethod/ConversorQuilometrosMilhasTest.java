package org.example.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorQuilometrosMilhasTest {
    @Test
    void deveRetonarConversaoSucesso() {
        ConversorQuilometrosMilhas conversorUnidades = new ConversorQuilometrosMilhas();
        conversorUnidades.setValor1(10.0f);
        conversorUnidades.setValor2(0.621371f);
        assertEquals("Conversão feita com sucesso!", conversorUnidades.verificarConversao());
    }

    @Test
    void deveRetonarConversaoFalha() {
        ConversorQuilometrosMilhas conversorUnidades = new ConversorQuilometrosMilhas();
        conversorUnidades.setValor1(10.0f);
        conversorUnidades.setValor2(0.0f);
        assertEquals("Não foi possível realizar a conversão", conversorUnidades.verificarConversao());
    }

    @Test
    void deveRetornarInformacoes() {
        ConversorQuilometrosMilhas conversorUnidades = new ConversorQuilometrosMilhas();
        conversorUnidades.setValor1(10.0f);
        conversorUnidades.setValor2(0.0f);
        conversorUnidades.setNome("ConversorMilhas");
        assertEquals("ConversorMilhas{nome='ConversorMilhas', resultado=Não foi possível realizar a conversão}", conversorUnidades.getInfo());
    }
}