package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.Users;

import java.util.List;

public interface IUsersService {
    public void insert(Users gU);
    public List<Users> list();
}
