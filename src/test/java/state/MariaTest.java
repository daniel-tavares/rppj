package strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MariaTest {

    @Test
    public void mariaPequenaPegaFlorDeGelo() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarFlorDeGelo();
        assertEquals(EstadoMaria.FLOR_DE_GELO, maria.getEstadoAtual());
    }

    @Test
    public void mariaPequenaPegaEstrela() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarEstrela();
        assertEquals(EstadoMaria.ESTRELA, maria.getEstadoAtual());
    }

    @Test
    public void mariaPequenaLevaDano() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.levarDano();
        assertEquals(EstadoMaria.MORTA, maria.getEstadoAtual());
    }

    @Test
    public void mariaFlorDeGeloPegaFlorDeGelo() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarFlorDeGelo();
        maria.pegarFlorDeGelo();
        assertEquals(EstadoMaria.FLOR_DE_GELO, maria.getEstadoAtual());
    }

    @Test
    public void mariaFlorDeGeloPegaEstrela() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarFlorDeGelo();
        maria.pegarEstrela();
        assertEquals(EstadoMaria.ESTRELA, maria.getEstadoAtual());
    }

    @Test
    public void mariaFlorDeGeloLevaDano() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarFlorDeGelo();
        maria.levarDano();
        assertEquals(EstadoMaria.PEQUENA, maria.getEstadoAtual());
    }

    @Test
    public void mariaEstrelaPegaFlorDeGelo() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarEstrela();
        maria.pegarFlorDeGelo();
        assertEquals(EstadoMaria.ESTRELA, maria.getEstadoAtual());
    }

    @Test
    public void mariaEstrelaPegaEstrela() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarEstrela();
        maria.pegarEstrela();
        assertEquals(EstadoMaria.ESTRELA, maria.getEstadoAtual());
    }

    @Test
    public void mariaEstrelaLevaDano() throws Exception {
        strategy.Maria maria = new strategy.Maria();
        maria.pegarEstrela();
        maria.levarDano();
        assertEquals(EstadoMaria.ESTRELA, maria.getEstadoAtual());
    }
}