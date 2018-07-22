package com.tecsup.jwa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/git")
public class NuevoController {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioEncuestaController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView iniciar() {
		logger.info("Inicio llamada a /git");
		ModelAndView modelAndView = new ModelAndView("git/index");

		return modelAndView;
	}

}
