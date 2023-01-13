package com.example.dagger2practice

import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine)