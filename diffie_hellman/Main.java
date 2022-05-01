package diffie_hellman;

public class Main {
	public static void main(String[] args) {
		DiffieHellman diff1 = new DiffieHellman();
		DiffieHellman diff2 = new DiffieHellman();

		diff1.receiveKey(diff2.gPowerAModP());
		diff2.receiveKey(diff1.gPowerAModP());

		System.out.println(diff1.getKey());
		System.out.println(diff2.getKey());
	}
}
