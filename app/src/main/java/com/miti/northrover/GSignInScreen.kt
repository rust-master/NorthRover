package com.miti.northrover

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import com.miti.northrover.databinding.ActivityGsigninscreenBinding


class GSignInScreen : AppCompatActivity() {

    lateinit var binding: ActivityGsigninscreenBinding

    private val mGoogleSignInClient: GoogleSignInClient? = null
    private val RC_SIGN_IN = 123
    private val mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGsigninscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "W A L L ' S \nC O V I D - 1 9   ", Toast.LENGTH_SHORT).show()

        val user = mAuth!!.currentUser
        if (user != null) {
            val intent = Intent(this@GSignInScreen, MainActivity::class.java)
            startActivity(intent)
        }
    }
}