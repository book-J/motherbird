package motherbird.controller;

import motherbird.controller.action.Action;
import motherbird.controller.action.ActionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doAction(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    private void doAction(HttpServletRequest req, HttpServletResponse resp) {

        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        String command = requestURI.substring(contextPath.length());

        ActionFactory actionFactory = ActionFactory.getInstance();
        Action action = actionFactory.getAction(command);
        if (action != null) {
            try {
                System.out.println(action.getClass().toString() + " called"); // DEBUG
                action.execute(req, resp);
            } catch (ServletException | IOException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
