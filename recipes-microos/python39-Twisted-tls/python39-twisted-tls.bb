SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-tls-22.10.0-5.1.noarch.rpm"
RPM_HASH = "497822245cf2745dfb8300edd317fa7a25321b9b5768d71b25b5159786033bfd1f45ffa3b298c89410854ee1eeb7cb3e9112c3a7060a129531a32471e0cf6e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-tls"
RDEPENDS:${PN} += "python39-Twisted python39-idna python39-pyOpenSSL python39-service_identity"

inherit rpm
