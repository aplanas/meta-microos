SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-tls-22.10.0-6.1.noarch.rpm"
RPM_HASH = "bff89d20cc344fd515f99f1e9d5e1126181418bff2ed0909eb667368d9d8997205cc2e75b65e82799a49b71112b3fb1d2737c65861b16c625da7ff0c4aa2eaa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-tls"
RDEPENDS:${PN} += "python311-Twisted python311-idna python311-pyOpenSSL python311-service_identity"

inherit rpm
