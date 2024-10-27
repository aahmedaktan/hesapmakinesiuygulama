package com.example.hesapmakinesiuygulama

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hesapmakinesiuygulama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }


    fun sayisec(sayısecmeislemi: View) {

        if(yenioperator) {
            binding.sonuc.text =""
        }
        yenioperator = false
        val butonsec = sayısecmeislemi as Button
        var butondeger: String = binding.sonuc.text.toString()

        when (butonsec.id) {
            binding.sifir.id -> { butondeger += "0" }
            binding.bir.id -> { butondeger += "1" }
            binding.iki.id -> { butondeger += "2" }
            binding.uc.id -> { butondeger += "3" }
            binding.dort.id -> { butondeger += "4" }
            binding.bes.id -> { butondeger += "5" }
            binding.alti.id -> { butondeger += "6" }
            binding.yedi.id -> { butondeger += "7" }
            binding.sekiz.id -> { butondeger += "8" }
            binding.dokuz.id -> { butondeger += "9" }
        }

        binding.sonuc.text = butondeger
    }
    var operator =""
    var eskisayi =""
    var yenioperator = true

    fun islem(islemsecislemi:View){
        var islemsec =islemsecislemi as Button
        when (islemsec.id){
            binding.toplama.id -> {operator = "+"}
            binding.cKarma.id -> {operator = "-"}
            binding.carpma.id -> {operator = "*"}
            binding.bolme.id -> {operator = "/"}
        }
        eskisayi=binding.sonuc.text.toString()
        yenioperator=true
        }
    fun ac(silmeislemi:View){
        binding.sonuc.text=""
        yenioperator=true
    }
    fun esittir(esittir:View){
        var yenisayi =binding.sonuc.text.toString()
        var islemsonucu : Double? = null
        when (operator){
            "+" -> {islemsonucu=eskisayi.toDouble() + yenisayi.toDouble()}
            "-" -> {islemsonucu=eskisayi.toDouble() - yenisayi.toDouble()}
            "*" -> {islemsonucu=eskisayi.toDouble() * yenisayi.toDouble()}
            "/" -> {islemsonucu=eskisayi.toDouble() / yenisayi.toDouble()}
        }
        binding.sonuc.text=islemsonucu.toString()
        yenioperator=true
    }
    }
