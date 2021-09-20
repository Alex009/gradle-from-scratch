import dev.icerock.moko.mvvm.dispatcher.EventsDispatcher

fun helloWorld() {
    println("hello world!")
    helloFromModule()
}

fun createAuthViewModel(): AuthViewModel {
    return AuthViewModel(EventsDispatcher())
}