package br.com.livedeploy.service.mapper;


import br.com.livedeploy.domain.*;
import br.com.livedeploy.service.dto.ProdutoDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Produto} and its DTO {@link ProdutoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ProdutoMapper extends EntityMapper<ProdutoDTO, Produto> {



    default Produto fromId(Long id) {
        if (id == null) {
            return null;
        }
        Produto produto = new Produto();
        produto.setId(id);
        return produto;
    }
}
