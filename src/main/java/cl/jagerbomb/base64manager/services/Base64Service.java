package cl.jagerbomb.base64manager.services;

import org.springframework.stereotype.Service;

public interface Base64Service {
    String encodeUrlToBase64(String url);
    String decodeBase64ToString(String base64);
}
