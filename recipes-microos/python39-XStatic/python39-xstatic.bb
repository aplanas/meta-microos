SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-XStatic-1.0.2-2.14.noarch.rpm"
RPM_HASH = "cef1bb0f910710380008488383948336d2056c90aa65b0370ae247a1e0c1bf08822623b559ad3d6e1a23a51b1a963066fceeda790f39110d74307d0d4e81b4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xstatic) python39-XStatic python3dist(xstatic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
