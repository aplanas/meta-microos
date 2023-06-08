SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "29.1.0"

RPM_NAME = "python310-azure-mgmt-compute-29.1.0-1.3.noarch.rpm"
RPM_HASH = "1ff707b8f6d9161ce573fa5828d844d6ac01024cf196f76c44f486959686adbc36838f09501e6281c911741b53fc706ec504fc714dce9331d796ce0ca8529bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-compute python3.10dist(azure-mgmt-compute) python310-azure-mgmt-compute python3dist(azure-mgmt-compute)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
