SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-hanaonazure-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "fe9b910bf150681e03e87679642dbb96f9e851d14e9e71c7c77a0d40351cf6a52c3fd284ffc7d13085d6d535ac38249ee672dea8c0f8b66695599b92aae73aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-hanaonazure) python39-azure-mgmt-hanaonazure python3dist(azure-mgmt-hanaonazure)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
