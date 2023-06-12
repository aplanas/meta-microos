SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python311-cassowary-0.5.2-2.8.noarch.rpm"
RPM_HASH = "3d88f79305a2b92d8a37a4d4f349d0e952a47fff1a45b1194636f87667de7f85c7a783e6463e64542f146d1b0cf437d288daa758c1e7cea01e30f3aaeef90ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cassowary) \
python311-cassowary \
python3dist(cassowary)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
