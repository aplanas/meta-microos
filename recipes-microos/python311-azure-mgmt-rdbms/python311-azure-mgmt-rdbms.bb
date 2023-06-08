SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b7"

RPM_NAME = "python311-azure-mgmt-rdbms-10.2.0b7-1.1.noarch.rpm"
RPM_HASH = "2e8a07ef2b59381ecad1735c5344f18a8be351d67d4b6eff0e69461d7c86fe0a4846ee3e583ceb0f7d5a23a36ca7dd79d0e768fb7b535f92929424b09664eb3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-rdbms) python311-azure-mgmt-rdbms python3dist(azure-mgmt-rdbms)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
