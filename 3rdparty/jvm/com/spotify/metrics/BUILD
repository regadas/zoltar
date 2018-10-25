load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "semantic_metrics_api",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//external:jar/com/spotify/metrics/semantic_metrics_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "semantic_metrics_core",
    exports = [
        "//3rdparty/jvm/com/codahale/metrics:metrics_core",
        "//3rdparty/jvm/com/codahale/metrics:metrics_jvm",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/com/spotify/metrics/semantic_metrics_core",
        ":semantic_metrics_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)


