load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "protobuf_generic",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/module:jackson_module_scala",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/me/lyh/protobuf_generic_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "shapeless_datatype_core",
    exports = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/me/lyh/shapeless_datatype_core_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "shapeless_datatype_tensorflow",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/tensorflow:proto",
        ":shapeless_datatype_core"
    ],
    jars = [
        "//external:jar/me/lyh/shapeless_datatype_tensorflow_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


