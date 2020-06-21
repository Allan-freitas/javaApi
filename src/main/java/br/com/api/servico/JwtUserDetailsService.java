package br.com.api.servico;

import br.com.api.dominio.Usuario;
import br.com.api.dto.UsuarioDTO;
import br.com.api.repositorio.UsuarioRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("foo", "foo", new ArrayList<>());
/*        Usuario usuario = usuarioRepository.findByUsername(username);
        if (usuario == null)
            throw new UsernameNotFoundException(username);
        return modelMapper.map(usuario, UsuarioDTO.class);*/
    }

    public void save(UsuarioDTO usuarioDTO) {
        usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));
    }
}
