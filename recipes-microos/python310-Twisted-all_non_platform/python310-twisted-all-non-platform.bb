SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-all_non_platform-22.10.0-5.1.noarch.rpm"
RPM_HASH = "668736fd9793839bbbe88bd3a6d16392021228b554cc69210a2076866cd4d9d381b5f584f69049f71d79414d3297a645f336892f985f70b0e4b919d740c6d0ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-all_non_platform python310-Twisted-all_non_platform"
RDEPENDS:${PN} += "python310-PyHamcrest python310-Twisted-conch python310-Twisted-contextvars python310-Twisted-http2 python310-Twisted-serial python310-Twisted-tls"

inherit rpm
