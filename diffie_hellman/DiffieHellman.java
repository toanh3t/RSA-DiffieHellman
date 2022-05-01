package diffie_hellman;

import java.math.BigInteger;
import java.util.Random;

public class DiffieHellman {
	public final static int VERSION = 1024;
	public static final BigInteger G = BigInteger.probablePrime(VERSION, new Random());
	public static final BigInteger P = BigInteger.probablePrime(VERSION, new Random());

	private BigInteger privateNumber;
	private BigInteger finalSecretKey;

	public DiffieHellman() {
		privateNumber = BigInteger.probablePrime(VERSION, new Random());
	}

	public BigInteger gPowerAModP() {
		return G.modPow(privateNumber, P);
	}

	public void receiveKey(BigInteger partnerNumber) {
		finalSecretKey = partnerNumber.modPow(privateNumber, P);
	}

	public BigInteger getKey() {
		return finalSecretKey;
	}
}
