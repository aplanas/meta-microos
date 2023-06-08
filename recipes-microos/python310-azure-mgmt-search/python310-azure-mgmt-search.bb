SUMMARY = "Microsoft Azure Search Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Search Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-azure-mgmt-search-9.0.0-1.3.noarch.rpm"
RPM_HASH = "7449339b9a43075ddb61d618ffc80e5ce4cfcd8d9e95f35744d8ed4b02eff961d2a3483bfa6d7bcafd305b33122c0a73915eb02d43b10765f91d2b11da932524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-search python3.10dist(azure-mgmt-search) python310-azure-mgmt-search python3dist(azure-mgmt-search)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
