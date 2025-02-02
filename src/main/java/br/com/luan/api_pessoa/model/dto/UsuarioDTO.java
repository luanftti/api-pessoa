package br.com.luan.api_pessoa.model.dto;

import br.com.luan.api_pessoa.abstracts.BaseDTO;
import br.com.luan.api_pessoa.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO extends BaseDTO<Usuario> {
    private Long id;
    private String login;

    @Override
    public Usuario toEntity() {
        return BaseDTO.buildEntity(this);
    }

    @Override
    protected BaseDTO<Usuario> fromEntity(Usuario entity) {
        try {
            return BaseDTO.buildFromEntity(entity, UsuarioDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

}
