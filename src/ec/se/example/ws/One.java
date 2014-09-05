package ec.se.example.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace="http://bsg.gob.ec/AccesoBSGService")
public class One {
	public RetornoOne execute(@WebParam(name = "A") String value) {
		RetornoOne retorno = new RetornoOne();
		retorno.setX(value.concat(" X One"));
		retorno.setY(value.concat(" Y One"));
		retorno.setZ(value.concat(" Z One"));
		return retorno;
	}
}
