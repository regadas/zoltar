load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "algebird_core",
    exports = [
        "//3rdparty/jvm/com/googlecode/javaewah:JavaEWAH",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//3rdparty/jvm/org/typelevel:algebra"
    ],
    jars = [
        "//external:jar/com/twitter/algebird_core_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "chill",
    exports = [
        "//3rdparty/jvm/com/esotericsoftware:kryo_shaded",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":chill_java"
    ],
    jars = [
        "//external:jar/com/twitter/chill_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "chill_algebird",
    exports = [
        "//3rdparty/jvm/com/esotericsoftware:kryo_shaded",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":algebird_core",
        ":chill"
    ],
    jars = [
        "//external:jar/com/twitter/chill_algebird_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "chill_java",
    exports = [
        "//3rdparty/jvm/com/esotericsoftware:kryo_shaded",
        "//external:jar/com/twitter/chill_java"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "chill_protobuf",
    exports = [
        "//3rdparty/jvm/com/esotericsoftware:kryo_shaded",
        "//external:jar/com/twitter/chill_protobuf",
        ":chill_java"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


