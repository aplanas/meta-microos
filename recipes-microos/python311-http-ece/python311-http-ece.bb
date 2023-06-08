SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-http-ece-1.1.0-4.2.noarch.rpm"
RPM_HASH = "46d1e2167dd8afd8de40222ab46e0e3035c8ff583fe22a4bba77ca36170af4f8d72dd6a92235a3dcc3ca689398b76b5c6338e87015a67693399df08b7b622660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(http-ece) python311-http-ece python3dist(http-ece)"
RDEPENDS:${PN} += "python(abi) python311-cryptography"

inherit rpm
