SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python310-jaraco.context-4.1.1-1.4.noarch.rpm"
RPM_HASH = "4c0ae3631b387c6f718aa8b0f88ae007a5dcdc1c7ac780ced6a9b19bff0fc64ca7b026f78689c7ffaf91fa9e1f2598364458790c2fe2a621f5b67c67965ea751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.context python3.10dist(jaraco.context) python310-jaraco.context python3dist(jaraco.context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
