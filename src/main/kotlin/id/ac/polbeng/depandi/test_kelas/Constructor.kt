package id.ac.polbeng.depandi.test_kelas

//Sebuah kelas di Kotlin dapat memiliki satu konstruktor utama (primary constructor) dan satu
//atau lebih konstruktor tambahan (secondary constructor). Konstruktor utama adalah bagian dari
//header suatu kelas, ia didefenisikan setelah nama kelas dan opsional tipe parameter.

/*class ClassName [visibility_modifiers] constructor(firstName: String) { /*[Class Body]*/ }

//Jika konstruktor utama tidak memiliki apapun notasi atau visibility modifier, maka keyword
//constructor dapat dihilangkan hingga kode menjadi ringkas seperti berikut:

/*class Person(firstName: String) { /*...*/ }

//Constructor utama tidak berisi kode apapun. Inisialisasi nilai default atribut kelas dapat ditaruh didalam initializer block.