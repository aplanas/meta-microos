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

RPM_NAME = "python311-kombu-5.2.4-3.1.noarch.rpm"
RPM_HASH = "e245c06e26403485ff738a45e499dc75e59cf23f7ec1fca10f2f1304ced5c2d89d4b738c7945a297150b176bcfe0076e3f450e6b133c087a9860d5d6b2f5c7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kombu) python311-kombu python3dist(kombu)"
RDEPENDS:${PN} += "python(abi) python311-amqp python311-cached-property python311-importlib-metadata python311-setuptools python311-vine"

inherit rpm
