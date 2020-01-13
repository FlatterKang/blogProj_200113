package club.banyuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IndexController {
    @GetMapping("/user/{username:[0-9a-z_]+}")
    @ResponseBody
    String getBlog(@PathVariable String username){
        return "<h1>Your username is <span style=\"color:pink\">"+username+"</span></h1>";
    }
}
