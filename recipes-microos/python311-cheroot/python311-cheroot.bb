SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python311-cheroot-9.0.0-2.2.noarch.rpm"
RPM_HASH = "e7f29abf93e739eca45e51b8f1f37d06253495dc4130b76bb862ba776094cb54ad80b29a1811552bf2c144e3b52edf243430482258be48964aa9e1227146ff1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cheroot) python311-Cheroot python311-cheroot python3dist(cheroot)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-jaraco.functools python311-more-itertools"

inherit rpm
