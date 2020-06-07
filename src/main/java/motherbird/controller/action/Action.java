package motherbird.controller.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface Action {
    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException, SQLException;
}
