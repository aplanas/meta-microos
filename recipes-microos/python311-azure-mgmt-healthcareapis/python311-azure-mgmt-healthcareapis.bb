SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-healthcareapis-1.1.0-1.6.noarch.rpm"
RPM_HASH = "3418015f4900de0dcf1286f5094137be281a43e054a1fedd254a8eacaca8bd0d40e82b3b0e23695e0553678fdd5de063a5ecbfabb3f0de36e56ca20915fdd220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-healthcareapis) python311-azure-mgmt-healthcareapis python3dist(azure-mgmt-healthcareapis)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
