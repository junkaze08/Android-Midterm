package com.URSORA.animal.midterm

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.URSORA.animal.midterm.Adapters.animalListAd
import com.URSORA.animal.midterm.dataModels.emailData

class listActivity : AppCompatActivity() {

    private val emailList = mutableListOf(
        emailData("Antelope", "", "Slender-horned gazelles have sturdy, wide hooves for walking on the shifting sand of their desert habitat."),
        emailData("Bear", "", "Bears are carnivoran mammals of the family Ursidae. They are classified as caniforms, or doglike carnivorans. Although only eight species of bears are extant, they are widespread, appearing in a wide variety of habitats throughout most of the Northern Hemisphere and partially in the Southern Hemisphere."),
        emailData("Cat", "", "The cat, commonly referred to as the domestic cat or house cat, is the only domesticated species in the family Felidae. Recent advances in archaeology and genetics have shown that the domestication of the cat occurred in the Near East around 7500 BC."),
        emailData("Dog", "", "The dog is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from extinct Pleistocene wolves, and the modern wolf is the dog's nearest living relative. The dog was the first species to be domesticated by humans."),
        emailData("Elephant", "", "Elephants are the largest living land animals. Three living species are currently recognised: the African bush elephant, the African forest elephant, and the Asian elephant. They are the only surviving members of the family Elephantidae and the order Proboscidea; extinct relatives include mammoths and mastodons."),
        emailData("Fox", "", "Foxes are small to medium-sized, omnivorous mammals belonging to several genera of the family Canidae. They have a flattened skull, upright, triangular ears, a pointed, slightly upturned snout, and a long bushy tail. Twelve species belong to the monophyletic true fox group of genus Vulpes."),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_list)

        val listView: ListView = findViewById(R.id.animalListView)
        val adapter = animalListAd(emailList)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedEmail = emailList[position]
            val intent = Intent(this, animalDataActivity::class.java)
            intent.putExtra("emailData", selectedEmail)
            startActivity(intent)
        }

    }
}
//<!--Identification Check: Binmcfmz Izcqza YY Affine Cipher Encoded a = 3 b = 0>