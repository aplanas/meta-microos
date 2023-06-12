SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-XStatic-1.0.3-1.1.noarch.rpm"
RPM_HASH = "9718bb502415b257d358be391b89e3a5b571c8c6f2a05982dd852869a481be16a1c51ccb28374e224f584284af9e1c654a8b2649927106d8130e33351f986e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xstatic) \
python311-XStatic \
python3dist(xstatic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
