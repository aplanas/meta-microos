SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-azure-mgmt-storagecache-1.4.0-1.3.noarch.rpm"
RPM_HASH = "98c5beb85d92f69178bd915b610867e28152cdc27d15fb49b33c7d006d1bae5089a05e485c2807268b3dcc14abe1db71f9dd50916aef51c34fa65e4eba90f99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-storagecache) \
python39-azure-mgmt-storagecache \
python3dist(azure-mgmt-storagecache)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
