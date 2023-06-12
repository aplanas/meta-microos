SUMMARY = "Collection of Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a collection of persistent (disk-based) queues for Python. \
 \
Queuelib goals are speed and simplicity. It was originally part of the \
`Scrapy framework`_ and stripped out on its own library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python39-queuelib-1.6.2-1.8.noarch.rpm"
RPM_HASH = "88ad609f4b47464156517e47275a28f5f9e31789b4b1d93f574447ced11a507b63d7826142fc43b956d82d331a8f3b1ad100dd0e16b065b78c2985ae52480fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(queuelib) \
python39-queuelib \
python3dist(queuelib)"
RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm
