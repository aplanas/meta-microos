SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.0.0"

RPM_NAME = "python311-azure-mgmt-batch-17.0.0-1.3.noarch.rpm"
RPM_HASH = "dbda1c3033b4f4c2b83caf5a61ac86fec805b33273315e115cc272ec39e5b8afa4614020630769a395ce3fb6a28dfb7d7a8882aad2a8d7b2487760723daa9dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-batch) python311-azure-mgmt-batch python3dist(azure-mgmt-batch)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
