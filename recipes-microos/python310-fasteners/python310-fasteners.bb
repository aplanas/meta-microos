SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.17.3"

RPM_NAME = "python310-fasteners-0.17.3-1.4.noarch.rpm"
RPM_HASH = "67b1ef3987cf167ea9d460d453b7794f3e66f29b5085fed9273cf6c9a43fa6c5570452de30656721e18f5296d81749d38c7257c5468aeb11acc0e75ab101df2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fasteners python3.10dist(fasteners) python310-fasteners python3dist(fasteners)"
RDEPENDS:${PN} += "python(abi) python310-more-itertools python310-six"

inherit rpm
