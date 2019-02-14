package com.chayacontroller.src;

public class HelloController extends AbstractController{
	
	@Override
	   protected ModelAndView handleRequestInternal(HttpServletRequest request,
	      HttpServletResponse response) throws Exception {
	      ModelAndView model = new ModelAndView("HelloPage");
	      model.addObject("welcome-messag");
	      return model;
}
