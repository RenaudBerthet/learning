package be.rbe.designpattern.factory.simple;

import be.rbe.designpattern.factory.simple.CookieFactory.CookieType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CookieFactoryTest {

    private CookieFactory cookieFactory;

    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void redirectSystemOutStream() {
        this.cookieFactory = new CookieFactory();
        originalSystemOut = System.out;

        // given
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @AfterEach
    void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }

    @Test
    void testing_factory_for_oreo() {
        //given
        CookieType givenCookieType = CookieType.Oreo;
        //when
        this.cookieFactory.getCookie(givenCookieType).getBaked();
        //then
        Assertions.assertTrue(systemOutContent.toString().contains("Oreo, this is a kind of magic?"));
    }

    @Test
    void testing_factory_for_frangipane() {
        //given
        CookieType givenCookieType = CookieType.Frangipane;
        //when
        this.cookieFactory.getCookie(givenCookieType).getBaked();
        //then
        Assertions.assertTrue(systemOutContent.toString().contains("Hi, I'm a fangipane and I like to be baked!!!"));
    }
}