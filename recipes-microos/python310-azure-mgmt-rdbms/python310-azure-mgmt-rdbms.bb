SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b9"

RPM_NAME = "python310-azure-mgmt-rdbms-10.2.0b9-1.1.noarch.rpm"
RPM_HASH = "29f2a332ff126ba604e8e8f133a64515e97137e67792cad6c4025d4fa56a7c380e2707058705ac6f9eda0af87dcbae08b8b1da95b0a1bc4f34012a0fc2d94129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-rdbms python3.10dist(azure-mgmt-rdbms) python310-azure-mgmt-rdbms python3dist(azure-mgmt-rdbms)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
