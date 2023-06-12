SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-marketplaceordering-1.1.0-1.8.noarch.rpm"
RPM_HASH = "9f79c68ebfb93ac372416a6b9ae86c5e731463a2d69fd987b8be6815a06c4293f1a350299a9b291e9424fdcbbc61a1775512b8e5ffc347b3eb135be85d020fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-marketplaceordering) \
python39-azure-mgmt-marketplaceordering \
python3dist(azure-mgmt-marketplaceordering)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
