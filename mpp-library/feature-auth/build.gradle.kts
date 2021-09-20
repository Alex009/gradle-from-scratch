plugins {
    id("kmm-convention")
    id("dev.icerock.mobile.multiplatform.cocoapods")
}

dependencies {
    commonMainImplementation(libs.kotlin.stdlib)
    commonMainApi(libs.moko.mvvm.core)
}

cocoaPods {
    pod("AFNetworking")
}