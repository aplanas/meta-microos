SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-storagesync-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "f50b3d3ce9469f2cc8deed27c820c2772ef8031dffc441effd8546b925af102e53768490195009ba6db1bc6aef8ae4e2aba25ed36118ef1643f848fe9211e31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagesync python3.10dist(azure-mgmt-storagesync) python310-azure-mgmt-storagesync python3dist(azure-mgmt-storagesync)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
