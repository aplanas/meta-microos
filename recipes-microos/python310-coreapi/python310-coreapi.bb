SUMMARY = "Python client library for Core API"
DESCRIPTION = "Python client library for Core API, a format-independent Document Object Model \
for representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "2.3.3"

RPM_NAME = "python310-coreapi-2.3.3-1.22.noarch.rpm"
RPM_HASH = "e5743f7bac61a4e686a0b687954931fac3a406b6afcc6ae80889b04fd53e317c00e3dddb08dbcced507331170b3cd43362ec979aa664b8389a77e9082f167042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coreapi \
python3.10dist(coreapi) \
python310-coreapi \
python3dist(coreapi)"
RDEPENDS:${PN} += "python(abi) \
python310-coreschema \
python310-itypes \
python310-requests \
python310-uritemplate"

inherit rpm
