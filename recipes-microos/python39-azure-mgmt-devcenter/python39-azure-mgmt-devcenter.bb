SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-mgmt-devcenter-1.0.0b4-1.3.noarch.rpm"
RPM_HASH = "4f8a1173c05ef9cbadb9e0148176aa60b29ab326f09003c3684e6f344d361ed00c3d9969f3cd78e5649062a5980b755e256f7f45312e0c44d3db497d8d22507e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-devcenter) python39-azure-mgmt-devcenter python3dist(azure-mgmt-devcenter)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
