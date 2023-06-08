SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-costmanagement-3.0.0-1.8.noarch.rpm"
RPM_HASH = "c516d694a49bcc79dd64f3600405250df2a350079ae99e1062e588c7bad2c9fbbf11f1b50edb19067dfd2837edd56d329e2bfb1656aa5c78d455758c9494b1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-costmanagement) python39-azure-mgmt-costmanagement python3dist(azure-mgmt-costmanagement)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
