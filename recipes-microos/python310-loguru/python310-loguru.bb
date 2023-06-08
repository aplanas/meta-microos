SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-loguru-0.7.0-1.1.noarch.rpm"
RPM_HASH = "8befae3c605f9e25de1290a296caaaa8130ee0d40ba8ff6b288f9c9d862e14807f15841040e51ba5abd28e05b4015273df67d83c30d83028faffa5ddb64c7a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-loguru python3.10dist(loguru) python310-loguru python3dist(loguru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
