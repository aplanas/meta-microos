SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-all_non_platform-22.10.0-5.1.noarch.rpm"
RPM_HASH = "85d7385e56834dd2d7df58a0fd65bcebefabb07be673773354a4a44dde8ef7e551dff1f86da2e2b409fe6d8f3180b3e14bfeff2d627d0b5afe40750ef1d24205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-all_non_platform"
RDEPENDS:${PN} += "python311-PyHamcrest python311-Twisted-conch python311-Twisted-contextvars python311-Twisted-http2 python311-Twisted-serial python311-Twisted-tls"

inherit rpm
