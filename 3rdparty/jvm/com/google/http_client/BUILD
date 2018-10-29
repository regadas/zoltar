load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "google_http_client",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/org/apache/httpcomponents:httpclient",
        "//external:jar/com/google/http_client/google_http_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_http_client_appengine",
    exports = [
        "//external:jar/com/google/http_client/google_http_client_appengine",
        ":google_http_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_http_client_jackson",
    exports = [
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//external:jar/com/google/http_client/google_http_client_jackson",
        ":google_http_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_http_client_jackson2",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//external:jar/com/google/http_client/google_http_client_jackson2",
        ":google_http_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_http_client_protobuf",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/com/google/http_client/google_http_client_protobuf",
        ":google_http_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)


