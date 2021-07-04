package fr.formation.chefdoeuvre.services;

import org.springframework.stereotype.Service;

import fr.formation.chefdoeuvre.domain.dtos.CategoryCreate;
import fr.formation.chefdoeuvre.domain.entities.Category;
import fr.formation.chefdoeuvre.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepo;

    public CategoryServiceImpl(CategoryRepository categoryRepo) {
	this.categoryRepo = categoryRepo;
    }

    @Override
    public void createCategory(CategoryCreate dto) {

	Category entity = new Category();

	entity.setCategoryName(dto.getCategoryName());
	entity.setCategoryDescription(dto.getCategoryDescription());
	entity.setCategoryPrice(dto.getCategoryPrice());

	categoryRepo.save(entity);

    }

}
