SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-costmanagement-3.0.0-1.8.noarch.rpm"
RPM_HASH = "a590a45cf410f80c42570a1eaaf565b465a23c04ff8f340b0d70081a861a15870267802bb8c1ee27106806b89e24926e8d0463de6f2bced35f879db0d5060ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-costmanagement) python311-azure-mgmt-costmanagement python3dist(azure-mgmt-costmanagement)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
