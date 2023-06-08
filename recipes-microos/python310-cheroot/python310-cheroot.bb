SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python310-cheroot-9.0.0-2.2.noarch.rpm"
RPM_HASH = "73ba3d278c2d651ef11d5b829ad2725f83cbd6e29729a8b8777a9786b2d4bcbb8b178f7f0c667246f017bb7d24c7ab2636343b95206d62a6bfb3c603091b66fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cheroot python3-cheroot python3.10dist(cheroot) python310-Cheroot python310-cheroot python3dist(cheroot)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-jaraco.functools python310-more-itertools"

inherit rpm
