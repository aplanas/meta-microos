SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-xcffib-1.2.0-2.1.noarch.rpm"
RPM_HASH = "40318736c697ebaaf76514011e5590d927dec9f57e90453c0ad04c12f041206e8949a8de31b4d8ecc07db55963177edd276a1a864537c9f92963dab36634ca7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xcffib) python39-xcffib python3dist(xcffib)"
RDEPENDS:${PN} += "python(abi) python39-cffi"

inherit rpm
