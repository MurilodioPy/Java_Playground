/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imutabilidade;

import java.util.Date;

/**
 *
 * @author eduardoasilvestre
 */
public class DProduto {
    private Integer codigo;       // imutavel
    private String descricao;     // imutavel
    private Date dataExpiracao;   // mutavel

    public DProduto criarCopiaDefensiva() {
        DProduto produto = new DProduto();
        produto.codigo = this.codigo;
        produto.descricao = this.descricao;
        produto.dataExpiracao = (Date) this.dataExpiracao.clone();
        return produto;
    }
}
