object AndroidCore {
    private const val APP_COMPAT = "1.6.1"
    private const val CORE_KTX = "1.9.0"
    private const val FRAGMENT_KTX = "1.6.0"
    private const val LIFECYCLE_KTX = "2.6.1"
    private const val WEBKIT = "1.7.0"

    private val dependencies = listOf(
        "androidx.appcompat:appcompat:$APP_COMPAT",
        "androidx.core:core-ktx:$CORE_KTX",
        "androidx.fragment:fragment-ktx:$FRAGMENT_KTX",
        "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_KTX",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_KTX",
        "androidx.webkit:webkit:$WEBKIT",
    )

    fun DependencyHandler.androidCore(configurationName: String = "implementation") =
        dependencies.forEach { add(configurationName, it) }
}
