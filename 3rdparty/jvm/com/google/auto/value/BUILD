load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "auto_value",
    exported_plugins = [
        ":auto_value_plugin"
    ],
    exports = [
        "//external:jar/com/google/auto/value/auto_value"
    ],
    visibility = [
        "//visibility:public"
    ]
)
java_plugin(
    name = "auto_value_plugin",
    deps = [
        "//external:jar/com/google/auto/value/auto_value"
    ],
    processor_class = "com.google.auto.value.processor.AutoValueProcessor",
    visibility = [
        "//visibility:public"
    ]
)



