SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python39-pika-1.3.1-1.3.noarch.rpm"
RPM_HASH = "277c38fd3d3ec90647fdc5a5048d790e0947cf19cf8e97614a934a9f195237fbeda08c58615aade296e8df349c00602b4f8b849da45c1ac9f00f9e9073f7a8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pika) \
python39-pika \
python3dist(pika)"
RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm
