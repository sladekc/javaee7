package de.akdb.oesio.readinggroup.jaxws.halloAppClient;

import de.akdb.oesio.readinggroup.jaxws.helloService.HelloService;

import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation =
            "http://localhost:8080/demo/Hello?WSDL")
    private static HelloService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sayHello("world"));
    }

    private static String sayHello(java.lang.String arg0) {
        de.akdb.oesio.readinggroup.jaxws.helloService.Hello port =
                service.getHelloPort();
        return port.sayHello(arg0);
    }
}

