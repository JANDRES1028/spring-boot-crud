package com.dev.security.service;

import com.dev.security.entity.Role;
import com.dev.security.enums.RoleName;
import com.dev.security.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRoleName(RoleName roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    public void save(Role role) {
        roleRepository.save(role);
    }
}
