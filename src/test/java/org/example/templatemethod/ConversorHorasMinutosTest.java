package org.example.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorHorasMinutosTest {
    @Test
    void deveRetonarConversaoSucesso() {
        ConversorHorasMinutos conversorUnidades = new ConversorHorasMinutos();
        conversorUnidades.setValor1(10.0f);
        assertEquals("Conversão feita com sucesso!", conversorUnidades.verificarConversao());
    }

    @Test
    void deveRetonarConversaoFalha() {
        ConversorHorasMinutos conversorUnidades = new ConversorHorasMinutos();
        conversorUnidades.setValor1(0.0f);
        assertEquals("Não foi possível realizar a conversão", conversorUnidades.verificarConversao());
    }

    @Test
    void deveRetornarInformacoes() {
        ConversorHorasMinutos conversorUnidades = new ConversorHorasMinutos();
        conversorUnidades.setValor1(0.0f);
        conversorUnidades.setNome("ConversorMinutos");
        assertEquals("ConversorMinutos{nome='ConversorMinutos', resultado=Não foi possível realizar a conversão}", conversorUnidades.getInfo());
    }
}