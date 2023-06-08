SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python310-enrich-1.2.7-2.1.noarch.rpm"
RPM_HASH = "46f77823ac937762d758b5d32e214fd452528978aa96136ff93439e1ec0ea8756ccc42f9c6aadc307b9f035c9c36bfc30d7dae705d35d8d0271bdb275b7a542b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enrich python3.10dist(enrich) python310-enrich python3dist(enrich)"
RDEPENDS:${PN} += "python(abi) python3.10dist(rich)"

inherit rpm
