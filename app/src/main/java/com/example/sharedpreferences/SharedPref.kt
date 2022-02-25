package com.example.sharedpreferences

import android.content.Context
import androidx.core.content.edit

class SharedPref(context: Context) {
    private val pref = context.getSharedPreferences("nimadir", Context.MODE_PRIVATE)



  fun isSaved(isSaved: Boolean){
       val editor = pref.edit()
       editor.putBoolean("isSaved", isSaved)
       editor.apply()
   }
   fun getSaved(): Boolean{
       return pref.getBoolean("isSaved", false)
   }
}