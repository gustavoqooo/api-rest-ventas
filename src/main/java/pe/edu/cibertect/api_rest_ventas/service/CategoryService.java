package pe.edu.cibertect.api_rest_ventas.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertect.api_rest_ventas.model.bd.Category;
import pe.edu.cibertect.api_rest_ventas.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryService implements ICategoryService {
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> listarCategorias(){
        return categoryRepository.findAll();
    }
    @Override
    public Category guardarCategoria(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Optional<Category> obtenerCategoriaxId(Integer id) {

        Optional<Category> category
                = categoryRepository.findById(id);
        if(category.isEmpty()){
            return Optional.empty();
        }
        return category;
    }
}
