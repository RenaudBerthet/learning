package be.rbe.designpattern.factory.simple;

public class CookieFactory {
    Cookie getCookie(CookieType cookieType) {
        Cookie cookie = null;

        switch (cookieType) {
            case Oreo:
                cookie = new Oreo();
                break;
            case Frangipane:
                cookie = new Frangipane();
                break;
        }
        return cookie;
    }

    enum CookieType {
        Oreo,
        Frangipane
    }
}
