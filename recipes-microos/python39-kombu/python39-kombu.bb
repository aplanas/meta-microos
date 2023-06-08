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

RPM_NAME = "python39-kombu-5.2.4-3.1.noarch.rpm"
RPM_HASH = "a737369e32440259d7818ccbc233593eaa3b0d97d5a57d9e871a283dd5c70957883badc397d413371e9ed2a294136ba861e8581f0b2e775f6d711f44646a5f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kombu) python39-kombu python3dist(kombu)"
RDEPENDS:${PN} += "python(abi) python39-amqp python39-cached-property python39-importlib-metadata python39-setuptools python39-vine"

inherit rpm
