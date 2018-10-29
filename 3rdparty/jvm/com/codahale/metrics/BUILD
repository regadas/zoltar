load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "metrics_core",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/com/codahale/metrics/metrics_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "metrics_jvm",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/com/codahale/metrics/metrics_jvm",
        ":metrics_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


