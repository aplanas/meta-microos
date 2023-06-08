SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-deploymentmanager-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "a2a922ba6617a18b204cda0734e43af33037eb03b1978c96dbd6a297de325966ff51c84abf61cecafdce619128478d590ea5f7f4284e8f252d2286edd0e4453e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-deploymentmanager) python311-azure-mgmt-deploymentmanager python3dist(azure-mgmt-deploymentmanager)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
