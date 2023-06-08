SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python311-pika-1.3.1-1.3.noarch.rpm"
RPM_HASH = "9e7e4267a97a79b48294454f5f35d17133c34d8fc1249fce93d267f80f9573fa33c9e9de12fabb340a74a91de08f8bccdc57105c4d235f5a98ed70d420052326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pika) python311-pika python3dist(pika)"
RDEPENDS:${PN} += "python(abi) python311"

inherit rpm
