package cl.jagerbomb.base64manager.utils;

import java.util.Base64;

public class Base64Utils {

    public static String encodeStringToBase64(String toEncode) {
        Base64.Encoder encoder = Base64.getUrlEncoder();
        return encoder.encodeToString(toEncode.getBytes());
    }

    public static byte[] decodeBase64ToByte(String base64) {
        Base64.Decoder decoder = Base64.getUrlDecoder();
        return decoder.decode(base64);
    }
}
