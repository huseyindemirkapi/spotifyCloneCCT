package com.example.musicAll.Repository;

import com.example.musicAll.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
//    Role findByName(String roleName);

    Role findByRoleType(String roleName);
}
