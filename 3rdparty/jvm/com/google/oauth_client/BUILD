load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "google_oauth_client",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//external:jar/com/google/oauth_client/google_oauth_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_oauth_client_java6",
    exports = [
        "//external:jar/com/google/oauth_client/google_oauth_client_java6",
        ":google_oauth_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)


