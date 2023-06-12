SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-costmanagement-4.0.0-1.1.noarch.rpm"
RPM_HASH = "6df5bc305bca4e01f1b59278d8f050095b2a866496e1a5fb34760e225d40f125b0d151bdd115a3d4449dc69d68c18cee0278a6198a66ba7c97be8d018708b87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-costmanagement) python311-azure-mgmt-costmanagement python3dist(azure-mgmt-costmanagement)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
