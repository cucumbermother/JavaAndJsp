package model.dao;

import model.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static UserDao userDao = new UserDao();
    private UserDao(){}
    public static UserDao getInstance(){
        return userDao;
    }
    public List<UserDto> users = new ArrayList<>();
}
