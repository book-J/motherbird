package motherbird.service;

import com.j256.ormlite.dao.Dao;
import motherbird.databaseManager.DatabaseManager;
import motherbird.dto.Team;
import motherbird.dto.User;

import java.sql.SQLException;

public class UserService {

    public void makeNewUser(Long id, String name) {
        Dao<User, Long> dao = DatabaseManager.getUserDao();
        try {
            dao.create(new User(
                id,
                name
            ));
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }


    public void joinTeam(User user, Team team) {

    }
}

