package be.rbe.learning.tdd.mockito;

import org.junit.Before;

import javax.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AjaxControllerTest {

    CountryDao countryDao;
    HttpServletRequest request;

    @Before
    public void setUp() {
        request = mock(HttpServletRequest.class);
        countryDao = mock(CountryDao.class);
    }


}