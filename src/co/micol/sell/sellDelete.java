package co.micol.sell;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.DAO.sellboardDAO;
import co.micol.VO.sellboardVO;
import co.micol.common.Command;

public class sellDelete implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		sellboardDAO dao = new sellboardDAO();
		sellboardVO vo = new sellboardVO();
		
		vo.settNumber(request.getParameter("tNumber"));
		
		int n = dao.delete(vo);
		String viewPage = null;
		
		if(n!=0) {
			viewPage = "sellList.do";
		}else {
			viewPage = "sellList.do";
	}
		return viewPage;
	}

}
