package fake.example.marsphotos

import android.app.Application
import fake.example.marsphotos.data.AppContainer
import fake.example.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
