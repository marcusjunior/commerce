package br.com.transire.commerce.controles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControle {

    @RequestMapping("/")
    String index() {
        return "index";
    }

}
