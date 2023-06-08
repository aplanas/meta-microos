SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "python310-azure-mgmt-resource-23.0.0-1.2.noarch.rpm"
RPM_HASH = "dc8a9277c24863b61be8156fec2d5f90e00a9d674db943178d1596a8366c1f695c6f7526cff4e30d7e24bcbc9a0d4fd5815f1f30660e144ba808443f3b4e8373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource python3.10dist(azure-mgmt-resource) python310-azure-mgmt-resource python3dist(azure-mgmt-resource)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
