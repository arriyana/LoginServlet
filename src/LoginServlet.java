import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{

    private final static String USER_LOGIN = "user";
    private final static String USER_PASS = "user";
    private final static String TITLE = "Login";
    private final static String SUCCESS = "Welcome";
    private final static String FAIL = "Incorrect username or password";
    private final static String LOGIN_LABEL = "Login";
    private final static String PASS_LABEL = "Password";
    private final static String OK_BUTTON = "Ok";
    private final static String CSS_FILE = "style.css";

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        PrintWriter pw = resp.getWriter();
        pw.println("<html>" +
                "<head>" +
                "    <title> "+TITLE+" </title>" +
                "    <link rel='stylesheet' href='" + CSS_FILE + "' type='text/css'>" +
                "</head>" +
                "<body>" +
                "<div class='labels'>" +
                "<form method='POST'>" +
                "    <div class='form-group'>" +
                "        <label for='login'><h2>"+ LOGIN_LABEL +"</h2></label>" +
                "        <input required='required' type='text' name='login' id='login'>" +
                "    </div>" +
                "    <div class='form-group'>" +
                "        <label for='password'><h2>"+PASS_LABEL+"<h2></label>" +
                "        <input required='required' type='password' name='password' id='password'>" +
                "    </div>" +
                "    <button type='submit' class='loginbutton'>"+OK_BUTTON+"</button>" +
                "</form>" +
                "</div>" +
                "</body>" +
                "</html>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter pw = resp.getWriter();

        String login = req.getParameter("login");
        String pass = req.getParameter("password");

        pw.println("<html>" +
                "<head>" +
                "    <title>"+TITLE+" </title>" +
                "    <link rel='stylesheet' href='" + CSS_FILE + "' type='text/css'>" +
                "</head>" +
                "<body>"+
                "<div class = 'labels'>"+
                "<h1>");

        if(USER_LOGIN.equals(login)&&USER_PASS.equals(pass)){
            pw.println(SUCCESS);
        }
        else {
            pw.println(FAIL);
        }
        pw.println("</h1>" +
                   "</div>" +
                   "</body>" +
                   "</html>");
    }
}
