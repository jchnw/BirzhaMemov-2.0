package app.filter;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import app.utils.MyUtils;
import app.utils.ConnectionUtil;

@WebFilter(urlPatterns = { "/*" })
public class JDBCFilter implements Filter {

    public JDBCFilter() {
    }


    public void init(FilterConfig fConfig) throws ServletException {

    }


    public void destroy() {

    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        //
        String servletPath = req.getServletPath();

        // Открыть Connection (соединение) только для request со специальной ссылкой
        // (Например ссылка к servlet, jsp, ..)
        // Избегать открытие Connection для обычноых запросов
        // (Например image, css, javascript,... )
        if (servletPath.contains("/specialPath1") || servletPath.contains("/specialPath2")) {
            Connection conn = null;
            try {
                // Создать объект Connection подключенный к database.
                conn = ConnectionUtil.getConnection();
                // Настроить автоматически commit = false, чтобы активно контролировать.
                conn.setAutoCommit(false);

                // Сохранить в атрибут (attribute) в request.
                MyUtils.storeConnection(request, conn);

                // Разрешить request продвигаться дальше (Пройти этот Filter).
                chain.doFilter(request, response);

                // Вызвать commit() чтобы завершить транзакцию (transaction) с DB.
                conn.commit();
            } catch (Exception e) {
                ConnectionUtil.rollbackQuietly(conn);
                throw new ServletException();
            } finally {
                ConnectionUtil.closeQuietly(conn);
            }
        }
        // Для обычных request.
        else {
            // Разрешить request продвигаться дальше (Пройти этот Filter).
            chain.doFilter(request, response);
        }

    }

}