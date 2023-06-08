SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "python39-azure-mgmt-recoveryservicesbackup-5.2.0-1.2.noarch.rpm"
RPM_HASH = "04572a8b986cc58379f992e3747d3aababe4ae1a462888be545e0053ec8fd09bb926046bc2a5934c6e17a2b8cac56fcabfd4ef454845fb062659935c3013e515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-recoveryservicesbackup) python39-azure-mgmt-recoveryservicesbackup python3dist(azure-mgmt-recoveryservicesbackup)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
