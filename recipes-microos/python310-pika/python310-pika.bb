SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python310-pika-1.3.1-1.3.noarch.rpm"
RPM_HASH = "4ec03d37bac5d310894bc6fe03a808de8c2ca004a8910abb63bea18e098f06ca4f95aa8ecef2e4bb2036aa00c5844b25494bf615813adf9e31aa3f9e82447175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pika python3.10dist(pika) python310-pika python3dist(pika)"
RDEPENDS:${PN} += "python(abi) python310"

inherit rpm
