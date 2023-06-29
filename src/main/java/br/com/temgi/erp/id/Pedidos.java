package br.com.temgi.erp.id;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("unused")
public class Pedidos {
    
	@Inject
    private EntityManager manager;
    
    public BigDecimal totalPedidosMesAtual() {
        return new BigDecimal("100");
    }
}