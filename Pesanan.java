import java.util.*;

public class Pesanan{
	List<String> pesanan;

	public Pesanan() {
		this.pesanan = new ArrayList<>();
	}

	public void tambah(String makanan) {
		this.pesanan.add(makanan);
	}

	public Object[] array() {
		return this.pesanan.toArray();
	}


}