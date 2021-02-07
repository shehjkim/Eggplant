package co.micol.sell;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;

public class sellForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "sell/sellForm";
	}

}
