SUMMARY = "AMQP Messaging Framework for Python"
DESCRIPTION = "An AMQP messaging framework for Python. \
 \
AMQP is the Advanced Message Queuing Protocol, an open standard protocol \
for message orientation, queuing, routing, reliability and security. \
 \
One of the most popular implementations of AMQP is RabbitMQ. \
 \
The aim of Kombu is to make messaging in Python as easy as possible by \
providing an idiomatic high-level interface for the AMQP protocol, and also \
provide proven and tested solutions to common messaging problems."
LICENSE = "BSD-3-Clause"

PV = "5.2.4"

RPM_NAME = "python310-kombu-5.2.4-3.1.noarch.rpm"
RPM_HASH = "8cb6b42323fd6fab952c7413ea1fa88e0ccc93e08b48157627503dacde940387f099fb2df39597c70fdd80713c3ec262f2afd0aa8a98043a9845d36daed1ddbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kombu python3.10dist(kombu) python310-kombu python3dist(kombu)"
RDEPENDS:${PN} += "python(abi) python310-amqp python310-cached-property python310-importlib-metadata python310-setuptools python310-vine"

inherit rpm
