SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-databoxedge-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "4b6b0d439529c5cee2a46d52fc8b1c21ffb82a55283e86542f1b9c3f2a6da6637e5a7d0e2e2ed2753537e45539926268c7ae205aa07aa28bd77a315110c39515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-databoxedge) python311-azure-mgmt-databoxedge python3dist(azure-mgmt-databoxedge)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
