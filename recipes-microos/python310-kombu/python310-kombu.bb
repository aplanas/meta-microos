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

RPM_NAME = "python310-kombu-5.2.4-4.1.noarch.rpm"
RPM_HASH = "33afe9499abdf5a155cc683c747974c3a84b96a20f92b423a7e64a2d435209657f93d3fc24b7de4fb955427df446bcf6365467dd37a74da35c10b835f9659df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kombu python3.10dist(kombu) python310-kombu python3dist(kombu)"
RDEPENDS:${PN} += "python(abi) python310-amqp python310-cached-property python310-importlib-metadata python310-setuptools python310-vine"

inherit rpm
