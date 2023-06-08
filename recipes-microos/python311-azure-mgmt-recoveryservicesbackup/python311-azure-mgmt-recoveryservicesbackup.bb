SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "python311-azure-mgmt-recoveryservicesbackup-5.2.0-1.2.noarch.rpm"
RPM_HASH = "9ba2f6106e74cac80d43a373237b6670b37ec2c5abea356a29458acfe4bc6213b8c98c6fd59dfd76974f9c6a9643b08152204fedceb5a875aec249d3a33195c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-recoveryservicesbackup) python311-azure-mgmt-recoveryservicesbackup python3dist(azure-mgmt-recoveryservicesbackup)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
