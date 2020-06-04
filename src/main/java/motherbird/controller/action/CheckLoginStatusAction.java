package motherbird.controller.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class CheckLoginStatusAction implements Action{

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        HttpSession session = req.getSession();
//        boolean isLogin = (boolean) session.getAttribute("isLogin");
        boolean isLogin = true;
        System.out.println("Login Status: " + isLogin);// For DEBUG
        RequestDispatcher dispatcher;
        if (isLogin){
            resp.sendRedirect("/allUser.do");
        } else {
//            dispatcher = req.getRequestDispatcher("/login.jsp");
            resp.sendRedirect("/login.jsp");
        }
    }
}
