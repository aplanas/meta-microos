SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-sphinx-version-warning-1.1.2-2.1.noarch.rpm"
RPM_HASH = "67f4b28671445a645a7888fd8b4dc40d0bea8a5dd9cc75beb53fb5c7104e0095539da9f1ad67f26a3508ba733a81fba64ba3010f3e57dfc7943d1697296dd8f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-version-warning python3.10dist(sphinx-version-warning) python310-sphinx-version-warning python3dist(sphinx-version-warning)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
