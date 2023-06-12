SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-azure-mgmt-recoveryservicesbackup-6.0.0-1.1.noarch.rpm"
RPM_HASH = "5be48fc1418a2fa6d0c8034c4c7a56a15d56d0ad85b125b4a1158eb1987f03a004473ca15fa0a867d54bc3a3a18500d7b018ec4b0a1b21a70e48b9876e17b792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicesbackup python3.10dist(azure-mgmt-recoveryservicesbackup) python310-azure-mgmt-recoveryservicesbackup python3dist(azure-mgmt-recoveryservicesbackup)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
