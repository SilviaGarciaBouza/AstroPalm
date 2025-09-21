package com.github.horosapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//clase aplication para q sea la primera q se cargue al entrar en el proyecto
//DaggerHilt: inyccn de dependencias 4/4
@HiltAndroidApp
class HoroscAppApp: Application()