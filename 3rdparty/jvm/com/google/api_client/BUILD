load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "google_api_client",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client",
        "//external:jar/com/google/api_client/google_api_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_api_client_jackson2",
    exports = [
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//external:jar/com/google/api_client/google_api_client_jackson2",
        ":google_api_client"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "google_api_client_java6",
    exports = [
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client_java6",
        "//external:jar/com/google/api_client/google_api_client_java6",
        ":google_api_client"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


