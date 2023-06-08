SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python311-purl-1.6-2.1.noarch.rpm"
RPM_HASH = "f0e436f37b62519939d1f1950649d0341a5bef6db0a3c05c725aef27e91f94c1e22032e96bf88d9237a5c04009956ec96d0535db0c0e97c33f9e2f2e386d8288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(purl) python311-purl python3dist(purl)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
