package online.techstories.demo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   @Value("${my.property}")
   private String myProperty;

   @GetMapping("/my-property")
   public String getMyProperty() {
      return myProperty;
   }
}