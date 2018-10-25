load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "completable_futures",
    exports = [
        "//external:jar/com/spotify/completable_futures"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "featran_core_2_11",
    exports = [
        "//3rdparty/jvm/com/twitter:algebird_core",
        "//3rdparty/jvm/io/circe:circe_core",
        "//3rdparty/jvm/io/circe:circe_generic",
        "//3rdparty/jvm/io/circe:circe_parser",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scalanlp:breeze",
        "//external:jar/com/spotify/featran_core_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "featran_java_2_11",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/com/spotify/featran_java_2_11",
        ":featran_core_2_11",
        ":featran_tensorflow",
        ":featran_xgboost_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "featran_scio",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":featran_core_2_11"
    ],
    jars = [
        "//external:jar/com/spotify/featran_scio_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "featran_tensorflow",
    exports = [
        "//3rdparty/jvm/me/lyh:shapeless_datatype_tensorflow",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/tensorflow:proto",
        ":featran_core_2_11"
    ],
    jars = [
        "//external:jar/com/spotify/featran_tensorflow_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "featran_xgboost_2_11",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/com/spotify/featran_xgboost_2_11",
        ":featran_core_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scio_avro",
    exports = [
        "//3rdparty/jvm/com/google/cloud/bigtable:bigtable_protos",
        "//3rdparty/jvm/io/grpc:grpc_auth",
        "//3rdparty/jvm/io/grpc:grpc_context",
        "//3rdparty/jvm/io/grpc:grpc_core",
        "//3rdparty/jvm/io/grpc:grpc_netty",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/org/apache/avro:avro",
        "//3rdparty/jvm/org/apache/avro:avro_compiler",
        "//3rdparty/jvm/org/apache/beam:beam_sdks_java_io_google_cloud_platform",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    jars = [
        "//external:jar/com/spotify/scio_avro_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scio_bigquery",
    exports = [
        "//3rdparty/jvm/com/google/cloud/bigtable:bigtable_protos",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/io/grpc:grpc_auth",
        "//3rdparty/jvm/io/grpc:grpc_context",
        "//3rdparty/jvm/io/grpc:grpc_core",
        "//3rdparty/jvm/io/grpc:grpc_netty",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/apache/avro:avro_compiler",
        "//3rdparty/jvm/org/apache/beam:beam_sdks_java_io_google_cloud_platform",
        "//3rdparty/jvm/org/joda:joda_convert",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    jars = [
        "//external:jar/com/spotify/scio_bigquery_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scio_core",
    exports = [
        "//3rdparty/jvm/com/esotericsoftware:kryo_shaded",
        "//3rdparty/jvm/com/fasterxml/jackson/module:jackson_module_scala",
        "//3rdparty/jvm/com/github/alexarchambault:case_app",
        "//3rdparty/jvm/com/google/auto/service:auto_service",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/twitter:algebird_core",
        "//3rdparty/jvm/com/twitter:chill",
        "//3rdparty/jvm/com/twitter:chill_algebird",
        "//3rdparty/jvm/com/twitter:chill_protobuf",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/io/grpc:grpc_all",
        "//3rdparty/jvm/me/lyh:protobuf_generic",
        "//3rdparty/jvm/org/apache/avro:avro_compiler",
        "//3rdparty/jvm/org/apache/beam:beam_sdks_java_core",
        "//3rdparty/jvm/org/apache/commons:commons_math3",
        "//3rdparty/jvm/org/apache/xbean:xbean_asm5_shaded",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        ":scio_avro",
        ":scio_bigquery"
    ],
    jars = [
        "//external:jar/com/spotify/scio_core_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scio_tensorflow",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/io/circe:circe_core",
        "//3rdparty/jvm/io/circe:circe_generic",
        "//3rdparty/jvm/io/circe:circe_parser",
        "//3rdparty/jvm/me/lyh:shapeless_datatype_tensorflow",
        "//3rdparty/jvm/org/apache/avro:avro_compiler",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/tensorflow:proto",
        "//3rdparty/jvm/org/tensorflow:tensorflow",
        ":featran_core_2_11",
        ":featran_scio",
        ":featran_tensorflow",
        ":scio_core",
        ":zoltar_api",
        ":zoltar_tensorflow"
    ],
    jars = [
        "//external:jar/com/spotify/scio_tensorflow_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scio_test",
    exports = [
        "//3rdparty/jvm/com/novocode:junit_interface",
        "//3rdparty/jvm/org/apache/avro:avro_compiler",
        "//3rdparty/jvm/org/apache/beam:beam_runners_direct_java",
        "//3rdparty/jvm/org/hamcrest:hamcrest_all",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scalatest:scalatest",
        ":scio_core"
    ],
    jars = [
        "//external:jar/com/spotify/scio_test_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "zoltar_api",
    exports = [
        "//external:jar/com/spotify/zoltar_api",
        ":zoltar_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "zoltar_core",
    exports = [
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/cloud:google_cloud_nio",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java_util",
        "//external:jar/com/spotify/zoltar_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "zoltar_tensorflow",
    exports = [
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/tensorflow:proto",
        "//3rdparty/jvm/org/tensorflow:tensorflow",
        "//external:jar/com/spotify/zoltar_tensorflow",
        ":completable_futures",
        ":zoltar_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


