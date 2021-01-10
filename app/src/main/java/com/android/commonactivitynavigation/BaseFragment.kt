package com.buddi.life

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.OpenableColumns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.buddi.life.common.views.activities.LoginActivity
import com.buddi.life.common.models.filtertypes.*
import com.buddi.life.teacher.views.activities.TeacherLogin
import com.facebook.AccessToken
import com.facebook.GraphRequest
import com.facebook.HttpMethod
import com.facebook.login.LoginManager
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.pblibs.base.PBApplication
import com.pblibs.utility.GenericModel
import com.pblibs.utility.PBAlertWidgets
import com.pblibs.utility.PBSessionManager
import java.util.*
import kotlin.reflect.KClass

open class BaseFragment : Fragment() {
    fun navigateActivity(className: KClass<out AppCompatActivity>, bundle: Bundle = Bundle()) {
        (activity as? BaseActivity)?.navigateActivity(className, bundle)
        /*     val intent = Intent(requireContext(), className.java)
             intent.putExtra("dataObject", bundle)
             requireActivity().startActivity(intent)*/
    }
}