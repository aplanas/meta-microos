SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-storagesync-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "f2e4444c77893b7130ae82da3da92804c72b437fb8ec62ae843c4dd4e296b60b8c3dde47e76208e0f4143d584fba5f039fd44ae302528b37c3f4613820a39c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-storagesync) \
python311-azure-mgmt-storagesync \
python3dist(azure-mgmt-storagesync)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
