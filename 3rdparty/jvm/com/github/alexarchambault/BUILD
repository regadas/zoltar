load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "case_app",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":case_app_annotations",
        ":case_app_util"
    ],
    jars = [
        "//external:jar/com/github/alexarchambault/case_app_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "case_app_annotations",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/github/alexarchambault/case_app_annotations_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "case_app_util",
    exports = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:macro_compat"
    ],
    jars = [
        "//external:jar/com/github/alexarchambault/case_app_util_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


