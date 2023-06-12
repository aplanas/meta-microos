SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-diffimg-0.3.0-1.8.noarch.rpm"
RPM_HASH = "f72846c5cda66ae50e0f45c4878330d2f7858807467e0aa22cdb70723d05cde6d4f8095dcd9fdb0a1a5f7c7a38fdd60f345555b4f71821be9c41cc0efff26739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(diffimg) \
python39-diffimg \
python3dist(diffimg)"
RDEPENDS:${PN} += "python(abi) \
python39-Pillow"

inherit rpm
