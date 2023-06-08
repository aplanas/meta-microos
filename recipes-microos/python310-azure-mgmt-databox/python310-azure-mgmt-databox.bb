SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-databox-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "239b8a1ef2d361bacc1a68b1a490f792969d777fc769b12c8bca1efb98a4957e5d01e72440ac5d00a85d0e1cb5623c4751019fa8c9ab65d66fe3d0b1575fb799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databox python3.10dist(azure-mgmt-databox) python310-azure-mgmt-databox python3dist(azure-mgmt-databox)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
