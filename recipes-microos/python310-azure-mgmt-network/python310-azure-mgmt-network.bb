SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.0.1"

RPM_NAME = "python310-azure-mgmt-network-23.0.1-1.1.noarch.rpm"
RPM_HASH = "50bd93e2b348a822481ee3d5f39e4540b69e8aba2be738884ec6cfb9ea470f2e9a0987983b59f895531ca1e87a3f535d18cea87a87bd5fa35c8960518fcd87a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-network python3.10dist(azure-mgmt-network) python310-azure-mgmt-network python3dist(azure-mgmt-network)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
