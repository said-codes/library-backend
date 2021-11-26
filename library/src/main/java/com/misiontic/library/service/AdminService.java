package com.misiontic.library.service;

import com.misiontic.library.model.Admin;
import com.misiontic.library.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll() {
        return adminRepository.getAll();
    }

    public Optional<Admin> getAdmin(Integer id) {
        return adminRepository.getAdmin(id);
    }

    public Admin save(Admin admin) {
        if (admin.getId() == null) {
            return adminRepository.save(admin);
        } else {
            Optional<Admin> adminAux = adminRepository.getAdmin(admin.getId());
            if (adminAux.isEmpty()) {
                return adminRepository.save(admin);
            } else {
                return admin;
            }
        }
    }
}
