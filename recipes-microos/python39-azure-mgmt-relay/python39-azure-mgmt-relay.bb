SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-relay-1.1.0-1.8.noarch.rpm"
RPM_HASH = "37b718f7e1a6b98687cec50e0370f47dc48d80e2e34d3c7a92c2764c9ee775d7315dbe6b139f6fb18d9bdb4c3ba165320f7208a1909dbd5ad9fd33ad7dcff9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-relay) \
python39-azure-mgmt-relay \
python3dist(azure-mgmt-relay)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
