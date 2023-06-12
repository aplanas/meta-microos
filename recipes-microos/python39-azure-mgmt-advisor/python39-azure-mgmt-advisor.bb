SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-advisor-9.0.0-1.10.noarch.rpm"
RPM_HASH = "4373c600cfd6f507f3bb8ae81e83ada4a12676c9ec8bc2c3adfa9600949f12c74333bb531c6e97ba36a29cb3d7afa5fe45905341bbdeffa70594818d126f4f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-advisor) \
python39-azure-mgmt-advisor \
python3dist(azure-mgmt-advisor)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
