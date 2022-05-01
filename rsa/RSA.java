package rsa;

import java.math.BigInteger;
import java.util.Random;

public class RSA {
	public static final int VERSION = 1024;

	public static final BigInteger E = new BigInteger("65537"); // Số E là số nguyên tố

	private BigInteger p, q, n, phiN, d;

	public void initialize() {
		p = BigInteger.probablePrime(VERSION / 2, new Random());
		q = BigInteger.probablePrime(VERSION / 2, new Random());
		n = p.multiply(q);
		phiN = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		d = E.modInverse(phiN);
	}

	public BigInteger encrypt(BigInteger message, BigInteger patternN) {
		return message.modPow(E, patternN);
	}

	public BigInteger decrypt(BigInteger cirphir) {
		return cirphir.modPow(d, n);
	}

	public BigInteger getN() {
		return n;
	}
}
