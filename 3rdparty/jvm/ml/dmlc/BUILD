load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "xgboost4j",
    exports = [
        "//3rdparty/jvm/com/esotericsoftware/kryo:kryo",
        "//3rdparty/jvm/com/typesafe/akka:akka_actor",
        "//3rdparty/jvm/commons_logging:commons_logging",
        "//3rdparty/jvm/org/scala_lang:scala_compiler",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//external:jar/ml/dmlc/xgboost4j"
    ],
    visibility = [
        "//visibility:public"
    ]
)


