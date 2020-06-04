package motherbird.repository;

import motherbird.databaseManager.DatabaseManager;
import com.j256.ormlite.dao.Dao;
import motherbird.dto.User;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository {
    private final Dao<User, Long> userDao;
    public static UserRepository instance;

    public UserRepository() {
        this.userDao = DatabaseManager.getUserDao();
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = null;
        try {
            users = (ArrayList<User>) userDao.queryForAll();
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return users;
    }
}
