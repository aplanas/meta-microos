SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "python39-azure-mgmt-keyvault-10.2.1-1.1.noarch.rpm"
RPM_HASH = "936a90d3c123fe648af3bfd42f5e352580e3f97a35a1ec86a09a0ebcb496e83ebcaa996e1e0600160afe190882078f3f7722855c9c0fd37d7bfee664f39d7e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-keyvault) python39-azure-mgmt-keyvault python3dist(azure-mgmt-keyvault)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
