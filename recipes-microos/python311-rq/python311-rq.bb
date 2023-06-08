SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python311-rq-1.11.1-2.4.noarch.rpm"
RPM_HASH = "15d00e8e3a16ed0254992384cff338b76caebbc82ce066c71db175856bf90b46465ab91c4fcde2b4c5b00805cd8653c7b5e4acf25c17c236d3db40c2c01c5db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rq) python311-rq python3dist(rq)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-click python311-redis update-alternatives"

inherit rpm
