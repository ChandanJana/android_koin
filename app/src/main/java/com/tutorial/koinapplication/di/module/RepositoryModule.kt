package com.tutorial.koinapplication.di.module

import com.tutorial.koinapplication.data.repository.MainRepository
import org.koin.dsl.module

/**
 * Created by Chandan Jana on 01-09-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
val repoModule = module {
    single {
        MainRepository(get())
    }
}