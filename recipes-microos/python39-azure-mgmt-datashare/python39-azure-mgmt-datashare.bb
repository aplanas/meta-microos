SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-datashare-1.0.0.0-1.13.noarch.rpm"
RPM_HASH = "c52b4a97dc029a3dc8a3171880076a964e473f65f069caf7d901f1ef68befc7e0fe4d16e1a14ba78ee7413372bd24d1ade9aa54968c3652c6a2c7447f38b50b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-datashare) \
python39-azure-mgmt-datashare \
python3dist(azure-mgmt-datashare)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
