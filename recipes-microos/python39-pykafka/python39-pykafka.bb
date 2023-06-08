SUMMARY = "Full-Featured Pure-Python Kafka Client"
DESCRIPTION = "PyKafka is a cluster-aware Kafka>=0.8.2 client for Python. It includes Python \
implementations of Kafka producers and consumers, which are optionally backed \
by a C extension built on `librdkafka`_, and runs under Python 2.7+, Python 3.4+, \
and PyPy. \
 \
.. _librdkafka: https://github.com/edenhill/librdkafka \
 \
PyKafka's primary goal is to provide a similar level of abstraction to the \
`JVM Kafka client`_ using idioms familiar to Python programmers and exposing \
the most Pythonic API possible."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python39-pykafka-2.8.0-2.21.aarch64.rpm"
RPM_HASH = "b52e140154110d6161124038b850324225b3eacae2deae4eafea8a953c3d4ad406bb74d60ca0c4d98c3f07740eeeb4b7414a4381927fce18b27237e98e302e67"

RPROVIDES:${PN} += "python3.9dist(pykafka) python39-pykafka python39-pykafka(aarch-64) python3dist(pykafka)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-gevent python39-kazoo python39-setuptools python39-six python39-tabulate"

inherit rpm
