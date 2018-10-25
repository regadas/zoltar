load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "opencensus_api",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/io/grpc:grpc_context",
        "//external:jar/io/opencensus/opencensus_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "opencensus_contrib_grpc_util",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/errorprone:error_prone_annotations",
        "//3rdparty/jvm/io/grpc:grpc_core",
        "//external:jar/io/opencensus/opencensus_contrib_grpc_util",
        ":opencensus_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "opencensus_contrib_http_util",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//external:jar/io/opencensus/opencensus_contrib_http_util",
        ":opencensus_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


