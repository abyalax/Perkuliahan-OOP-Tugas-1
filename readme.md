# Tugas 1 OOP Semester 3

## Tugas 
1. Apakah yang dimaksud dengan class, method, attribute, dan object?
2. Buat contoh class, definisikan attribute dan methodnya!
3. Buat kode program untuk point no. 2! (harus berdasarkan point no. 2)
4. Buat class yang berisi main method. Dengan main method tersebut, buat object dari class yang dibuat pada point no. 3. Selanjutnya object tersebut mengakses attribute dan methodnya


## Jawab
### Soal 1
1. Class
   - Class adalah template atau blueprint yang mendefinisikan bagaimana objek-objek tertentu akan berperilaku dan apa yang akan mereka miliki. Class mencakup atribut  dan metode yang bisa dimiliki oleh objek yang dibuat dari class tersebut
2. Method
   - Method adalah fungsi yang didefinisikan di dalam sebuah class dan berhubungan dengan objek. Method digunakan untuk menentukan perilaku atau tindakan yang dapat dilakukan oleh objek. Method biasanya menerima parameter self, yang mengacu pada instance dari objek yang memanggil method tersebut.
3. Atribut
   - Attribute adalah variabel yang disimpan di dalam sebuah objek atau class, dan digunakan untuk menyimpan data atau informasi tentang objek tersebut.
4. Object
   - Object adalah instansiasi atau realisasi dari sebuah class.


## Program
## Membuat Class, Object, Atribut, dan Method
Project ini mendemokan bagaimana pembuatan class ( class Perusahaan dan class Pegawai )
### Class Pegawai
#### Consutructor
Menerima argumen nama dan posisi, gaji diatur sebagai bagian dari behavior class
#### Atribut
- nama ( String )
- posisi ( String )
- gaji ( Long )
#### Method
- GetNama ( Untuk mengambil atribut nama )
- GetPosisi ( Untuk mengambil atribut posisi )

### Class Perusahaan
#### Consutructor
Menerima argumen nama perusahaan dan saldo perusahaan, serta didalamnya akan disiapkan array list kosong untuk pegawai
#### Atribut
- namaPerusahaan ( String )
- saldoPerusahaan ( Long )
- pegawai ( Pegawai )
#### Method
- tambahPegawai ( Untuk menambahkan pegawai )
- printPegawai ( Untuk menampilkan daftar pegawai )
- gajiPegawai ( untuk penggajian pegawai )
