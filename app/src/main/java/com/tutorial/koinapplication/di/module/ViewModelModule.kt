package com.tutorial.koinapplication.di.module

import com.tutorial.koinapplication.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Chandan Jana on 01-09-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}