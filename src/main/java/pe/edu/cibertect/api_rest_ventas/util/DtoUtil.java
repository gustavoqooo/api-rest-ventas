package pe.edu.cibertect.api_rest_ventas.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pe.edu.cibertect.api_rest_ventas.model.dto.DtoEntity;

@Component
public class DtoUtil {
    public DtoEntity convertirADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj, mapper.getClass());
    }
    public Object convertirDtoAEntity(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper, obj.getClass());
    }
}
