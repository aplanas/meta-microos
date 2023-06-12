SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-installer-0.7.0-2.1.noarch.rpm"
RPM_HASH = "136a36eb9f8ebf5ff9e63eca75655f92f3bb1ccc4bf06147fb96190b419f31dd72e24893f6b3d9f112984fd87091cd3d73752b2d696052015616ad17ce9547f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(installer) \
python311-installer \
python3dist(installer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
