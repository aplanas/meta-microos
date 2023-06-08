SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "python310-kazoo-2.9.0-1.3.noarch.rpm"
RPM_HASH = "2644b758c0285da96513bc69811c6b9755493fa7628a7425490dae2bab69398df6d6fb84ac8822bf5e00d5a2d3a47f853a63a9183d2e6764f4f6b81373a20d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kazoo python3.10dist(kazoo) python310-kazoo python3dist(kazoo)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
