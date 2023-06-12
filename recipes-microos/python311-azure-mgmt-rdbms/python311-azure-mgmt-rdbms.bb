SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b9"

RPM_NAME = "python311-azure-mgmt-rdbms-10.2.0b9-1.1.noarch.rpm"
RPM_HASH = "06fccd4f7ea1c14b8a9789a37996a2f56236d65279ccb371680c74d7f720b51642ca44c29c6ca389f9ea66ba8092a9bdde73f7d08301d8cc833583e315c3b1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-rdbms) python311-azure-mgmt-rdbms python3dist(azure-mgmt-rdbms)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
