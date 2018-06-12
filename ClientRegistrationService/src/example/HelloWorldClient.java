package example;

import WebServices.Registration;
import WebServices.RegistrationService;

public class HelloWorldClient {
  public static void main(String[] argv) {
    Registration service = new RegistrationService().getPort(Registration.class);
    //invoke business method
//    service.registerUser();
  }
}
