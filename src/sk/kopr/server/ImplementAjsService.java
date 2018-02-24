package sk.kopr.server;

import javax.jws.WebService;

@WebService(
	endpointInterface="sk.kopr.server.AjsPort",
	targetNamespace="http://localhost:8888/ajs?wsdl",
	serviceName="AjsService",
	portName="AjsPort",
	wsdlLocation="./wsdl.wsdl"
)

public class ImplementAjsService {

	public PridajStudentResponse pridatUcastnika(PridajStudentRequest parameters) {
		PridajStudentResponse odpoved = new PridajStudentResponse();
		String uuid = Factory.INSTANCE.getMysqlStudentDao().pridajStudenta(parameters.getName(),parameters.getSurname());
		odpoved.setStudentUUID(uuid);
		return odpoved;
	}
}
