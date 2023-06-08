SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-attestation-1.0.0.0-1.10.noarch.rpm"
RPM_HASH = "a4e456e33180ba3eb9c387dabec049b8b7dd9df243071de30af0b23d4d2ddc72d96c3c27d88d7b63c6fa492119d6476fe83ec9596544c46795ace385cc0a050c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-attestation python3.10dist(azure-mgmt-attestation) python310-azure-mgmt-attestation python3dist(azure-mgmt-attestation)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
