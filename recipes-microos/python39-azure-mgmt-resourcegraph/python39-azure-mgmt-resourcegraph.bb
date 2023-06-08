SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-resourcegraph-8.0.0-1.8.noarch.rpm"
RPM_HASH = "e1d9f3f8d183a1d33ff61442e79e4466a1fcb18d354ae3c2b9b1593ae209fad9b1990a7bd8a885759fc10269e452631c7c35b548566733671e8b9c5183c4c9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-resourcegraph) python39-azure-mgmt-resourcegraph python3dist(azure-mgmt-resourcegraph)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
