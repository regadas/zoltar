load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "protobuf_java",
    exports = [
        "//external:jar/com/google/protobuf/protobuf_java"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "protobuf_java_util",
    exports = [
        "//3rdparty/jvm/com/google/code/gson:gson",
        "//3rdparty/jvm/com/google/guava:guava",
        "//external:jar/com/google/protobuf/protobuf_java_util",
        ":protobuf_java"
    ],
    visibility = [
        "//visibility:public"
    ]
)


