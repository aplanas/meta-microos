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

RPM_NAME = "python39-kombu-5.2.4-4.1.noarch.rpm"
RPM_HASH = "87d12e12d9c787f4d3924a276b1f44e6d1f28727f286c979ca9287665fdf8393038f6f0e30d26627a1bfa85f56d73239dabc45ad2c5b13f3cfd94eb940d833bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kombu) python39-kombu python3dist(kombu)"
RDEPENDS:${PN} += "python(abi) python39-amqp python39-cached-property python39-importlib-metadata python39-setuptools python39-vine"

inherit rpm
