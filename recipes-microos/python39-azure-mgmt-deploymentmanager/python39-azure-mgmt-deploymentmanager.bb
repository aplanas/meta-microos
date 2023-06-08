SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-deploymentmanager-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "49355832d7717e851fb755dd8befdcc4e151e5796248f4a9fb89c7aa98b2e77b24cdcf1e8ee7e0dd4c8ed288cbe4a78d6609c9feae406cf20f48571d68897d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-deploymentmanager) python39-azure-mgmt-deploymentmanager python3dist(azure-mgmt-deploymentmanager)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
