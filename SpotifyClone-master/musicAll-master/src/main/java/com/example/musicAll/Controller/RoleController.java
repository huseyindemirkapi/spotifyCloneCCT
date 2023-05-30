package com.example.musicAll.Controller;

import com.example.musicAll.Model.Role;
import com.example.musicAll.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/{rolename}")
    public Role getRole(@PathVariable String rolename) {
        return roleService.getRole(rolename);
    }

    @PostMapping("/create")
    public Role createRole(@RequestBody Role newRole){
        return roleService.createRole(newRole);
    }

    @GetMapping("/list")
    public List<Role> listRoles(){
        return roleService.listRoles();
    }

//    @DeleteMapping("/delete/{roleId}")
//    public List<Role> deleteRole(@RequestBody Role toRemoveRole){
//        return roleService.findAll();
//    }

}
