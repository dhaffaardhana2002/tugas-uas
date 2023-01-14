# Tugas PBO UAS

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2

---

Disini saya akan menunjukkan tutorial membuat Aplikasi Desktop dengan Java

## Buat file dan kode Java

- Buat file dengan nama bebas seperti `Utama` dengan ekstensi file `.java`

```
import javax.swing.*;
import java.util.*;

public class Utama{
	public static void main(String[] args) {
		FrameSaya myFrame = new FrameSaya();

		Pesanan pesanan = new Pesanan();

		int i = 0;
		int harga_total = 0;
		boolean lanjut = true;
		boolean ulang = false;

		JOptionPane.showMessageDialog(myFrame, "Selamat datang di Restoran Budi!");

		do {
			String nama_pesan = "";
			HargaItem harga_makanan = new HargaItem();
			do {
				ulang = false;
				String jawab_pesan = JOptionPane.showInputDialog(myFrame, "Anda ingin pesan apa? (gunakan angka untuk memilih)\n1. Nasi Goreng: Rp. 10,000,-\n2. Mie Goreng: Rp. 12,000,-\n3. Bebek Bakar: Rp. 25,000,-\n4. Pecel Lele: Rp. 15,000,-\n5. Batagor: Rp. 10,000,-\n");
				int no_pesan = Integer.parseInt(jawab_pesan);

				switch (no_pesan) {
					case 1:
						nama_pesan = "Nasi Goreng";
						harga_makanan.tambahHarga(10_000);
						break;
					case 2:
						nama_pesan = "Mie Goreng";
						harga_makanan.tambahHarga(12_000);
						break;
					case 3:
						nama_pesan = "Bebek Bakar";
						harga_makanan.tambahHarga(25_000);
						break;
					case 4:
						nama_pesan = "Pecel Lele";
						harga_makanan.tambahHarga(15_000);
						break;
					case 5:
						nama_pesan = "Batagor";
						harga_makanan.tambahHarga(10_000);
						break;
					default:
						JOptionPane.showMessageDialog(myFrame, "Anda harus memilih nomor menu");
						ulang = true;
						break;
				}
			} while (ulang);

			int confirm = JOptionPane.showConfirmDialog(myFrame, "Apakah anda ingin memesan " + nama_pesan + "?");
			switch (confirm) {
				case 0:
					pesanan.tambah(nama_pesan);
					harga_total += harga_makanan.harga;
					JOptionPane.showMessageDialog(myFrame, pesanan.array()[i] + " telah ditambahkan ke Pesanan anda\nDengan harga " + harga_makanan.harga);
					i++;
					break;
				case 1:
				case 2:
					JOptionPane.showMessageDialog(myFrame, "Pesanan dibatalkan");
					break;
			}

			confirm = JOptionPane.showConfirmDialog(myFrame, "Apakah anda ingin memesan lagi?");
			if (confirm != 0) {
				lanjut = false;
			}
		} while (lanjut);

		String semua_pesanan = "";
		for (int j = 0; j < pesanan.array().length; j++) {
			semua_pesanan += (j+1) + ". " + pesanan.array()[j] + "\n";
		}

		JOptionPane.showMessageDialog(myFrame, "Ini dia pesanannya:\n" + semua_pesanan + "\n Total harga: " + harga_total);


		myFrame.dispose();
	}
}
```

- lalu buat file `Harga.java`

```
public abstract class Harga{
	public int harga;

	public abstract void tambahHarga(int harga);
}
```

- lalu buat file `Pesanan.java`

```
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
```

- lalu buat file `HargaItem.java`

```
public class HargaItem extends Harga{
	public int harga;

	public void tambahHarga(int harga) {
		this.harga = harga;
	}
}
```

- lalu buat file `Item.java`

```
public class Item{
	public String makanan;

	public Item(String makanan) {
		this.makanan = makanan;
	}
}
```

- lalu buat file `FrameSaya.java`

```
import javax.swing.*;
import java.awt.*;

class FrameSaya extends JFrame{

	public FrameSaya() {
		// Set frame size
		setTitle("Tugas UAS PBO");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
		changeBkColor();

		// make close method
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void changeBkColor() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
	}
}
```

- Save file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik `javac` lalu file yang akan di kompile yaitu `Utama.java`
- Jika berhasil dan tidak ada error, ketik

```
java Utama
```

Hasilnya kalian bisa dilihat di link video dibawah
[Link Youtube: https://youtu.be/bGHpK32GVeU](https://youtu.be/bGHpK32GVeU)

___
Terima kasih telah mengikuti tutorial dari saya, kurang lebihnya mohon maaf.
