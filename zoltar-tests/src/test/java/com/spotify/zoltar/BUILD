java_library(
    name = "zoltar",
    srcs = glob(["**/*Test.java"]),
    deps = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/hamcrest:hamcrest_all",
        "//3rdparty/jvm/org/tensorflow:tensorflow",
        "//3rdparty/jvm/com/spotify:featran_java_2_11",
        "//3rdparty/jvm/ml/dmlc:xgboost4j",
        "//3rdparty/jvm/com/spotify:completable_futures",
        "//zoltar-api",
        "//zoltar-core",
        "//zoltar-tensorflow",
        "//zoltar-xgboost",
        "//zoltar-featran",
        "//zoltar-tests"
    ]
)

java_test(
    name = "MultiPredictorTest",
    size = "small",
    srcs = ["MultiPredictorTest.java"],
    resources = ["//zoltar-tests/src/test/resources"],
    deps = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/com/google/guava:guava",
        "//zoltar-api",
        "//zoltar-core",
        "//zoltar-tests",
        ":zoltar"
    ],
)

java_test(
    name = "PredictionTest",
    size = "small",
    srcs = ["PredictionTest.java"],
    deps = [
        "//3rdparty/jvm/junit:junit",
        "//zoltar-core",
    ],
)

java_test(
    name = "PredictorBuilderTest",
    size = "small",
    srcs = ["PredictorBuilderTest.java"],
    deps = [
        "//3rdparty/jvm/junit:junit",
        "//zoltar-core",
    ],
)

java_test(
    name = "VectorTest",
    size = "small",
    srcs = ["VectorTest.java"],
    deps = [
        "//3rdparty/jvm/junit:junit",
        "//zoltar-core",
    ],
)

java_test(
    name = "PredictorTest",
    size = "small",
    srcs = ["PredictorTest.java"],
    deps = [
        "//3rdparty/jvm/junit:junit",
        "//zoltar-core",
    ],
)