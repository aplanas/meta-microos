SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-all_non_platform-22.10.0-5.1.noarch.rpm"
RPM_HASH = "a3977c2df85b41615ed8ea49e2e9ded4686b3ac6482c16b967060132777723e0fdc9a994f2ec9e58374426b3ce77035a28796e66029edbe1c4f03b8ec1e63429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-all_non_platform"
RDEPENDS:${PN} += "python39-PyHamcrest python39-Twisted-conch python39-Twisted-contextvars python39-Twisted-http2 python39-Twisted-serial python39-Twisted-tls"

inherit rpm
