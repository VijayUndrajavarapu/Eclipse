package EncryptNdecrypt;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Decrypt {

	public static void main(String[] args) {
		String name = "vijayundrajavarapu@gmail.com";
		byte[] message = name.getBytes(StandardCharsets.UTF_8);
		String encrypt= Base64.getEncoder().encodeToString(message);
		System.out.println(encrypt);
		
		byte[] decoded = Base64.getDecoder().decode(encrypt);
		System.out.println(new String(decoded, StandardCharsets.UTF_8));

	}

}
