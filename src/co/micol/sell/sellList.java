package co.micol.sell;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.DAO.sellboardDAO;
import co.micol.VO.sellboardVO;
import co.micol.common.Command;

public class sellList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {

		sellboardDAO dao = new sellboardDAO();
		
		ArrayList<sellboardVO> list = new ArrayList<sellboardVO>();

		list = dao.selectList();
		request.setAttribute("list", list);
		
		String viewPage ="sell/sellList";

		return viewPage;
	}

}
