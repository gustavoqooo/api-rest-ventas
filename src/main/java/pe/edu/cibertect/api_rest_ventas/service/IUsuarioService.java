package pe.edu.cibertect.api_rest_ventas.service;

import pe.edu.cibertect.api_rest_ventas.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
