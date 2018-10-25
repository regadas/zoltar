load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "libtensorflow",
    exports = [
        "//external:jar/org/tensorflow/libtensorflow"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "libtensorflow_jni",
    exports = [
        "//external:jar/org/tensorflow/libtensorflow_jni"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "proto",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/org/tensorflow/proto"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "tensorflow",
    exports = [
        "//external:jar/org/tensorflow/tensorflow",
        ":libtensorflow",
        ":libtensorflow_jni"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


