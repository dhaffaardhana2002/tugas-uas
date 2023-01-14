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