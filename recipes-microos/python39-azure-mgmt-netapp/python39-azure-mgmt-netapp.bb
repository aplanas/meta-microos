SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python39-azure-mgmt-netapp-10.0.0-1.1.noarch.rpm"
RPM_HASH = "79b2d691a646fb2f9e66dd9acade647792c3126d58065cc77fd5d14d36e4772559fd15278c12facf1a4c17f7b30d5e6432b7e1ef70cecee02a6cc1482c506c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-netapp) python39-azure-mgmt-netapp python3dist(azure-mgmt-netapp)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
