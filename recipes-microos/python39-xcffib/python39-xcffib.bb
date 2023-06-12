SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python39-xcffib-1.3.0-1.1.noarch.rpm"
RPM_HASH = "baa6b277b25e3d46c618180a28f975cec7420ef6a1ce4f51e66fb22f528a6735f8e4cf977f86b450e6e0cd6e43f5154fd63dfe75628b4d5d7d13a7bbfa4454a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xcffib) \
python39-xcffib \
python3dist(xcffib)"
RDEPENDS:${PN} += "python(abi) \
python39-cffi"

inherit rpm
