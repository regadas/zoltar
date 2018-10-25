load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "gcsio",
    exports = [
        "//3rdparty/jvm/com/google/api_client:google_api_client_jackson2",
        "//3rdparty/jvm/com/google/api_client:google_api_client_java6",
        "//3rdparty/jvm/com/google/apis:google_api_services_storage",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client_java6",
        "//external:jar/com/google/cloud/bigdataoss/gcsio",
        ":util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "util",
    exports = [
        "//3rdparty/jvm/com/google/api_client:google_api_client_jackson2",
        "//3rdparty/jvm/com/google/api_client:google_api_client_java6",
        "//3rdparty/jvm/com/google/apis:google_api_services_storage",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client_java6",
        "//external:jar/com/google/cloud/bigdataoss/util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


