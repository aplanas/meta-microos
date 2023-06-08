SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python310-azure-mgmt-automation-1.1.0b2-1.3.noarch.rpm"
RPM_HASH = "1c75f1cc8cff53d5a089dc2681a138bb11afca05f930546766c5ed23cecd352a460b5c6c89294bee486d9ff4e3deed7aaca55584bbebaaa9c83033dfad1e20da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-automation python3.10dist(azure-mgmt-automation) python310-azure-mgmt-automation python3dist(azure-mgmt-automation)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
