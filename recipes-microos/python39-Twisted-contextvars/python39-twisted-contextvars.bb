SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-contextvars-22.10.0-5.1.noarch.rpm"
RPM_HASH = "0ba2ee692117651eaa44ac79599d0a9c77aa89ba21bbab18fb69fa64bcf45db6bf3f55f194b0fdef1065f7373b0d63533257271f5c0797be3c3b984511bb3007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-contextvars"
RDEPENDS:${PN} += "python39-Twisted"

inherit rpm
