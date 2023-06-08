SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-diffimg-0.3.0-1.8.noarch.rpm"
RPM_HASH = "d2ffe3844b23c312bf6256b223a32623b62ada586c6732f50e3301a04b8256fd4e46e7f1ba50015ab0c16a38e29def04610cd0d14587106e2227ff9d5787c50b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(diffimg) python311-diffimg python3dist(diffimg)"
RDEPENDS:${PN} += "python(abi) python311-Pillow"

inherit rpm
