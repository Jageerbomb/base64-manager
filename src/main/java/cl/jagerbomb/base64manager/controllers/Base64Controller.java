package cl.jagerbomb.base64manager.controllers;

import cl.jagerbomb.base64manager.services.Base64Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class Base64Controller {

    @Autowired
    private Base64Service base64Service;

    @PostMapping("encode-string-to-base-64")
    public ResponseEntity<?> encodeStringToBase64(@RequestParam("toEncode") String toEncode) {
        Map<String, Object> map = new HashMap<>();
        try {
            String base64 = base64Service.encodeStringToBase64(toEncode);
            map.put("response", base64);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(map, HttpStatus.ACCEPTED);
    }
}
