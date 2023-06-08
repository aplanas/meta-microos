SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python311-url-normalize-1.4.3-1.15.noarch.rpm"
RPM_HASH = "4817a7fe1ad23beaeb3e3380f34d108a6a5e62d3c715ecf366a7196144ead8a766fd4575eb829cc0f2657d79569d019ad950722d2a2bbf83c033a6bf0f2e3324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(url-normalize) python311-url-normalize python3dist(url-normalize)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
