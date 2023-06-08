SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-xcffib-1.2.0-2.1.noarch.rpm"
RPM_HASH = "d8834f4b19a14adce8f55ca52d2bb1deef1e7bb186acfade8fcd027cb46dd14e560366f3c68d0cc34a79195aa2c5a0a6b745f835b746f09a8fabcc405a799a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xcffib) python311-xcffib python3dist(xcffib)"
RDEPENDS:${PN} += "python(abi) python311-cffi"

inherit rpm
