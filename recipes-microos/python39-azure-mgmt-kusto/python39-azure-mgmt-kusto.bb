SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-mgmt-kusto-3.1.0-1.2.noarch.rpm"
RPM_HASH = "61c303a2bfb8906a6e6db884824811b21112d9fb634c41063cc3487edd43bb0cd96399498544049d18b45a5158f09d7d0c223e3527ec64e66f30d2bc9813075b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-kusto) \
python39-azure-mgmt-kusto \
python3dist(azure-mgmt-kusto)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
