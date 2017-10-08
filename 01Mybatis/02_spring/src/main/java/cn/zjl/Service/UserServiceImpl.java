package cn.zjl.Service;

import cn.zjl.DAO.UserDAO;
import cn.zjl.DAO.UserDAOImpl;

public class UserServiceImpl implements UserService {
    private UserDAO dao;

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    public void doSome() {
        dao.doSome();
    }
}