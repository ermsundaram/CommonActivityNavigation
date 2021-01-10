package com.buddi.life

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.OpenableColumns
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.buddi.life.common.models.localmodel.TagLocalModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.gson.Gson
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.reflect.KClass

open class BaseActivity : AppCompatActivity() {
    fun navigateActivity(className:KClass<out AppCompatActivity>, bundle: Bundle = Bundle()) {
        val intent = Intent(this, className.java)
        intent.putExtra("dataObject", bundle)
        startActivity(intent)
    }
}