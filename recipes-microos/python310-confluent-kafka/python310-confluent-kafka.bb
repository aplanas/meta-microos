SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python310-confluent-kafka-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "ba874426f9a2afb1d76c6edf512213a0d9341247284723e4020a72d9cdfabf6441023364a871cebb0f926279231c8a6dfa425892f81c0023b9d333814a185adb"

RPROVIDES:${PN} += "python3-confluent-kafka python3.10dist(confluent-kafka) python310-confluent-kafka python310-confluent-kafka(aarch-64) python3dist(confluent-kafka)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librdkafka.so.1()(64bit) python(abi)"

inherit rpm
