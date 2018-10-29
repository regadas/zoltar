load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "jackson_module_paranamer",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/thoughtworks/paranamer:paranamer",
        "//external:jar/com/fasterxml/jackson/module/jackson_module_paranamer"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "jackson_module_scala",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        ":jackson_module_paranamer"
    ],
    jars = [
        "//external:jar/com/fasterxml/jackson/module/jackson_module_scala_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)


