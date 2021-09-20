import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import dev.icerock.moko.mvvm.dispatcher.EventsDispatcher

class AppActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myVm: AuthViewModel = createAuthViewModel()
        myVm.onSubmitPressed()

        val e: EventsDispatcher<Any>
    }
}