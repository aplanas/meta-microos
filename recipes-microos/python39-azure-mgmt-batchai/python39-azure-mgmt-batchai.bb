SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0b1"

RPM_NAME = "python39-azure-mgmt-batchai-7.0.0b1-1.8.noarch.rpm"
RPM_HASH = "d580755532763a66ef78769991a880042b3f883736f8db056a3fbb9064376f8fa8a8b7687a0fbd161d65ebd988b1fac0a33772e75731e176b0df879de6e7edcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-batchai) python39-azure-mgmt-batchai python3dist(azure-mgmt-batchai)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
