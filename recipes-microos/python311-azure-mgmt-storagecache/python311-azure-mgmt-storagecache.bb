SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-azure-mgmt-storagecache-1.4.0-1.3.noarch.rpm"
RPM_HASH = "741e85d13087dab7c5a1d3ad3089320885f333d5eee7636f5cefcd321bf507a1546b89d1dc98a0f025a3ca0d5462bc969290d8e1ccc9f8d0873a54e03e75e65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-storagecache) python311-azure-mgmt-storagecache python3dist(azure-mgmt-storagecache)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
