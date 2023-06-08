SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-http2-22.10.0-5.1.noarch.rpm"
RPM_HASH = "a4081f489370c03c22db4e6f1172e9daa3552b96ecc1d913cd334e473519c201e37edc5fd5889002a2c889a76b8871466de997413741ef76069876c9af955cdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-http2"
RDEPENDS:${PN} += "python311-Twisted python311-h2 python311-priority"

inherit rpm
