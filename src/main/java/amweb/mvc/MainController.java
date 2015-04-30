package amweb.mvc;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String index2() {
        return "index";
    }

    @RequestMapping({
            "/",
            "/app",
            "/app/contacts",
            "/app/contacts",
            "/app/contacts/{id:\\w+}",
            "app/contacts/{id:\\w+}/edit"
    })
    public String index() {
        return "forward:/app/index.html";
    }
}