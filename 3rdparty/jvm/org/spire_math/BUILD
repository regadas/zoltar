load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "jawn_parser",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/spire_math/jawn_parser_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "spire",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:machinist",
        ":spire_macros"
    ],
    jars = [
        "//external:jar/org/spire_math/spire_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "spire_macros",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:machinist"
    ],
    jars = [
        "//external:jar/org/spire_math/spire_macros_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


