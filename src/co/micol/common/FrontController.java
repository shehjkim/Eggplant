package co.micol.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.sell.sellDelete;
import co.micol.sell.sellForm;
import co.micol.sell.sellList;
import co.micol.sell.sellUpdate;
import co.micol.sell.sellUpdateForm;
import co.micol.sell.sellUpload;
import co.micol.sell.sellView;

import co.micol.customerCenter.FrequentlyQuestion;
import co.micol.customerCenter.QnAList;
import co.micol.customerCenter.ReportList;
import co.micol.my.CartList;
import co.micol.my.MyPage;
import co.micol.my.NoteList;
import co.micol.my.NoteNCommandList;
import co.micol.my.NoticeList;
import co.micol.servlet.MainForm;

import co.micol.user.join.IdCheck;
import co.micol.user.join.SignUp;
import co.micol.user.join.SignUpForm;
import co.micol.user.log.AdminDashBoard;
import co.micol.user.log.Login;
import co.micol.user.log.UserList;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, Command> map = new HashMap<>();
       
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		map.put("/loading.do", new Loading());
		map.put("/loginForm.do", new LoginForm());
		map.put("/login.do", new Login());
		map.put("/signUpForm.do", new SignUpForm());
		map.put("/signUp.do", new SignUp());
		map.put("/idCheck.do", new IdCheck());
		//현정
		map.put("/sellList.do", new sellList());		//리스트
		map.put("/sellView.do", new sellView());		//상세리스트
		map.put("/sellForm.do", new sellForm());		//글등록폼
		map.put("/sellUpload.do", new sellUpload());	//글등록
		map.put("/sellUpdateForm.do", new sellUpdateForm()); 	//글수정폼
		map.put("/sellUpdate.do", new sellUpdate());			//글수정완료
		map.put("/sellDelete.do", new sellDelete()); //글삭제
		//
		map.put("/userList.do", new UserList());
		map.put("/adminDashBoard.do", new AdminDashBoard());
			
		map.put("/myPage.do", new MyPage());
		map.put("/cartList.do", new CartList());
		map.put("/noteNcommandList.do", new NoteNCommandList());
		map.put("/noteList.do", new NoteList());
		map.put("/noticeList.do", new NoticeList());
		
		map.put("/frequentlyQuestion.do", new FrequentlyQuestion());
		map.put("/QnAList.do", new QnAList());
		map.put("/reportList.do", new ReportList());
		
		map.put("/main.do", new MainForm());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI();
		String path = uri.substring(contextPath.length());
		
		Command command = map.get(path);
		String viewPage = command.exec(request, response);
		
		if(!viewPage.endsWith(".do")) viewPage = "WEB-INF/jsp/"+viewPage+".jsp";
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
