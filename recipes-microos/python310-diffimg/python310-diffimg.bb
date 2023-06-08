SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-diffimg-0.3.0-1.8.noarch.rpm"
RPM_HASH = "a6afaf243e3b2e58b77c3caa8db40e0268005898bbef37cf24fe20046e8f5951c891ac0444963ae3a69f26e8fd05ba87cb0a4a90b3d873f8ca3a9938d3fffe53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diffimg python3.10dist(diffimg) python310-diffimg python3dist(diffimg)"
RDEPENDS:${PN} += "python(abi) python310-Pillow"

inherit rpm
