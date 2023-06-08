SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python310-azure-mgmt-botservice-2.0.0.0-1.3.noarch.rpm"
RPM_HASH = "c720942a0d4fccec19349d365b94639ff5a7cb84594cf81557d9d1afddc514f1dde7bd472551f6ef7f13cd5cc5854e96a2f9a283e81e72035f5608a36a328509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-botservice python3.10dist(azure-mgmt-botservice) python310-azure-mgmt-botservice python3dist(azure-mgmt-botservice)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
