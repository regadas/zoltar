load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "beam_model_pipeline",
    exports = [
        "//3rdparty/jvm/com/google/errorprone:error_prone_annotations",
        "//external:jar/org/apache/beam/beam_model_pipeline"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "beam_runners_direct_java",
    exports = [
        "//3rdparty/jvm/args4j:args4j",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/beam/beam_runners_direct_java",
        ":beam_model_pipeline",
        ":beam_sdks_java_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "beam_sdks_java_core",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/apache/avro:avro",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/tukaani:xz",
        "//3rdparty/jvm/org/xerial/snappy:snappy_java",
        "//external:jar/org/apache/beam/beam_sdks_java_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "beam_sdks_java_extensions_google_cloud_platform_core",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/api_client:google_api_client",
        "//3rdparty/jvm/com/google/apis:google_api_services_cloudresourcemanager",
        "//3rdparty/jvm/com/google/apis:google_api_services_storage",
        "//3rdparty/jvm/com/google/auth:google_auth_library_credentials",
        "//3rdparty/jvm/com/google/auth:google_auth_library_oauth2_http",
        "//3rdparty/jvm/com/google/cloud/bigdataoss:gcsio",
        "//3rdparty/jvm/com/google/cloud/bigdataoss:util",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/beam/beam_sdks_java_extensions_google_cloud_platform_core",
        ":beam_sdks_java_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "beam_sdks_java_extensions_protobuf",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/org/apache/beam/beam_sdks_java_extensions_protobuf",
        ":beam_sdks_java_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "beam_sdks_java_io_google_cloud_platform",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/api/grpc:grpc_google_cloud_pubsub_v1",
        "//3rdparty/jvm/com/google/api/grpc:proto_google_cloud_pubsub_v1",
        "//3rdparty/jvm/com/google/api:gax_grpc",
        "//3rdparty/jvm/com/google/api_client:google_api_client",
        "//3rdparty/jvm/com/google/apis:google_api_services_bigquery",
        "//3rdparty/jvm/com/google/apis:google_api_services_pubsub",
        "//3rdparty/jvm/com/google/auth:google_auth_library_credentials",
        "//3rdparty/jvm/com/google/auth:google_auth_library_oauth2_http",
        "//3rdparty/jvm/com/google/cloud/bigdataoss:util",
        "//3rdparty/jvm/com/google/cloud/bigtable:bigtable_client_core",
        "//3rdparty/jvm/com/google/cloud/bigtable:bigtable_protos",
        "//3rdparty/jvm/com/google/cloud/datastore:datastore_v1_proto_client",
        "//3rdparty/jvm/com/google/cloud/datastore:datastore_v1_protos",
        "//3rdparty/jvm/com/google/cloud:google_cloud_core_grpc",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/io/grpc:grpc_all",
        "//3rdparty/jvm/io/grpc:grpc_auth",
        "//3rdparty/jvm/io/grpc:grpc_core",
        "//3rdparty/jvm/io/grpc:grpc_netty",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/io/netty:netty_handler",
        "//3rdparty/jvm/io/netty:netty_tcnative_boringssl_static",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/apache/avro:avro",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/beam/beam_sdks_java_io_google_cloud_platform",
        ":beam_sdks_java_core",
        ":beam_sdks_java_extensions_google_cloud_platform_core",
        ":beam_sdks_java_extensions_protobuf"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


