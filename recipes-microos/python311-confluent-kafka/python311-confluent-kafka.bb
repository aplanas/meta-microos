SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python311-confluent-kafka-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "ce19761b48bf5038b13b9b0e361a57a6f39c77c64053da01efe9922e4134bb334a3de6bdfdf7db2007ab5dbd2d1f6e545ae3f9ea99c9d07d3bd6c5aefd3cf475"

RPROVIDES:${PN} += "python3.11dist(confluent-kafka) \
python311-confluent-kafka \
python311-confluent-kafka(aarch-64) \
python3dist(confluent-kafka)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
librdkafka.so.1()(64bit) \
python(abi)"

inherit rpm
