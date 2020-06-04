package motherbird.databaseManager;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import motherbird.dto.*;

import java.sql.SQLException;

public class DatabaseManager {
    private final static String DB_NAME = "motherbird.db"; // Enter your DB NAME
    private static ConnectionSource connectionSource;
    private static Dao<User, Long> userDao;
    private static Dao<Team, Long> teamDao;
    private static Dao<Pick, Long> pickDao;
    private static Dao<Join, Long> joinDao;
    private static Dao<Activity, Long> activityDao;


    static {
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:" + DB_NAME);
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    public static Dao<User, Long> getUserDao() {
        if (userDao == null) {
            try {
                userDao = DaoManager.createDao(connectionSource, User.class);
                TableUtils.dropTable(connectionSource, User.class,true);
                TableUtils.createTableIfNotExists(connectionSource, User.class);
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
        return userDao;
    }

    public static Dao<Team, Long> getTeamDao() {
        if (teamDao == null) {
            try {
                teamDao = DaoManager.createDao(connectionSource, Team.class);
                TableUtils.dropTable(connectionSource, Team.class,true);
                TableUtils.createTableIfNotExists(connectionSource, Team.class);
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
        return teamDao;
    }

    public static Dao<Activity, Long> getActivityDao() {
        if (activityDao == null) {
            try {
                activityDao = DaoManager.createDao(connectionSource, Activity.class);
                TableUtils.dropTable(connectionSource, Activity.class,true);
                TableUtils.createTableIfNotExists(connectionSource, Activity.class);
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
        return activityDao;
    }


    public static Dao<Join, Long> getJoinDao() {
        if (joinDao == null) {
            try {
                joinDao = DaoManager.createDao(connectionSource, Join.class);
                TableUtils.dropTable(connectionSource, Join.class,true);
                TableUtils.createTableIfNotExists(connectionSource, Join.class);
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
        return joinDao;
    }

    public static Dao<Pick, Long> getPickDao() {
        if (pickDao == null) {
            try {
                pickDao = DaoManager.createDao(connectionSource, Pick.class);
                TableUtils.dropTable(connectionSource, Pick.class,true);
                TableUtils.createTableIfNotExists(connectionSource, Pick.class);
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
        return pickDao;
    }

}
