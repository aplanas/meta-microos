SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-hanaonazure-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "28617c4e0fc897f5ea8ae7266b18eceea754f6d28b3f6acf15f3d1304abc06038f61578faec0b3c51e8dca04f74fac67eee9be9dc17a85bfdbe679f1f98743ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hanaonazure python3.10dist(azure-mgmt-hanaonazure) python310-azure-mgmt-hanaonazure python3dist(azure-mgmt-hanaonazure)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
