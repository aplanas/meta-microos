SUMMARY = "CTypes based LibRaw bindings"
DESCRIPTION = "The rawkit (pronounced rocket) module is a ctypes-based LibRaw \
binding for Python inspired by the Wand API."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-rawkit-0.6.0-3.5.noarch.rpm"
RPM_HASH = "e5fd282548727ed8e8d3b800be795fa120b979895dfa76922aa948cb2cf1e06e3d3df8def9a3402a19afa5004369e3d65727fb111fb6527cd243be9213a6142a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rawkit) python311-rawkit python3dist(rawkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
