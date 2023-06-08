SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python310-rq-1.11.1-2.4.noarch.rpm"
RPM_HASH = "c80d803ac7d17fb45fbdf4af9f33e00ba65c53d6fb437ebe01e8e2009298ed312a8d5697e880ca37de6858f400fee8eb7b2b2c676ac762e5a13300a4d72ea353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rq python3.10dist(rq) python310-rq python3dist(rq)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-click python310-redis update-alternatives"

inherit rpm
