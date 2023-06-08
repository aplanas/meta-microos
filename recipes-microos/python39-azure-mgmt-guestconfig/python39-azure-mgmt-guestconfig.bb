SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-guestconfig-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "c3ac9a2fd1b31de8aab28ab10de6426b107ffcc4e81757a0fcca556794c99e9497a93ef2d61cd24c64a83c739a4a248c88f6459389440e0c7e3b6d30c6ef65ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-guestconfig) python39-azure-mgmt-guestconfig python3dist(azure-mgmt-guestconfig)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
