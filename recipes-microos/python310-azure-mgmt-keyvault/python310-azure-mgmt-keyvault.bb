SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "python310-azure-mgmt-keyvault-10.2.1-1.1.noarch.rpm"
RPM_HASH = "03ac686dec25cafb03cc8f8f0905b5f59f2103a0b5d9e4848177e908818d91f183e878d7c68ab218264e34e47fa52d8e51d71c74ac0911acbfc3e2b0b4c60c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-keyvault python3.10dist(azure-mgmt-keyvault) python310-azure-mgmt-keyvault python3dist(azure-mgmt-keyvault)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
