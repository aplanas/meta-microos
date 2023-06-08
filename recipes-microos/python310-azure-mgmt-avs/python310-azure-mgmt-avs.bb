SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-azure-mgmt-avs-7.1.0-1.3.noarch.rpm"
RPM_HASH = "2b466351967bb0d02ec9e120471527a2a1c7c48be93e6358a5076aaf3d31aac93d7598d16c58f4b2d403b2d8c388e1027ae8083bd9e826ef586d94bc5facedd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-avs python3.10dist(azure-mgmt-avs) python310-azure-mgmt-avs python3dist(azure-mgmt-avs)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
