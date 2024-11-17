package model.dao;

import model.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private static BoardDao boardDao = new BoardDao();
    public BoardDao () {}
    public static BoardDao getInstance(){
        return boardDao;
    }
    public List<UserDto>  userDtos = new ArrayList<>();
}
