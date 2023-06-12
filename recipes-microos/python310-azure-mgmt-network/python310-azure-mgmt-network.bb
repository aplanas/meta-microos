SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python310-azure-mgmt-network-23.1.0-1.1.noarch.rpm"
RPM_HASH = "aacd395198e577d11935562bbaede3a45500058fa9c196254fe2669bf2a6324842faa6ffd6a94495c84196dd2fa141cd1f237ee5ddb7f6bf48311e5bb5855e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-network python3.10dist(azure-mgmt-network) python310-azure-mgmt-network python3dist(azure-mgmt-network)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
