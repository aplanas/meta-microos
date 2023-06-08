SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-azure-mgmt-edgegateway-0.1.0-2.18.noarch.rpm"
RPM_HASH = "adfa36cf30604796217627f37a65abda72771d3b46bfed23f4876f6dcc2e3cf39b30ee5a7fbb2d1724a4fb855abe2c526ad309a69d88325f823c26724d80da4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-edgegateway) python311-azure-mgmt-edgegateway python3dist(azure-mgmt-edgegateway)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest python311-msrestazure"

inherit rpm
