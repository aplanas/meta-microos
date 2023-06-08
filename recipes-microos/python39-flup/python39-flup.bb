SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python39-flup-1.0.3.dev20161029-2.20.noarch.rpm"
RPM_HASH = "bf9da058b484207d1f2d7dd8c5504046fd5a40bf340be2e778d438431963d33d14b81655f7369fe55f0eab377cc9052cdc51f328d11f78f182b84a90670242da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flup) python39-flup python3dist(flup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
