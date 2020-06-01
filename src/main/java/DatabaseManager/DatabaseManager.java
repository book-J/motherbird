package DatabaseManager;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import motherbird.dto.User;

import java.sql.SQLException;

public class DatabaseManager {
    private final static String DB_NAME = "motherbird.db"; // Enter your DB NAME
    private static Dao<User, Long> userDao;

    public static Dao<User, Long> getUserDao() {
        if (userDao == null) {
            try {
                ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:sqlite:" + DB_NAME); // DB file is in $USER/.gradle/{gradle-version}/
                userDao = DaoManager.createDao(connectionSource, User.class);

//Erase All Tables For DEBUG
TableUtils.dropTable(connectionSource, User.class,true);

                TableUtils.createTableIfNotExists(connectionSource, User.class);
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
        return userDao;
    }
}
