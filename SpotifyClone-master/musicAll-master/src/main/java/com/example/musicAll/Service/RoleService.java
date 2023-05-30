package com.example.musicAll.Service;

import com.example.musicAll.Model.Role;

import java.util.List;

public interface RoleService {
    public Role createRole(Role newRole);

    public Role getRole(String roleType);

    public List<Role> listRoles();
}
