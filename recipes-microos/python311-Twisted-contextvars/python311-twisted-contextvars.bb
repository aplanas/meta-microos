SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-contextvars-22.10.0-5.1.noarch.rpm"
RPM_HASH = "5eef3b2dd85b818d04d45c784dde3c4689aba99886240a2cd920b039d41d7ae882317b52df92550e1f47422b5c0f7ba882ee477c3b00178c2095fc99fd3773cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-contextvars"
RDEPENDS:${PN} += "python311-Twisted"

inherit rpm
