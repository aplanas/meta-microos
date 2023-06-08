SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python39-rq-1.11.1-2.4.noarch.rpm"
RPM_HASH = "9272c8e58fa828491e3f797fae73419125e05fc99c1930b1e8acd731a6f083eccbad19915c194c93584276f7ac39a8d4f09c1a5b8ab897d55b1b5bf0b29156e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rq) python39-rq python3dist(rq)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-redis update-alternatives"

inherit rpm
