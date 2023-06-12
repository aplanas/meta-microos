SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "python310-kafka-python-2.0.2-4.1.noarch.rpm"
RPM_HASH = "b837b9bfb698db356106c47fdfe10d1cc13077068beaef9a76a722e299fbc723fcd7d5b3951a40b836249920fec2e0b62e649dcc837eac3ddb92fcbc515d2819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kafka-python \
python3.10dist(kafka-python) \
python310-kafka-python \
python3dist(kafka-python)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
