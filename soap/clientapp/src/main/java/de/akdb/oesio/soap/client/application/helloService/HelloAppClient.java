package de.akdb.oesio.soap.client.application.helloService;


import de.akdb.oesio.soap.service.helloService.Hello;
import de.akdb.oesio.soap.service.helloService.HelloService;

import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation = "http://localhost:8080/soap-service/Hello?WSDL")
    private static HelloService service = new HelloService();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sayHello("world-HelloAppClient"));
    }

    private static String sayHello(String arg0) {
        Hello port = service.getHelloPort();
        return port.sayHello(arg0);
    }
}