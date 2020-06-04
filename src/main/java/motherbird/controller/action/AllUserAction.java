package motherbird.controller.action;

import com.j256.ormlite.dao.Dao;
import motherbird.databaseManager.DatabaseManager;
import motherbird.dto.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class AllUserAction implements Action{
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {

        Dao<User, Long> userDao = DatabaseManager.getUserDao();

        // For test
        userDao.create(new User((long) 1, "jinkyuhan", 26, true, "12341234"));
        userDao.create(new User((long) 2, "hong", 26, true, "12341234"));
        userDao.create(new User((long) 3, "minsu", 26, true, "12341234"));
        userDao.create(new User((long) 4, "jack", 26, true, "12341234"));

        ArrayList<User> users = (ArrayList<User>) userDao.queryForAll();
        req.setAttribute("users", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("userList.jsp");
        dispatcher.forward(req, resp);

    }
}
