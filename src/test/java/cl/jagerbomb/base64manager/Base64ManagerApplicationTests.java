package cl.jagerbomb.base64manager;

import cl.jagerbomb.base64manager.services.Base64Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class Base64ManagerApplicationTests {

    @Autowired
    private Base64Service base64Service;

    @Test
    void encodeStringToBase64() {
        String base64 = base64Service.encodeStringToBase64("Texto que pasara a Base 64");
    }

    @Test
    void decodeBase64ToString() {
        String base64 = base64Service.encodeStringToBase64("Texto que pasara a Base 64");
        String text = base64Service.decodeBase64ToString(base64);
    }
}
