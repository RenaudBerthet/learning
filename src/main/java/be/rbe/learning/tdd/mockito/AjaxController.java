package be.rbe.learning.tdd.mockito;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Scope("session")
public class AjaxController {
    private final CountryDao countryDao;

    public AjaxController(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @RequestMapping(value = "retrieveCountries", method = RequestMethod.POST)
    public @ResponseBody
    List<Country> retrieve(HttpServletRequest webRequest) {
        return null;
    }
}