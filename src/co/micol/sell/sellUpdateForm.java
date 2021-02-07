package co.micol.sell;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.DAO.sellboardDAO;
import co.micol.VO.sellboardVO;
import co.micol.common.Command;

public class sellUpdateForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		sellboardDAO dao = new sellboardDAO();
		sellboardVO vo = new sellboardVO();
		
		vo.settNumber(request.getParameter("row"));
		
		vo = dao.select(vo);

		request.setAttribute("vo", vo);
		
		String viewPage = "sell/sellUpdateForm";

		return viewPage;
	}

}
