package tacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
public class TestLoginController {
    @PostMapping("/current")
    public String test1(@Validated @RequestBody Order order){
        log.info("validEntity is {}", order);
        return "test1 valid success";
    }
}
