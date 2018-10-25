package(default_visibility = ["//visibility:public"])

java_library(
    name = "xgboost",
    srcs = glob(["**/*.java"]),
    deps = [
        "//zoltar-core",
        "//zoltar-xgboost/src/main/java/ml/dmlc/xgboost4j/java",
        "//3rdparty/jvm/com/esotericsoftware/kryo:kryo",
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/spotify:completable_futures",
        "//3rdparty/jvm/ml/dmlc:xgboost4j"
        ],
)