SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-http2-22.10.0-6.1.noarch.rpm"
RPM_HASH = "60f6928c3b2663fdf8ae15f3e81fa48cc5ee8899ed0aa0c4c6266413aada175fd12285315db98442a4ca2718e507bb7fa57ff338632071d30707676efcc31018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-http2"
RDEPENDS:${PN} += "python311-Twisted python311-h2 python311-priority"

inherit rpm
