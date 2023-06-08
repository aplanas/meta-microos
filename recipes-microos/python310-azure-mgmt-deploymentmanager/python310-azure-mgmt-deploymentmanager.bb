SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-deploymentmanager-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "0f8c5dc83c063ebae67a9da8c57e1a4e55e3caaa5ae6bf710847de79e183b80c8448b9953596612143f020da331433d97f9d53306708ccf08c2706977bb333f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deploymentmanager python3.10dist(azure-mgmt-deploymentmanager) python310-azure-mgmt-deploymentmanager python3dist(azure-mgmt-deploymentmanager)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
