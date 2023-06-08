SUMMARY = "Verify certificates using OS trust stores"
DESCRIPTION = "Verify certificates using OS trust stores. Supports macOS, \
Windows, and Linux (with OpenSSL). This project should be \
considered experimental."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-truststore-0.4.0-1.4.noarch.rpm"
RPM_HASH = "349f1d6eaa5c2b096df1e07145dabb86d2141b10384c2c4b122a641e08b9141cf51937cedd17617ed3d0a0500858da8255594208aa2f42667f1603c5aa6946ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(truststore) python311-truststore python3dist(truststore)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
