package com.misiontic.library.repository.crud;

import com.misiontic.library.model.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryCrudRepository  extends CrudRepository<Library,Integer> {
}
