SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-scheduler-2.0.0-4.11.noarch.rpm"
RPM_HASH = "15905e1b2c9ae92e690ef2ce89de1fc82cdf6de19309ae0fcc76811b135dd9a07ddbbaab2e19e4561ff281e7559312a23c09a6f9e1d6a9c3b3f14cbe53fa9de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-scheduler) \
python39-azure-mgmt-scheduler \
python3dist(azure-mgmt-scheduler)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
