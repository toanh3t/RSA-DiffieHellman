package rsa;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		RSA per1 = new RSA();
		RSA per2 = new RSA();

		per1.initialize();
		per2.initialize();

		BigInteger message = new BigInteger("123456789");
		BigInteger cipher = per1.encrypt(message, per2.getN());

		BigInteger decryptMsg = per2.decrypt(cipher);

		System.out.println(message);
		System.out.println(decryptMsg);
	}
}
