package com.misiontic.library.repository;

import com.misiontic.library.model.Library;
import com.misiontic.library.repository.crud.LibraryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {
    @Autowired
    private LibraryCrudRepository libraryCrudRepository;

    public List<Library> getAll() {
        return (List<Library>) libraryCrudRepository.findAll();
    }

    public Optional<Library> getLibrary(Integer id) {
        return libraryCrudRepository.findById(id);
    }

    public Library save(Library library) {
        return libraryCrudRepository.save(library);
    }
}
