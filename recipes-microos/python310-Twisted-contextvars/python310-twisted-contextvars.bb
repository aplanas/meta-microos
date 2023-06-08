SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-contextvars-22.10.0-5.1.noarch.rpm"
RPM_HASH = "3edcc13f3c141282c42bf4a40742cf5de0f54f42363d11c3bf5f684482a880b97a4de67af1f3b19d310a9443fee28a87ab6e8a6913a40a5708c8ec957896d059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-contextvars python310-Twisted-contextvars"
RDEPENDS:${PN} += "python310-Twisted"

inherit rpm
