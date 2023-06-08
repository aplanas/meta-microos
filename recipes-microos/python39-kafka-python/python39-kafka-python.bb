SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "python39-kafka-python-2.0.2-4.1.noarch.rpm"
RPM_HASH = "7731d71dd792a26764876195c1f5b6838612e2b8e2b61e7b71803fcd5685b43be2cba5bb20dd94daa5c981466cb5432f8c15f275a9d84cc19188d956f430e7da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kafka-python) python39-kafka-python python3dist(kafka-python)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
