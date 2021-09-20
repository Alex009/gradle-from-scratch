plugins {
    id("kmm-convention")
    id("dev.icerock.mobile.multiplatform.ios-framework")
    id("dev.icerock.mobile.multiplatform.cocoapods")
}

dependencies {
    commonMainImplementation(libs.kotlin.stdlib)
    commonMainApi(projects.mppLibrary.featureAuth)
}

framework {
    export(projects.mppLibrary.featureAuth)
    export(libs.moko.mvvm.core)
}

cocoaPods {
    pod("AFNetworking", onlyLink = true)
}
