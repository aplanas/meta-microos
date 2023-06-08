SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-mgmt-frontdoor-1.0.1-1.6.noarch.rpm"
RPM_HASH = "97190b65e4f2de8082e8571cbbc64c1c3c84ea32f66c5b92b83c7709fe0b5f01fcaea66767e85d5f295afa69eb574d8089b3b9cb6e19aae234d6b3016f4ef8f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-frontdoor) python311-azure-mgmt-frontdoor python3dist(azure-mgmt-frontdoor)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
