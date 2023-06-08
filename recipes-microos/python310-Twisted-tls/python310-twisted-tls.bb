SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-tls-22.10.0-5.1.noarch.rpm"
RPM_HASH = "3648fa0e6f43ee13185917295533d1139d0dea5f69d7f428f8d57a608139b3a41198cbb6ea1272f57dd17d33bfb26d4da3e663c497f59d483e778353fff730aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-tls python310-Twisted-tls"
RDEPENDS:${PN} += "python310-Twisted python310-idna python310-pyOpenSSL python310-service_identity"

inherit rpm
