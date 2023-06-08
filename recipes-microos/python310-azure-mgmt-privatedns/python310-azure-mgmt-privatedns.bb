SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-privatedns-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "bd83fc509366f074476f125e4fd2e62d798c49be7c3f4a43532a14baf2c2bb98684697c6423b2f39511d98d2640a9c688529732112dce4e071fd81165c26ec19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-privatedns python3.10dist(azure-mgmt-privatedns) python310-azure-mgmt-privatedns python3dist(azure-mgmt-privatedns)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
