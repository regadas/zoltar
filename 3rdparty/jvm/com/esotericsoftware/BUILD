load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "kryo_shaded",
    exports = [
        "//3rdparty/jvm/org/objenesis:objenesis",
        "//external:jar/com/esotericsoftware/kryo_shaded",
        ":minlog"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "minlog",
    exports = [
        "//external:jar/com/esotericsoftware/minlog"
    ],
    visibility = [
        "//visibility:public"
    ]
)


