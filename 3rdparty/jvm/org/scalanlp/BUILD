load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "breeze",
    exports = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/com/github/fommil/netlib:core",
        "//3rdparty/jvm/com/github/wendykierp:JTransforms",
        "//3rdparty/jvm/net/sf/opencsv:opencsv",
        "//3rdparty/jvm/net/sourceforge/f2j:arpack_combined_all",
        "//3rdparty/jvm/org/apache/commons:commons_math3",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/spire_math:spire",
        ":breeze_macros"
    ],
    jars = [
        "//external:jar/org/scalanlp/breeze_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "breeze_macros",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect"
    ],
    jars = [
        "//external:jar/org/scalanlp/breeze_macros_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


