package(default_visibility = ["//visibility:public"])

java_library(
    name = "zoltar",
    srcs = glob(["**/*.java"]),
    deps = [
        "//zoltar-core",
        "//zoltar-tests/src/main/scala/com/spotify/zoltar",
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/spotify:completable_futures",
        "//3rdparty/jvm/ml/dmlc:xgboost4j"
        ],
)