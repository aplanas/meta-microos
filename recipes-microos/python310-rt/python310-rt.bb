SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python310-rt-3.0.4-1.3.noarch.rpm"
RPM_HASH = "d6d35b74baa15461b073e434827d72803e385ea0be65f76fe4f992d143b09e1a72dcf3e7358109a6fc9a1b47faf83c463ebe4897ff8ede5a457774ac96a6f773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rt python3.10dist(rt) python310-rt python3dist(rt)"
RDEPENDS:${PN} += "python(abi) python310-requests python310-six"

inherit rpm
