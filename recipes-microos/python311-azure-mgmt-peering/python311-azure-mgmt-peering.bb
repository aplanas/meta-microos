SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-peering-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "5d1e89b7094e5e8be876704fb852c1b530c82ba1099d18c46fffc2b8d5854ee05cf4d5d100e7534d4a6a485657d2ee331faa2f2b1f51905ee9d5c01f55a784b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-peering) python311-azure-mgmt-peering python3dist(azure-mgmt-peering)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
