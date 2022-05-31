package cl.jagerbomb.base64manager;

import cl.jagerbomb.base64manager.controllers.Base64Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Base64ManagerApplicationTests {

    @Autowired
    private Base64Controller base64Controller;

    @Test
    void encodeStringToBase64() {
        base64Controller.encodeStringToBase64("hola");
    }

}
