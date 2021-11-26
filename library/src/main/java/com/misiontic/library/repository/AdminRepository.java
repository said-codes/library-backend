package com.misiontic.library.repository;

import com.misiontic.library.model.Admin;
import com.misiontic.library.repository.crud.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {

    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Admin> getAll() {
        return (List<Admin>) adminCrudRepository.findAll();
    }

    public Optional<Admin> getAdmin(Integer id) {
        return adminCrudRepository.findById(id);
    }

    public Admin save(Admin admin) {
        return adminCrudRepository.save(admin);
    }


}
