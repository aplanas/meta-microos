SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-hanzidentifier-1.1.0-2.1.noarch.rpm"
RPM_HASH = "411e0206986d4979256b8d4d149f338ae4b633a607ea77a8188f7e658f7d2a99bcc9e21e75b36601bf775cebef885619f2d1fed07f16036af1b6448538ba1472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hanzidentifier python3.10dist(hanzidentifier) python310-hanzidentifier python3dist(hanzidentifier)"
RDEPENDS:${PN} += "python(abi) python310-zhon"

inherit rpm
