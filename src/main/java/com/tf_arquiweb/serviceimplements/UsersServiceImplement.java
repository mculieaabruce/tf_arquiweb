package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.Users;
import com.tf_arquiweb.repositories.IUsersRepository;
import com.tf_arquiweb.serviceinterfaces.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {
    @Autowired
    private IUsersRepository uR;
    @Override
    public void insert(Users gU) {
        uR.save(gU);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }
}
