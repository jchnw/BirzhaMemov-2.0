package app.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import app.entities.Users;
import app.utils.DBUtils;
import app.utils.MyUtils;

@WebServlet(urlPatterns = { "/registration" })
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
    }

    // Показать страницу Login.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Forward (перенаправить) к странице /registration

        RequestDispatcher dispatcher //
                = this.getServletContext().getRequestDispatcher("/registration");

        dispatcher.forward(request, response);

    }

    // Когда пользователь вводит userName & password, и нажимает Submit.
    // Этот метод будет выполнен.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
    /*    String rememberMeStr = request.getParameter("rememberMe");
        boolean remember = "Y".equals(rememberMeStr);*/

        Users users = null;
        boolean hasError = false;
        String errorString = null;

        if (login == null || password == null || login.length() == 0 || password.length() == 0) {
            hasError = true;
            errorString = "Required username and password!";
        } else {
            Connection conn = MyUtils.getStoredConnection(request);
            try {
                // Найти users в DB.
                users = DBUtils.findUser(conn, login, password);

                if (users == null) {
                    hasError = true;
                    errorString = "Users Name or password invalid";
                }
            } catch (SQLException e) {
                e.printStackTrace();
                hasError = true;
                errorString = e.getMessage();
            }
        }
        // В случае, если есть ошибка,
        // forward (перенаправить) к /WEB-INF/registration.jsp
        if (hasError) {
            users = new Users();
            users.setLogin(login);
            users.setPassword(password);

            // Сохранить информацию в request attribute перед forward.
            request.setAttribute("errorString", errorString);
            request.setAttribute("users", users);

            // Forward (перенаправить) на главную страницу
            RequestDispatcher dispatcher //
                    = this.getServletContext().getRequestDispatcher("/");

            dispatcher.forward(request, response);
        }
        // В случае, если нет ошибки.
        // Сохранить информацию пользователя в Session.
        // И перенаправить к странице userInfo.
        else {
            // Forward (перенаправить) на главную страницу
            RequestDispatcher dispatcher //
                    = this.getServletContext().getRequestDispatcher("/");

            dispatcher.forward(request, response);
            }

            // Redirect (Перенаправить) на страницу /home.
            response.sendRedirect(request.getContextPath() + "/home");
        }
    }


