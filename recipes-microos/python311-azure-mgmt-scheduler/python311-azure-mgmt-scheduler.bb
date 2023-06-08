SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-scheduler-2.0.0-4.11.noarch.rpm"
RPM_HASH = "13554247982dc55c7c9328453a2f6beec70c3e34ace2bf184d4cb6db40c67df6204e2f8a08ac06e9843e2bbf625a0d984223e90d52493d843631e0b200d240c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-scheduler) python311-azure-mgmt-scheduler python3dist(azure-mgmt-scheduler)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrestazure"

inherit rpm
