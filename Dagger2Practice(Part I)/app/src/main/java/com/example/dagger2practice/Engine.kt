package com.example.dagger2practice

import javax.inject.Inject

class Engine @Inject constructor(private var fuel: Fuel)