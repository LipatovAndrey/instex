package controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class FirstController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
      log.info("get");
      return new ResponseEntity<>("get from instex", HttpStatus.OK);
    }
}
