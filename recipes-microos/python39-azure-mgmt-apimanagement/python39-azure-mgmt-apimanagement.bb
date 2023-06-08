SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-azure-mgmt-apimanagement-4.0.0-1.1.noarch.rpm"
RPM_HASH = "55d9e0c23349764d3d80e19cb9866ea18f06d6abb18b62cdbd066a9933e33349fe9a2b8ca7e3962898a3b43e03849f5b814cb76bf9baac62313626e55e918a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-apimanagement) python39-azure-mgmt-apimanagement python3dist(azure-mgmt-apimanagement)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
