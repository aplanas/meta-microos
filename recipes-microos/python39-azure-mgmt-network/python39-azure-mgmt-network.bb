SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.0.1"

RPM_NAME = "python39-azure-mgmt-network-23.0.1-1.1.noarch.rpm"
RPM_HASH = "45290f757d490587241f4c99b4168cf889264d34df7635d8377370f89ffa9858292f1c019ac0331b10c32496f1de93006a49170eac3743d8b1a016ddb28d650d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-network) python39-azure-mgmt-network python3dist(azure-mgmt-network)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
