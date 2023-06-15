package app.vercel.gympartner.services;

import app.vercel.gympartner.entities.User;

import java.util.List;

public interface IUserService {
    List<User> list();
}
