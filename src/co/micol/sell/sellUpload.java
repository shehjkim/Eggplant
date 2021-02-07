package co.micol.sell;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.DAO.sellboardDAO;
import co.micol.VO.sellboardVO;
import co.micol.common.Command;

public class sellUpload implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		sellboardDAO dao = new sellboardDAO();
		sellboardVO vo = new sellboardVO();
		
		vo.settTitle(request.getParameter("tTitle"));
		vo.settContent(request.getParameter("tContent"));
		vo.settDate(request.getParameter("tDate"));
		vo.settPrice(Integer.parseInt(request.getParameter("tPrice")));
		vo.settImage(request.getParameter("tImage"));
		vo.settAddress(request.getParameter("tAddress"));
		vo.settId(request.getParameter("tId"));
		vo.settDiscount(Integer.parseInt(request.getParameter("tDiscount")));
		vo.setpName(request.getParameter("pName"));
		vo.setpColor(request.getParameter("pColor"));
		vo.setpVolume(Integer.parseInt(request.getParameter("pVolume")));
		
		
		int n = dao.insert(vo);
		String viewPage = null;
		
		request.setAttribute("vo", vo);
		if(n != 0) {
			viewPage = "sell/sellList";
		}else {
			viewPage = "sell/sellUploadFail";
		}
		
		
		return viewPage;
	}
}

