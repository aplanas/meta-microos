SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "python310-azure-mgmt-recoveryservicesbackup-5.2.0-1.2.noarch.rpm"
RPM_HASH = "0ee292c09bdfd2ccc483f9bad165e463d1a0e764c1570011d3ae7a63f5d1de696229ac941e9d10be54566e04ceb14f610c9afe44f9b319aefe28f8fd477f4971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicesbackup python3.10dist(azure-mgmt-recoveryservicesbackup) python310-azure-mgmt-recoveryservicesbackup python3dist(azure-mgmt-recoveryservicesbackup)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
