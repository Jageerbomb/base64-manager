package cl.jagerbomb.base64manager.services.impl;

import cl.jagerbomb.base64manager.services.Base64Service;
import cl.jagerbomb.base64manager.utils.Base64Utils;
import org.springframework.stereotype.Service;

@Service
public class Base64ServiceImpl implements Base64Service {

    @Override
    public String encodeStringToBase64(String toEncode) {
        return Base64Utils.encodeStringToBase64(toEncode);
    }

    @Override
    public String decodeBase64ToString(String base64) {
        return new String(Base64Utils.decodeBase64ToByte(base64));
    }
}
