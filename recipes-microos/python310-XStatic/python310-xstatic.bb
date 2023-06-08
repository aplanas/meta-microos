SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-XStatic-1.0.2-2.14.noarch.rpm"
RPM_HASH = "016595c6ffb914d38f611abb8a68f9278a61266d421e3090a59efd1cc05a250f4c3a78999b7f876c8a1a55754ae87da7d22fa26a197cba66fafaa93ac5683685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic python3.10dist(xstatic) python310-XStatic python3dist(xstatic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
