SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python310-url-normalize-1.4.3-1.15.noarch.rpm"
RPM_HASH = "7adee2dd52fb173e2271b7a6945c65def6b10674e91b3c6d8c1d735800cdc86290bfd77a18ca3a76cc0cc9808aa0e84a155fcfb5093ea2eb021c5e71d7983aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-url-normalize python3.10dist(url-normalize) python310-url-normalize python3dist(url-normalize)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
