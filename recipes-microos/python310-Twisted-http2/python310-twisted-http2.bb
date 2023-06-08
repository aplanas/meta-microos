SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-http2-22.10.0-5.1.noarch.rpm"
RPM_HASH = "9078bf8a1350f3549ba843aa59a369f85108b520c4b9f322b5f4bfdd0de4bd699d5739307e68b77843958548788b6cf442cfab11ab95d0fe1ad999c5a40be488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-http2 python310-Twisted-http2"
RDEPENDS:${PN} += "python310-Twisted python310-h2 python310-priority"

inherit rpm
