load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "google_auth_library_appengine",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//external:jar/com/google/auth/google_auth_library_appengine",
        ":google_auth_library_credentials",
        ":google_auth_library_oauth2_http"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "google_auth_library_credentials",
    exports = [
        "//external:jar/com/google/auth/google_auth_library_credentials"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "google_auth_library_oauth2_http",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//external:jar/com/google/auth/google_auth_library_oauth2_http",
        ":google_auth_library_credentials"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


