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

RPM_NAME = "python311-kombu-5.2.4-4.1.noarch.rpm"
RPM_HASH = "243e1a3f1e74006c59684e7bce77a91e7d1ad5f6629bb77c21b2bd66bd7fd8fb1da8194a5d451c73806341c27051248dbfd2c772380e800db2eff4b4cd798cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kombu) python311-kombu python3dist(kombu)"
RDEPENDS:${PN} += "python(abi) python311-amqp python311-cached-property python311-importlib-metadata python311-setuptools python311-vine"

inherit rpm
