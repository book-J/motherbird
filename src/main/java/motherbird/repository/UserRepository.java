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

        // for test
        try {
            userDao.create(new User((long)1, "jinkyuhan"));
            userDao.create(new User((long)2, "kangbinlee"));
            userDao.create(new User((long)3, "bookjang"));
            userDao.create(new User((long)4, "comebackhwang"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
