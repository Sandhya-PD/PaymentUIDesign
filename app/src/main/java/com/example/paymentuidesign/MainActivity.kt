package com.example.paymentuidesign


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private val loginFragment = Account()
    private val homeFragment = CheckForCard()
    private val cardsFragment = Cards()
    private val accountFragment = MyActivities()
    private val recharge = Recharge()
    private val loginfr=login()
    val fm: FragmentManager = supportFragmentManager
    var active: Fragment =loginfr


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

//        val languages = resources.getStringArray(R.array.programming_languages)
//        // create an array adapter and pass the required parameter
//        // in our case pass the context, drop down layout , and array.
//        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, languages)
//        // get reference to the autocomplete text view
//        val autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
//        // set adapter to the autocomplete tv to the arrayAdapter
//        autocompleteTV.setAdapter(arrayAdapter)

//        val signup = findViewById<TextView>(R.id.loginpage)
//        signup.setOnClickListener {
//            setContentView(R.layout.fragment_signup)
//            val login = findViewById<TextView>(R.id.login)
//            login.setOnClickListener {
//                setContentView(R.layout.fragment_account)
//            }

        var cards = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        fm.beginTransaction().add(R.id.fragment_container,loginfr, "1").commit()

        cards.setOnItemSelectedListener {
            when(it.itemId){
                R.id.ic_cards -> replaceFragment(cardsFragment)
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_notification -> replaceFragment(accountFragment)
                R.id.ic_info -> replaceFragment(recharge)
                R.id.ic_account -> replaceFragment(loginFragment)

                else -> {
                    replaceFragment(cardsFragment)
                }

            }
            return@setOnItemSelectedListener true
        }




//        val cards=findViewById<BottomNavigationView>(R.id.bottom_navigation)
//cards.setOnNavigationItemReselectedListener {
//    when(it.itemId){
//        R.id.ic_cards->cardsFragment
//    }
//
//}
//        val cards=findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        cards.setOnNavigationItemReselectedListener {
//            when(it.itemId){
//                R.id.ic_cards->replaceFragment(cardsFragment)
//            }
//        }



    }
    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }
}







//val cards=findViewById<BottomNavigationView>(R.id.ic_cards)
//cards.setOnClickListener {
//    setContentView(R.layout.fragment_cards)
//}