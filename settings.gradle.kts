rootProject.name = "OpenAI-Kotlin"
includeBuild("build-support")

include(":openai-core")
include(":openai-client")
include(":openai-client-ktor")

include(":sample:jvm")
include(":sample:js")
include(":sample:native")

enableFeaturePreview("VERSION_CATALOGS")
