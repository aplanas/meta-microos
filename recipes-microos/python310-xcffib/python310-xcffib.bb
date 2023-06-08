SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-xcffib-1.2.0-2.1.noarch.rpm"
RPM_HASH = "214e8fa9ebf377b85f8063cf473423e2e05eb3f0280c227917bb34985e75cbfd016d177414ac244fea5b8ddf397e93e536d8f49dc4d161af2cef62e1e1752759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xcffib python3.10dist(xcffib) python310-xcffib python3dist(xcffib)"
RDEPENDS:${PN} += "python(abi) python310-cffi"

inherit rpm
