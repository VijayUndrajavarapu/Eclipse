package EncryptNdecrypt;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class encrypt {

	public static void main(String[] args) {
		String name = "asdfasdf";
		
		byte[] message = name.getBytes(StandardCharsets.UTF_8);
		String asdf= Base64.getEncoder().encodeToString(message);
		System.out.println(asdf);

	}

}
