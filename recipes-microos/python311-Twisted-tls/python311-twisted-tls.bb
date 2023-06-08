SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-tls-22.10.0-5.1.noarch.rpm"
RPM_HASH = "1d6fd0c6ea891d12d823c0b81ed508355d1bcba6c5a8271a1f7d910a89704a8d71b488083139b941f203f8d0789ec18835d53f5d705456211298e329cc163612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-tls"
RDEPENDS:${PN} += "python311-Twisted python311-idna python311-pyOpenSSL python311-service_identity"

inherit rpm
