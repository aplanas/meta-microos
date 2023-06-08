SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-appplatform-8.0.0-1.1.noarch.rpm"
RPM_HASH = "d33037a30f5a82eaa7cc08f9e25b0dec539b1e10fed43989540758e29258dd71ede8b3b7ffe598d053ed6ad09158f7cb528d06b12f07eb28c7c186c789def65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-appplatform) python311-azure-mgmt-appplatform python3dist(azure-mgmt-appplatform)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
