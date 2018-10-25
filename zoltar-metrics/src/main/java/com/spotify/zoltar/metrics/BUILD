package(default_visibility = ["//visibility:public"])

java_library(
    name = "metrics",
    srcs = glob(["**/*.java"]),
    deps = [
        "//3rdparty/jvm/com/spotify/metrics:semantic_metrics_core",
        "//3rdparty/jvm/com/spotify/metrics:semantic_metrics_api",
        "//3rdparty/jvm/com/codahale/metrics:metrics_core",
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/guava:guava",
        "//zoltar-core"
        ],
)