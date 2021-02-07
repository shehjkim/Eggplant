package co.micol.sell;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.DAO.sellboardDAO;
import co.micol.VO.sellboardVO;
import co.micol.common.Command;

public class sellUpdate implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		sellboardDAO dao = new sellboardDAO();
		sellboardVO vo = new sellboardVO();
		
		vo.settTitle(request.getParameter("tTitle"));
		vo.settContent(request.getParameter("tContent"));
		vo.settPrice(Integer.parseInt(request.getParameter("tPrice")));
		vo.settImage(request.getParameter("tImage"));
		vo.settAddress(request.getParameter("tAddress"));
		vo.settDiscount(Integer.parseInt(request.getParameter("tDiscount")));
		vo.setpName(request.getParameter("pName"));
		vo.setpColor(request.getParameter("pColor"));
		vo.setpVolume(Integer.parseInt(request.getParameter("pVolume")));
		vo.settNumber(request.getParameter("tNumber"));
		
		String viewPage = null;
		
		int n = dao.update(vo);
		
		if(n != 0) {
			viewPage = "sellList.do";
		}else {
			String msg = "수정하지 못하였습니다. ";
			request.setAttribute("msg", msg);
			viewPage = "error1";
		}
		
		return null;
	}

}
