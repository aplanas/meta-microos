SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-labservices-2.0.0-1.3.noarch.rpm"
RPM_HASH = "e4baa9d501e9f06606a91fdfa9ddcf9c696f09df31db9b85a462e3de7e0e3a30ca87967a97f03ba7be904b9b78f5fb62154572afb3f77f8c9677136945738795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-labservices) python311-azure-mgmt-labservices python3dist(azure-mgmt-labservices)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
