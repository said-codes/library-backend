package com.misiontic.library.repository.crud;

import com.misiontic.library.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
}
