SUMMARY = "Microsoft Azure DocumentDB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DocumentDB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python311-azure-mgmt-documentdb-0.1.3-6.11.noarch.rpm"
RPM_HASH = "8a4f8d30fa32631da47e7112650a0f6044318f38f666d501df0165529ab6623b6af59bd9a3940cd6a607d4740fb49572f17b394276c47095a0c6628a2d82441c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-documentdb) python311-azure-mgmt-documentdb python3dist(azure-mgmt-documentdb)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrestazure"

inherit rpm
