SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python39-url-normalize-1.4.3-1.15.noarch.rpm"
RPM_HASH = "ad138e2cdcef8d819e30abbf4a32443c0a84218950952ab96a2fd5451e3e475b094998432a669b011724a946fc2ea0c266a753614eda1b3f0ba46f6352c84326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(url-normalize) python39-url-normalize python3dist(url-normalize)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
