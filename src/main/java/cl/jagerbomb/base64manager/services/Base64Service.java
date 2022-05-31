package cl.jagerbomb.base64manager.services;

public interface Base64Service {
    String encodeStringToBase64(String url);
    String decodeBase64ToString(String base64);
}
