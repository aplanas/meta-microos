SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "python311-azure-mgmt-keyvault-10.2.1-1.1.noarch.rpm"
RPM_HASH = "6c3c01fdedbf3318919adfdfbec6b6b291861ec0265b08cf2a83e27915b3e5e3b6e9428949df521cdf99438a21b5abb3398832a4c30947e44af7751f92a47088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-keyvault) python311-azure-mgmt-keyvault python3dist(azure-mgmt-keyvault)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
