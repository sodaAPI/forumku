package com.app.forumku

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.google.android.material.button.MaterialButton

class WelcomeActivity : AppCompatActivity() {

    private lateinit var signinbtn: MaterialButton
    private lateinit var signupbtn: MaterialButton
    private lateinit var logoImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        signinbtn = findViewById(R.id.signin_btn)
        signupbtn = findViewById(R.id.signup_btn)
        logoImage = findViewById(R.id.logo)


        signinbtn.setOnClickListener {
            Toast.makeText(this,"Sign In",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SignInActivity::class.java)
//            startActivity(intent)

            val pairs: Array<Pair<View, String>?> = arrayOfNulls(1)
            pairs[0] = Pair<View, String>(signinbtn, "signinTN")

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, *pairs
            )

            startActivity(intent, options.toBundle())
        }

        signupbtn.setOnClickListener {
            Toast.makeText(this,"Sign Up",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SignUpActivity::class.java)
//            startActivity(intent)

            val pairs: Array<Pair<View, String>?> = arrayOfNulls(1)
            pairs[0] = Pair<View, String>(signupbtn, "signupTN")

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, *pairs
            )

            startActivity(intent, options.toBundle())

        }
    }
}