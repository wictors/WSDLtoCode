package sk.kopr.klient;

public class Klient {

	public static void main(String[] args) {

		AjsService service = new AjsService();
		AjsPort port = service.getAjsPort();

		PridajStudentRequest studentRequest = new PridajStudentRequest();
		studentRequest.setName("Jozko");
		studentRequest.setSurname("Mrkva");

		PridajStudentResponse studentResponse = port.pridatUcastnika(studentRequest);		
		System.out.println("UUID: " + studentResponse.getStudentUUID());
	}

}
