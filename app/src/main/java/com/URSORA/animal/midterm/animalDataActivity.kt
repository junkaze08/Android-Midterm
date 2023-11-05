package com.URSORA.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.URSORA.animal.midterm.dataModels.emailData
import com.URSORA.animal.midterm.databinding.ActivityAnimalDataBinding

class animalDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val emailData = intent.getParcelableExtra<emailData>("emailData")

        val animalId = binding.animalName
        val emailSubject = binding.detailEmailSubject
        val animalInfo = binding.animalInfo


        if (emailData != null) {
            animalId.text = emailData.senderName
            emailSubject.text = emailData.emailSubject
            animalInfo.text = emailData.emailContent
        } else {
            Toast.makeText(this, "Error: Animal Information is null", Toast.LENGTH_SHORT).show()
        }


    }
}
//<!--Identification Check: Binmcfmz Izcqza YY Affine Cipher Encoded a = 3 b = 0>