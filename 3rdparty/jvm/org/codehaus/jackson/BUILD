load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "jackson_core_asl",
    exports = [
        "//external:jar/org/codehaus/jackson/jackson_core_asl"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "jackson_mapper_asl",
    exports = [
        "//external:jar/org/codehaus/jackson/jackson_mapper_asl",
        ":jackson_core_asl"
    ],
    visibility = [
        "//visibility:public"
    ]
)


