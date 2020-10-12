package controller2;

public class HandlerMapping2 {
	private static HandlerMapping2 instance = new HandlerMapping2();
	private HandlerMapping2() {}
	public static HandlerMapping2 getInstance() {
		return instance;
	}
	public Controller2 create(String command) {
		Controller2 controller = null;
		if(command.equals("List")) {
			controller = new ListController2();
		}else if(command.equals("registerForm2")) {
			controller = new registerFormController();
		}else if(command.equals("register")){
			controller = new registerController();
		}
		return controller;
	}
}
