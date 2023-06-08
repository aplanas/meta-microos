SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-costmanagement-3.0.0-1.8.noarch.rpm"
RPM_HASH = "ffa49a7b8f309d32d4c8f1085f16af55769d6f336dac721d4b16f1b7eae22f81fcb2073b38b6ba051ff8c1ce6e0a7fbe65ee1457cd52bf597907b846b4c2bc37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-costmanagement python3.10dist(azure-mgmt-costmanagement) python310-azure-mgmt-costmanagement python3dist(azure-mgmt-costmanagement)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
