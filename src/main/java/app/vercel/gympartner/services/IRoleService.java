package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.Role;

import java.util.List;

public interface IRoleService {
    void insert(Role role);
    List<Role> list();
    Role listId(int id);
}
