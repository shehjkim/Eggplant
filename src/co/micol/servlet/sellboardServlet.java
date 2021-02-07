package co.micol.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.DAO.sellboardDAO;
import co.micol.VO.sellboardVO;

@WebServlet("/sellList")
public class sellboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public sellboardServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        
		sellboardDAO dao = new sellboardDAO();
		ArrayList<sellboardVO> list = dao.selectList();
		
		String jsonFile = "[";
		int i = 1;
		for (sellboardVO sellboard:list) {
			jsonFile += "{";
			jsonFile += "\"tImage\":\""+sellboard.gettImage()+"\"";
			jsonFile += "\"tTitle\":\""+sellboard.gettTitle()+"\"";
			jsonFile += "\"pName\":\""+sellboard.getpName()+"\"";
			jsonFile += "\"pcolor\":\""+sellboard.getpColor()+"\"";
			jsonFile += "\"pVolume\":\""+sellboard.getpVolume()+"\"";
			jsonFile += "\"tPrice\":\""+sellboard.gettPrice()+"\"";
			jsonFile +="}";
			if(list.size() != i++) {
				jsonFile +=",";
			}
			jsonFile +="]";
		
		response.getWriter().append(jsonFile);
		}
	}	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
