SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python311-azure-mgmt-eventhub-11.0.0-1.1.noarch.rpm"
RPM_HASH = "3244e278859416e39056cede282d80b0b234c35bbd29f75693815d5ee6dad9ca2d0aa943992d0f445a3a87e177866569edf1855de2522f5ab15bfc36444cfc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-eventhub) python311-azure-mgmt-eventhub python3dist(azure-mgmt-eventhub)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
